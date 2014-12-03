package DAL;
import DTO.Country;
import java.sql.ResultSet;
import java.sql.SQLException;
@org.springframework.stereotype.Repository("countryRepository")
public class CountryRepository extends Repository<Country> implements ICountryRepository{
	@Override
    protected Country getFromResultSet(ResultSet rs) throws SQLException {
        return new Country(rs.getInt("CountryId"), rs.getString("CountryName"));
    }
	@Override
    protected void setGetParam(Object id) throws SQLException {
        callableStatement("{call GetCountryById(?)}");
        stmt.setInt("CountryId", (int) id);
    }
    @Override
    protected void setGetsParam(Object obj) throws SQLException{
        callableStatement("{call GetCountries()}");
    }
    @Override
    protected void setAddParam(Country obj) throws SQLException{
        callableStatement("{call InsertCountry(?, ?)}");
        stmt.registerOutParameter("CountryId", java.sql.Types.INTEGER);
    }    
    @Override
    protected void setReturnParam(Country obj) throws SQLException {
        obj.setCountryId(stmt.getInt("CountryId"));
    }
    @Override
    protected void setEditParam(Country obj) throws SQLException {
        callableStatement("{call UpdateCountry(?, ?)}");
        stmt.setInt("CountryId", obj.getCountryId());
    }
    @Override
    protected void setDeleteParam(Object id) throws SQLException {
        callableStatement("{call DeleteCountry(?)}");
        stmt.setInt("CountryId", (int) id);
    }
	@Override
    protected void setCountParam(Object obj) throws SQLException {
        callableStatement("{call CountCountries()}");
    }
	@Override
    protected void setParam(Country obj) throws SQLException {
		stmt.setInt("CountryId", obj.getCountryId());
		stmt.setString("CountryName", obj.getCountryName());
	}
}
