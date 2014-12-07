package BLL;
import DTO.LoanDetail;
import java.util.List;
public interface ILoanDetailService {
    boolean add(LoanDetail loanDetail);
    boolean edit(LoanDetail loanDetail);
    boolean delete(Object id);
    LoanDetail get(Object id);
    List<LoanDetail> gets(Object obj);
	int count(Object obj);
	int page(Object obj);
    int page(int pageSize, Object obj);
}

