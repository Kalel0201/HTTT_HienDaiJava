package BLL;
import DTO.Unit;
import java.util.List;
public interface IUnitService {
    boolean add(Unit unit);
    boolean edit(Unit unit);
    boolean delete(Object id);
    Unit get(Object id);
    List<Unit> gets(Object obj);
	int count(Object obj);
	int page(Object obj);
    int page(int pageSize, Object obj);
}

