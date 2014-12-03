package DAL;
import DTO.Province;
import java.sql.ResultSet;
import java.sql.SQLException;
@org.springframework.stereotype.Repository("provinceRepository")
public class ProvinceRepository extends Repository<Province> implements IProvinceRepository{
	@Override
    protected Province getFromResultSet(ResultSet rs) throws SQLException {
        return new Province(rs.getInt("ProvinceId"), rs.getInt("CountryId"), rs.getString("ProvinceNo"), rs.getString("ProvinceName"));
    }
	@Override
    protected void setGetParam(Object id) throws SQLException {
        callableStatement("{call GetProvinceById(?)}");
        stmt.setInt("ProvinceId", (int) id);
    }
    @Override
    protected void setGetsParam(Object obj) throws SQLException{
        callableStatement("{call GetProvinces()}");
    }
    @Override
    protected void setAddParam(Province obj) throws SQLException{
        callableStatement("{call InsertProvince(?, ?, ?, ?)}");
        stmt.registerOutParameter("ProvinceId", java.sql.Types.INTEGER);
    }    
    @Override
    protected void setReturnParam(Province obj) throws SQLException {
        obj.setProvinceId(stmt.getInt("ProvinceId"));
    }
    @Override
    protected void setEditParam(Province obj) throws SQLException {
        callableStatement("{call UpdateProvince(?, ?, ?, ?)}");
        stmt.setInt("ProvinceId", obj.getProvinceId());
    }
    @Override
    protected void setDeleteParam(Object id) throws SQLException {
        callableStatement("{call DeleteProvince(?)}");
        stmt.setInt("ProvinceId", (int) id);
    }
	@Override
    protected void setCountParam(Object obj) throws SQLException {
        callableStatement("{call CountProvinces()}");
    }
	@Override
    protected void setParam(Province obj) throws SQLException {
		stmt.setInt("ProvinceId", obj.getProvinceId());
		stmt.setInt("CountryId", obj.getCountryId());
		stmt.setString("ProvinceNo", obj.getProvinceNo());
		stmt.setString("ProvinceName", obj.getProvinceName());
	}
}
