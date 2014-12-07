package BLL;
import DAL.IPublicationRepository;
import DTO.Publication;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
@Service("publicationService")
public class PublicationService implements IPublicationService{
	@Autowired
    IPublicationRepository repository;    
    @Override
    public boolean add(Publication publication) {
        return repository.add(publication);
    }
    @Override
    public boolean edit(Publication publication) {
        return repository.edit(publication);
    }
    @Override
    public boolean delete(Object id) {
        return repository.delete(id);
    }

    @Override
    public Publication get(Object id) {
        return repository.get(id);
    }
    @Override
    public List<Publication> gets(Object obj) {
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
