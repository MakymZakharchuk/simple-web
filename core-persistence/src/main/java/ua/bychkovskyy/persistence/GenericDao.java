package ua.bychkovskyy.persistence;


public interface GenericDao<T> {
    T find(Object pk);

    void delete(T entity);

    void save(T entity);

    T update(T entity);
}
