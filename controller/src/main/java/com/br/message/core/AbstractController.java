package com.br.message.core;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

public class AbstractController<T>{

    @Autowired
    protected AbstractService<T> abstractService;

    @GetMapping
    public List<T> list (){
        return abstractService.list();
    }


}
