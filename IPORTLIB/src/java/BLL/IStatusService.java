package BLL;
import DTO.Status;
import java.util.List;
public interface IStatusService {
    boolean add(Status status);
    boolean edit(Status status);
    boolean delete(Object id);
    Status get(Object id);
    List<Status> gets(Object obj);
	int count(Object obj);
	int page(Object obj);
    int page(int pageSize, Object obj);
}

