package BLL;
import DAL.ISupplierRepository;
import DTO.Supplier;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
@Service("supplierService")
public class SupplierService implements ISupplierService{
	@Autowired
    ISupplierRepository repository;    
    @Override
    public boolean add(Supplier supplier) {
        return repository.add(supplier);
    }
    @Override
    public boolean edit(Supplier supplier) {
        return repository.edit(supplier);
    }
    @Override
    public boolean delete(Object id) {
        return repository.delete(id);
    }

    @Override
    public Supplier get(Object id) {
        return repository.get(id);
    }
    @Override
    public List<Supplier> gets(Object obj) {
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
