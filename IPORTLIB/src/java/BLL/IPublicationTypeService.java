package BLL;
import DTO.PublicationType;
import java.util.List;
public interface IPublicationTypeService {
    boolean add(PublicationType publicationType);
    boolean edit(PublicationType publicationType);
    boolean delete(Object id);
    PublicationType get(Object id);
    List<PublicationType> gets(Object obj);
	int count(Object obj);
	int page(Object obj);
    int page(int pageSize, Object obj);
}

