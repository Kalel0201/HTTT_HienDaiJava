package BLL;
import DTO.Department;
import java.util.List;
public interface IDepartmentService {
    boolean add(Department department);
    boolean edit(Department department);
    boolean delete(Object id);
    Department get(Object id);
    List<Department> gets(Object obj);
	int count(Object obj);
	int page(Object obj);
    int page(int pageSize, Object obj);
}

