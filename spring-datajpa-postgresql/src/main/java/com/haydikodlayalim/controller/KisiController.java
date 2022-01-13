package com.haydikodlayalim.controller;

import com.haydikodlayalim.dto.KisiDto;
import com.haydikodlayalim.entity.Kisi;
import com.haydikodlayalim.repo.KisiRepository;
import com.haydikodlayalim.service.KisiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/kisi")
public class KisiController {

    @Autowired
    KisiService kisiService;

    @PostMapping
    public ResponseEntity<KisiDto> kaydet(@RequestBody KisiDto kisiDto) {
        return ResponseEntity.ok(kisiService.save(kisiDto));
    }

    @GetMapping
    public ResponseEntity<List<KisiDto>> tumunuListele() {
        return ResponseEntity.ok(kisiService.getAll());
    }

}
