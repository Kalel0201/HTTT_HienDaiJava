package DAL;
import DTO.Loan;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
@org.springframework.stereotype.Repository("loanRepository")
public class LoanRepository extends Repository<Loan> implements ILoanRepository{
	@Override
    protected Loan getFromResultSet(ResultSet rs) throws SQLException {
        return new Loan(rs.getInt("LoanId"), rs.getDate("DateCreated"), rs.getInt("UserId"));
    }
	@Override
    protected void setGetParam(Object id) throws SQLException {
        callableStatement("{call GetLoanById(?)}");
        stmt.setInt("LoanId", (int) id);
    }
    @Override
    protected void setGetsParam(Object obj) throws SQLException{
        callableStatement("{call GetLoans()}");
    }
    @Override
    protected void setAddParam(Loan obj) throws SQLException{
        callableStatement("{call InsertLoan(?, ?, ?)}");
        stmt.registerOutParameter("LoanId", java.sql.Types.INTEGER);
    }    
    @Override
    protected void setReturnParam(Loan obj) throws SQLException {
        obj.setLoanId(stmt.getInt("LoanId"));
    }
    @Override
    protected void setEditParam(Loan obj) throws SQLException {
        callableStatement("{call UpdateLoan(?, ?, ?)}");
        stmt.setInt("LoanId", obj.getLoanId());
    }
    @Override
    protected void setDeleteParam(Object id) throws SQLException {
        callableStatement("{call DeleteLoan(?)}");
        stmt.setInt("LoanId", (int) id);
    }
	@Override
    protected void setCountParam(Object obj) throws SQLException {
        callableStatement("{call CountLoans()}");
    }
	@Override
    protected void setParam(Loan obj) throws SQLException {
		stmt.setInt("LoanId", obj.getLoanId());
		stmt.setDate("DateCreated", (Date) obj.getDateCreated());
		stmt.setInt("UserId", obj.getUserId());
	}
}
