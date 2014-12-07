package BLL;
import DTO.Topic;
import java.util.List;
public interface ITopicService {
    boolean add(Topic topic);
    boolean edit(Topic topic);
    boolean delete(Object id);
    Topic get(Object id);
    List<Topic> gets(Object obj);
	int count(Object obj);
	int page(Object obj);
    int page(int pageSize, Object obj);
}

