package BLL;
import DTO.Store;
import java.util.List;
public interface IStoreService {
    boolean add(Store store);
    boolean edit(Store store);
    boolean delete(Object id);
    Store get(Object id);
    List<Store> gets(Object obj);
	int count(Object obj);
	int page(Object obj);
    int page(int pageSize, Object obj);
}

