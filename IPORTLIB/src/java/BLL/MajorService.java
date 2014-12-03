package BLL;
import DAL.IMajorRepository;
import DTO.Major;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
@Service("majorService")
public class MajorService implements IMajorService{
	@Autowired
    IMajorRepository repository;    
    @Override
    public boolean add(Major major) {
        return repository.add(major);
    }
    @Override
    public boolean edit(Major major) {
        return repository.edit(major);
    }
    @Override
    public boolean delete(Object id) {
        return repository.delete(id);
    }

    @Override
    public Major get(Object id) {
        return repository.get(id);
    }
    @Override
    public List<Major> gets(Object obj) {
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
