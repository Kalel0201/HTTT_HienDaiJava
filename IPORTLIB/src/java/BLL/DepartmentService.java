package BLL;
import DAL.IDepartmentRepository;
import DTO.Department;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
@Service("departmentService")
public class DepartmentService implements IDepartmentService{
	@Autowired
    IDepartmentRepository repository;    
    @Override
    public boolean add(Department department) {
        return repository.add(department);
    }
    @Override
    public boolean edit(Department department) {
        return repository.edit(department);
    }
    @Override
    public boolean delete(Object id) {
        return repository.delete(id);
    }

    @Override
    public Department get(Object id) {
        return repository.get(id);
    }
    @Override
    public List<Department> gets(Object obj) {
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
