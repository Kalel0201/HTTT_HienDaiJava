package BLL;
import DTO.Publisher;
import java.util.List;
public interface IPublisherService {
    boolean add(Publisher publisher);
    boolean edit(Publisher publisher);
    boolean delete(Object id);
    Publisher get(Object id);
    List<Publisher> gets(Object obj);
	int count(Object obj);
	int page(Object obj);
    int page(int pageSize, Object obj);
}

