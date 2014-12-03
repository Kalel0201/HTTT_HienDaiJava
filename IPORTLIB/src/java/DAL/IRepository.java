package DAL;
import java.util.List;
public interface IRepository<T> {
    boolean add(T obj);
    boolean edit(T obj);
    boolean delete(Object id);
    T get(Object id);
    List<T> gets(Object obj);
    int count(Object obj);
    int page(Object obj);
    int page(int pageSize, Object obj);
}
