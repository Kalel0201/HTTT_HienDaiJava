package BLL;
import DAL.ILoanDetailRepository;
import DTO.LoanDetail;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
@Service("loanDetailService")
public class LoanDetailService implements ILoanDetailService{
	@Autowired
    ILoanDetailRepository repository;    
    @Override
    public boolean add(LoanDetail loanDetail) {
        return repository.add(loanDetail);
    }
    @Override
    public boolean edit(LoanDetail loanDetail) {
        return repository.edit(loanDetail);
    }
    @Override
    public boolean delete(Object id) {
        return repository.delete(id);
    }

    @Override
    public LoanDetail get(Object id) {
        return repository.get(id);
    }
    @Override
    public List<LoanDetail> gets(Object obj) {
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
