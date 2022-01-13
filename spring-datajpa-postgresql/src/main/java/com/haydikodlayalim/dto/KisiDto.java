package com.haydikodlayalim.dto;

import com.haydikodlayalim.entity.Adres;
import lombok.Data;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;

@Data
public class KisiDto {

    private Long id;

    private String adi;

    private String soyadi;

    private List<String> adresler;
}
