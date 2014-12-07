package DAL;
import DTO.Currency;
import java.sql.ResultSet;
import java.sql.SQLException;
@org.springframework.stereotype.Repository("currencyRepository")
public class CurrencyRepository extends Repository<Currency> implements ICurrencyRepository{
	@Override
    protected Currency getFromResultSet(ResultSet rs) throws SQLException {
        return new Currency(rs.getInt("CurrencyId"), rs.getString("CurrencyName"));
    }
	@Override
    protected void setGetParam(Object id) throws SQLException {
        callableStatement("{call GetCurrencyById(?)}");
        stmt.setInt("CurrencyId", (int) id);
    }
    @Override
    protected void setGetsParam(Object obj) throws SQLException{
        callableStatement("{call GetCurrencies()}");
    }
    @Override
    protected void setAddParam(Currency obj) throws SQLException{
        callableStatement("{call InsertCurrency(?, ?)}");
        stmt.registerOutParameter("CurrencyId", java.sql.Types.INTEGER);
    }    
    @Override
    protected void setReturnParam(Currency obj) throws SQLException {
        obj.setCurrencyId(stmt.getInt("CurrencyId"));
    }
    @Override
    protected void setEditParam(Currency obj) throws SQLException {
        callableStatement("{call UpdateCurrency(?, ?)}");
        stmt.setInt("CurrencyId", obj.getCurrencyId());
    }
    @Override
    protected void setDeleteParam(Object id) throws SQLException {
        callableStatement("{call DeleteCurrency(?)}");
        stmt.setInt("CurrencyId", (int) id);
    }
	@Override
    protected void setCountParam(Object obj) throws SQLException {
        callableStatement("{call CountCurrencies()}");
    }
	@Override
    protected void setParam(Currency obj) throws SQLException {
		stmt.setInt("CurrencyId", obj.getCurrencyId());
		stmt.setString("CurrencyName", obj.getCurrencyName());
	}
}
