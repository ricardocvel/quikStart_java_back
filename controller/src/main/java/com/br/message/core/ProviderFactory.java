package com.br.message.core;

import java.util.List;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.br.message.model.EsendConfig;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Service
@AllArgsConstructor
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
@Getter
public class ProviderFactory {

    private List<AbstractSend> listAbstractSends;

    public AbstractSend get(EsendConfig esendConfig) throws Exception {
       return listAbstractSends.stream()
       .filter(provider-> provider.sendType().equals(esendConfig))
       .findFirst()
       .orElseThrow(() -> new Exception("não tem implemnetação de "+ esendConfig.toString()));
    }
}
