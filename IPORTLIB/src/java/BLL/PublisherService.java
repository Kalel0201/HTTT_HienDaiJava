package BLL;
import DAL.IPublisherRepository;
import DTO.Publisher;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
@Service("publisherService")
public class PublisherService implements IPublisherService{
	@Autowired
    IPublisherRepository repository;    
    @Override
    public boolean add(Publisher publisher) {
        return repository.add(publisher);
    }
    @Override
    public boolean edit(Publisher publisher) {
        return repository.edit(publisher);
    }
    @Override
    public boolean delete(Object id) {
        return repository.delete(id);
    }

    @Override
    public Publisher get(Object id) {
        return repository.get(id);
    }
    @Override
    public List<Publisher> gets(Object obj) {
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
