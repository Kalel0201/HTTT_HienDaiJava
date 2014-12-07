package BLL;
import DTO.Major;
import java.util.List;
public interface IMajorService {
    boolean add(Major major);
    boolean edit(Major major);
    boolean delete(Object id);
    Major get(Object id);
    List<Major> gets(Object obj);
	int count(Object obj);
	int page(Object obj);
    int page(int pageSize, Object obj);
}

