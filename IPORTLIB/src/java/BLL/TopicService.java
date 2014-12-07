package BLL;
import DAL.ITopicRepository;
import DTO.Topic;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
@Service("topicService")
public class TopicService implements ITopicService{
	@Autowired
    ITopicRepository repository;    
    @Override
    public boolean add(Topic topic) {
        return repository.add(topic);
    }
    @Override
    public boolean edit(Topic topic) {
        return repository.edit(topic);
    }
    @Override
    public boolean delete(Object id) {
        return repository.delete(id);
    }

    @Override
    public Topic get(Object id) {
        return repository.get(id);
    }
    @Override
    public List<Topic> gets(Object obj) {
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
