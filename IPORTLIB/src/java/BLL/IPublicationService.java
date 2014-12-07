package BLL;
import DTO.Publication;
import java.util.List;
public interface IPublicationService {
    boolean add(Publication publication);
    boolean edit(Publication publication);
    boolean delete(Object id);
    Publication get(Object id);
    List<Publication> gets(Object obj);
	int count(Object obj);
	int page(Object obj);
    int page(int pageSize, Object obj);
}

