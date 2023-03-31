package com.br.message.services.provider;

import org.springframework.stereotype.Service;

import com.br.message.core.AbstractSend;
import com.br.message.model.EsendConfig;
import com.br.message.model.SendConfig;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ProviderSms extends AbstractSend{

    @Override
    public void sendMessage(SendConfig sendConfig) {
        log.debug("EnvidoSMS: " + sendConfig.getMessage());
    }

    @Override
    public EsendConfig sendType() {
        return EsendConfig.SMS;
    }
    
}
