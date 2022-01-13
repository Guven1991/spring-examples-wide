package com.haydikodlayalim.entity;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "kisi")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Kisi {


    @Id
    @SequenceGenerator(name = "seq_kisi", allocationSize = 1)
    @GeneratedValue(generator = "seq_kisi", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(length = 100, name = "adi")
    private String adi;

    @Column(length = 100, name = "soyadi")
    private String soyadi;

    @OneToMany
    @JoinColumn(name = "kisi_adres_id")
    @ToString.Exclude
    private List<Adres> adresleri;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Kisi kisi = (Kisi) o;
        return id != null && Objects.equals(id, kisi.id);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
