package com.br.message.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.br.message.core.AbstractController;
import com.br.message.model.SendConfig;
import com.br.message.services.Menssageservices;

import lombok.AllArgsConstructor;

@RequestMapping("message")
@RestController
@AllArgsConstructor
public class MenssageController extends AbstractController<SendConfig> {

    private Menssageservices menssageservices;

    @PostMapping
    public void insert(@RequestBody SendConfig sendConfig) throws Exception {
        menssageservices.insert(sendConfig); 
    }
}
