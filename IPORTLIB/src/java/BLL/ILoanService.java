package BLL;
import DTO.Loan;
import java.util.List;
public interface ILoanService {
    boolean add(Loan loan);
    boolean edit(Loan loan);
    boolean delete(Object id);
    Loan get(Object id);
    List<Loan> gets(Object obj);
	int count(Object obj);
	int page(Object obj);
    int page(int pageSize, Object obj);
}

