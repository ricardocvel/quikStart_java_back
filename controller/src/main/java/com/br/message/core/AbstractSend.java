package com.br.message.core;

import com.br.message.model.EsendConfig;
import com.br.message.model.SendConfig;

public abstract class AbstractSend { 
    

    public abstract void sendMessage(SendConfig sendConfig);
    
    public abstract EsendConfig sendType();

    
}
