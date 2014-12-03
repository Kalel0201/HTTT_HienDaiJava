package BLL;
import DAL.IGroupRepository;
import DTO.Group;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
@Service("groupService")
public class GroupService implements IGroupService{
	@Autowired
    IGroupRepository repository;    
    @Override
    public boolean add(Group group) {
        return repository.add(group);
    }
    @Override
    public boolean edit(Group group) {
        return repository.edit(group);
    }
    @Override
    public boolean delete(Object id) {
        return repository.delete(id);
    }

    @Override
    public Group get(Object id) {
        return repository.get(id);
    }
    @Override
    public List<Group> gets(Object obj) {
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
