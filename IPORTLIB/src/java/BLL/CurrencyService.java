package BLL;
import DAL.ICurrencyRepository;
import DTO.Currency;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
@Service("currencyService")
public class CurrencyService implements ICurrencyService{
	@Autowired
    ICurrencyRepository repository;    
    @Override
    public boolean add(Currency currency) {
        return repository.add(currency);
    }
    @Override
    public boolean edit(Currency currency) {
        return repository.edit(currency);
    }
    @Override
    public boolean delete(Object id) {
        return repository.delete(id);
    }

    @Override
    public Currency get(Object id) {
        return repository.get(id);
    }
    @Override
    public List<Currency> gets(Object obj) {
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
