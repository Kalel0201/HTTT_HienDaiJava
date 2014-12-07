package BLL;
import DAL.IStatusRepository;
import DTO.Status;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
@Service("statusService")
public class StatusService implements IStatusService{
	@Autowired
    IStatusRepository repository;    
    @Override
    public boolean add(Status status) {
        return repository.add(status);
    }
    @Override
    public boolean edit(Status status) {
        return repository.edit(status);
    }
    @Override
    public boolean delete(Object id) {
        return repository.delete(id);
    }

    @Override
    public Status get(Object id) {
        return repository.get(id);
    }
    @Override
    public List<Status> gets(Object obj) {
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
