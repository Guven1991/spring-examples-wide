package com.haydikodlayalim.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashMap;

@Data
@Document  //Spring -mongodb anotationı bunun bir collectiona denk geleceğini  gösterir
public class Kullanici {

    @Id
    private String id;
    private String adi;
    private String soyadi;
    private HashMap ozellikleri;
}
