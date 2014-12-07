package BLL;
import DTO.Country;
import java.util.List;
public interface ICountryService {
    boolean add(Country country);
    boolean edit(Country country);
    boolean delete(Object id);
    Country get(Object id);
    List<Country> gets(Object obj);
	int count(Object obj);
	int page(Object obj);
    int page(int pageSize, Object obj);
}

