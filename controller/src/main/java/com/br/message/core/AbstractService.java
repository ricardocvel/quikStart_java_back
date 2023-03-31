package com.br.message.core;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class AbstractService <T>{

    @Autowired
    protected AbstractDAO<T> abstractDAO;
    public List<T> list(){
        return abstractDAO.list();
    }
    
}
