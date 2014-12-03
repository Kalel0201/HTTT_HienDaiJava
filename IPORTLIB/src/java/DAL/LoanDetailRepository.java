package DAL;
import DTO.LoanDetail;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
@org.springframework.stereotype.Repository("loanDetailRepository")
public class LoanDetailRepository extends Repository<LoanDetail> implements ILoanDetailRepository{
	@Override
    protected LoanDetail getFromResultSet(ResultSet rs) throws SQLException {
        return new LoanDetail(rs.getInt("LoanDetailId"), rs.getInt("LoanId"), rs.getInt("BookId"), rs.getDate("DateLoan"), rs.getDate("DatePay"));
    }
	@Override
    protected void setGetParam(Object id) throws SQLException {
        callableStatement("{call GetLoanDetailById(?)}");
        stmt.setInt("LoanDetailId", (int) id);
    }
    @Override
    protected void setGetsParam(Object obj) throws SQLException{
        callableStatement("{call GetLoanDetails()}");
    }
    @Override
    protected void setAddParam(LoanDetail obj) throws SQLException{
        callableStatement("{call InsertLoanDetail(?, ?, ?, ?, ?)}");
        stmt.registerOutParameter("LoanDetailId", java.sql.Types.INTEGER);
    }    
    @Override
    protected void setReturnParam(LoanDetail obj) throws SQLException {
        obj.setLoanDetailId(stmt.getInt("LoanDetailId"));
    }
    @Override
    protected void setEditParam(LoanDetail obj) throws SQLException {
        callableStatement("{call UpdateLoanDetail(?, ?, ?, ?, ?)}");
        stmt.setInt("LoanDetailId", obj.getLoanDetailId());
    }
    @Override
    protected void setDeleteParam(Object id) throws SQLException {
        callableStatement("{call DeleteLoanDetail(?)}");
        stmt.setInt("LoanDetailId", (int) id);
    }
	@Override
    protected void setCountParam(Object obj) throws SQLException {
        callableStatement("{call CountLoanDetails()}");
    }
	@Override
    protected void setParam(LoanDetail obj) throws SQLException {
		stmt.setInt("LoanDetailId", obj.getLoanDetailId());
		stmt.setInt("LoanId", obj.getLoanId());
		stmt.setInt("BookId", obj.getBookId());
		stmt.setDate("DateLoan", (Date) obj.getDateLoan());
		stmt.setDate("DatePay", (Date) obj.getDatePay());
	}
}
