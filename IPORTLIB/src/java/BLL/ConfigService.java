package BLL;
import DAL.IConfigRepository;
import DTO.Config;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
@Service("configService")
public class ConfigService implements IConfigService{
	@Autowired
    IConfigRepository repository;    
    @Override
    public boolean add(Config config) {
        return repository.add(config);
    }
    @Override
    public boolean edit(Config config) {
        return repository.edit(config);
    }
    @Override
    public boolean delete(Object id) {
        return repository.delete(id);
    }

    @Override
    public Config get(Object id) {
        return repository.get(id);
    }
    @Override
    public List<Config> gets(Object obj) {
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
