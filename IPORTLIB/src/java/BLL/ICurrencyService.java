package BLL;
import DTO.Currency;
import java.util.List;
public interface ICurrencyService {
    boolean add(Currency currency);
    boolean edit(Currency currency);
    boolean delete(Object id);
    Currency get(Object id);
    List<Currency> gets(Object obj);
	int count(Object obj);
	int page(Object obj);
    int page(int pageSize, Object obj);
}

