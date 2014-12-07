package BLL;
import DTO.Province;
import java.util.List;
public interface IProvinceService {
    boolean add(Province province);
    boolean edit(Province province);
    boolean delete(Object id);
    Province get(Object id);
    List<Province> gets(Object obj);
	int count(Object obj);
	int page(Object obj);
    int page(int pageSize, Object obj);
}

