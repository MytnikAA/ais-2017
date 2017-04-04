package dao;

import java.util.List;

public interface DAO<T> {
    
    Integer create(T entity);
    
    T read(Integer id);
    
    List<T> readAll();
    
    void update(T entity);
    
    void delete(T entity);
    
}
