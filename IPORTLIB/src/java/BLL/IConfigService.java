package BLL;
import DTO.Config;
import java.util.List;
public interface IConfigService {
    boolean add(Config config);
    boolean edit(Config config);
    boolean delete(Object id);
    Config get(Object id);
    List<Config> gets(Object obj);
	int count(Object obj);
	int page(Object obj);
    int page(int pageSize, Object obj);
}

