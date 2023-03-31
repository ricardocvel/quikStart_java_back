package com.br.message.services;

import org.springframework.stereotype.Service;

import com.br.message.core.AbstractSend;
import com.br.message.core.ProviderFactory;
import com.br.message.model.SendConfig;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@AllArgsConstructor
public class SendService {

    private ProviderFactory providerFactory;
    public void send(SendConfig sendConfig) throws Exception {
        AbstractSend provider =  providerFactory.get(sendConfig.getSendConfigType());
        provider.sendMessage(sendConfig);
        log.info("Enviado");
    }
    
}
