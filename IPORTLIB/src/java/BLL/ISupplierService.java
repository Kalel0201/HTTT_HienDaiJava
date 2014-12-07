package BLL;
import DTO.Supplier;
import java.util.List;
public interface ISupplierService {
    boolean add(Supplier supplier);
    boolean edit(Supplier supplier);
    boolean delete(Object id);
    Supplier get(Object id);
    List<Supplier> gets(Object obj);
	int count(Object obj);
	int page(Object obj);
    int page(int pageSize, Object obj);
}

