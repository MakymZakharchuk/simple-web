package ua.bychkovskyy.persistence.impl;


import ua.bychkovskyy.persistence.GenericDao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class AbstractDao<T> implements GenericDao<T> {

    @PersistenceContext
    private EntityManager em;

    private Class<T> persistenceClass;

    @Override
    public T find(Object pk) {
        return em.find(persistenceClass, pk);
    }

    @Override
    public void delete(T entity) {
        em.remove(entity);
    }

    @Override
    public void save(T entity) {
        em.persist(entity);
    }

    @Override
    public T update(T entity) {
        return em.merge(entity);
    }

    public void setPersistenceClass(Class<T> persistenceClass) {
        this.persistenceClass = persistenceClass;
    }
}
