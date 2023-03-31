package com.br.message.core;

import java.lang.reflect.ParameterizedType;
import java.util.List;
import javax.transaction.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Transactional
public class AbstractDAO <T> {
    
    @PersistenceContext
    protected EntityManager entityManager;
    private final Class<T> clazz;
    
    @SuppressWarnings("unchecked")
    public AbstractDAO(){
        this.clazz = (Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0] ;
    }

    public List<T> list(){
        final var query = entityManager.getCriteriaBuilder().createQuery(clazz);
        query.from(clazz);
        return entityManager.createQuery(query).getResultList();
    }

    public void insert (T model){
        entityManager.persist(model);
        entityManager.flush();
    }
    		
}
