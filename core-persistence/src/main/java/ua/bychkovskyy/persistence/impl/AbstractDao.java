package ua.bychkovskyy.persistence.impl;


import ua.bychkovskyy.persistence.GenericDao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class AbstractDao<T> implements GenericDao<T> {

    @PersistenceContext
    private EntityManager entityManager;

}
