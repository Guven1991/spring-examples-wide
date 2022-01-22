package com.guven.aop.service;

import org.springframework.stereotype.Service;

@Service
public class MessageService {
    public String mesajVer(String param){
        System.out.println("metot mesaj verdi param: "+param);
        return param;
    }
}
