package com.br.message.services;

import org.springframework.stereotype.Service;

import com.br.message.core.AbstractService;
import com.br.message.model.SendConfig;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@AllArgsConstructor
public class Menssageservices extends AbstractService<SendConfig> {

    private SendService sendService;

    public void insert(SendConfig sendConfig) throws Exception {
        abstractDAO.insert(sendConfig);
        sendService.send(sendConfig);
        
    }

}
