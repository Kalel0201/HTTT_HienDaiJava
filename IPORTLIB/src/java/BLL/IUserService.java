package BLL;
import DTO.User;
import java.util.List;
public interface IUserService {
    boolean add(User user);
    boolean edit(User user);
    boolean delete(Object id);
    User get(Object id);
    List<User> gets(Object obj);
	int count(Object obj);
	int page(Object obj);
    int page(int pageSize, Object obj);
}

