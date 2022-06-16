package com.billpost.billpost.controller;

import com.billpost.billpost.service.KasaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * KasaController
 *
 * @author Şafak Taşkın
 * @since 1.0.0
 */


@RestController
public class KasaController {

    @Autowired
    KasaService cityEntityService;

    @GetMapping(path = "/deneme")
    public String String(){
        return "deneme";
    }

}
