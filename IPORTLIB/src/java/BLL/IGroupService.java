package BLL;
import DTO.Group;
import java.util.List;
public interface IGroupService {
    boolean add(Group group);
    boolean edit(Group group);
    boolean delete(Object id);
    Group get(Object id);
    List<Group> gets(Object obj);
	int count(Object obj);
	int page(Object obj);
    int page(int pageSize, Object obj);
}

