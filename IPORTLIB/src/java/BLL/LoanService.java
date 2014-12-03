package BLL;
import DAL.ILoanRepository;
import DTO.Loan;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
@Service("loanService")
public class LoanService implements ILoanService{
	@Autowired
    ILoanRepository repository;    
    @Override
    public boolean add(Loan loan) {
        return repository.add(loan);
    }
    @Override
    public boolean edit(Loan loan) {
        return repository.edit(loan);
    }
    @Override
    public boolean delete(Object id) {
        return repository.delete(id);
    }

    @Override
    public Loan get(Object id) {
        return repository.get(id);
    }
    @Override
    public List<Loan> gets(Object obj) {
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
