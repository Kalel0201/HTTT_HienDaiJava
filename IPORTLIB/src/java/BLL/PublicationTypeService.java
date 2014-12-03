package BLL;
import DAL.IPublicationTypeRepository;
import DTO.PublicationType;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
@Service("publicationTypeService")
public class PublicationTypeService implements IPublicationTypeService{
	@Autowired
    IPublicationTypeRepository repository;    
    @Override
    public boolean add(PublicationType publicationType) {
        return repository.add(publicationType);
    }
    @Override
    public boolean edit(PublicationType publicationType) {
        return repository.edit(publicationType);
    }
    @Override
    public boolean delete(Object id) {
        return repository.delete(id);
    }

    @Override
    public PublicationType get(Object id) {
        return repository.get(id);
    }
    @Override
    public List<PublicationType> gets(Object obj) {
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
