package BLL;
import DAL.IStoreRepository;
import DTO.Store;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
@Service("storeService")
public class StoreService implements IStoreService{
	@Autowired
    IStoreRepository repository;    
    @Override
    public boolean add(Store store) {
        return repository.add(store);
    }
    @Override
    public boolean edit(Store store) {
        return repository.edit(store);
    }
    @Override
    public boolean delete(Object id) {
        return repository.delete(id);
    }

    @Override
    public Store get(Object id) {
        return repository.get(id);
    }
    @Override
    public List<Store> gets(Object obj) {
        return repository.gets(obj);
    }
	@Override
    public int count(Object obj) {
        return repository.count(obj);
    }
	@Override
    public int page(Object obj) {
        return repository.page(obj);
    }
    @Override
    public int page(int pageSize, Object obj) {
        return repository.page(pageSize, obj);
    }
}
