package mybank.zealous;

import java.util.List;

public interface CrudRepository<T> {
    String save(T Object);
    String update(T Object);
    void delete(T Object);
    List<T> view();
}
