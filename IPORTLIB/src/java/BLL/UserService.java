package BLL;
import DAL.IUserRepository;
import DTO.User;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
@Service("userService")
public class UserService implements IUserService{
	@Autowired
    IUserRepository repository;    
    @Override
    public boolean add(User user) {
        return repository.add(user);
    }
    @Override
    public boolean edit(User user) {
        return repository.edit(user);
    }
    @Override
    public boolean delete(Object id) {
        return repository.delete(id);
    }

    @Override
    public User get(Object id) {
        return repository.get(id);
    }
    @Override
    public List<User> gets(Object obj) {
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
