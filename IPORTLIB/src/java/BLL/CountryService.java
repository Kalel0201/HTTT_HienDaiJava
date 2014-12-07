package BLL;
import DAL.ICountryRepository;
import DTO.Country;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
@Service("countryService")
public class CountryService implements ICountryService{
	@Autowired
    ICountryRepository repository;    
    @Override
    public boolean add(Country country) {
        return repository.add(country);
    }
    @Override
    public boolean edit(Country country) {
        return repository.edit(country);
    }
    @Override
    public boolean delete(Object id) {
        return repository.delete(id);
    }

    @Override
    public Country get(Object id) {
        return repository.get(id);
    }
    @Override
    public List<Country> gets(Object obj) {
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
