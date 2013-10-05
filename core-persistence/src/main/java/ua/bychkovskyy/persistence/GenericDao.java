package ua.bychkovskyy.persistence;


public interface GenericDao<T> {
    T find(Object pk);

    void delete(T entity);

    T save(T entity);

    void update(T entity);
}
