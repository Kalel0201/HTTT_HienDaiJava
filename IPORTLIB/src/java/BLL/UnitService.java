package BLL;
import DAL.IUnitRepository;
import DTO.Unit;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
@Service("unitService")
public class UnitService implements IUnitService{
	@Autowired
    IUnitRepository repository;    
    @Override
    public boolean add(Unit unit) {
        return repository.add(unit);
    }
    @Override
    public boolean edit(Unit unit) {
        return repository.edit(unit);
    }
    @Override
    public boolean delete(Object id) {
        return repository.delete(id);
    }

    @Override
    public Unit get(Object id) {
        return repository.get(id);
    }
    @Override
    public List<Unit> gets(Object obj) {
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
