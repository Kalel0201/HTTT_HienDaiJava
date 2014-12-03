package DAL;
import DTO.Unit;
import java.sql.ResultSet;
import java.sql.SQLException;
@org.springframework.stereotype.Repository("unitRepository")
public class UnitRepository extends Repository<Unit> implements IUnitRepository{
	@Override
    protected Unit getFromResultSet(ResultSet rs) throws SQLException {
        return new Unit(rs.getInt("UnitId"), rs.getString("UnitName"));
    }
	@Override
    protected void setGetParam(Object id) throws SQLException {
        callableStatement("{call GetUnitById(?)}");
        stmt.setInt("UnitId", (int) id);
    }
    @Override
    protected void setGetsParam(Object obj) throws SQLException{
        callableStatement("{call GetUnits()}");
    }
    @Override
    protected void setAddParam(Unit obj) throws SQLException{
        callableStatement("{call InsertUnit(?, ?)}");
        stmt.registerOutParameter("UnitId", java.sql.Types.INTEGER);
    }    
    @Override
    protected void setReturnParam(Unit obj) throws SQLException {
        obj.setUnitId(stmt.getInt("UnitId"));
    }
    @Override
    protected void setEditParam(Unit obj) throws SQLException {
        callableStatement("{call UpdateUnit(?, ?)}");
        stmt.setInt("UnitId", obj.getUnitId());
    }
    @Override
    protected void setDeleteParam(Object id) throws SQLException {
        callableStatement("{call DeleteUnit(?)}");
        stmt.setInt("UnitId", (int) id);
    }
	@Override
    protected void setCountParam(Object obj) throws SQLException {
        callableStatement("{call CountUnits()}");
    }
	@Override
    protected void setParam(Unit obj) throws SQLException {
		stmt.setInt("UnitId", obj.getUnitId());
		stmt.setString("UnitName", obj.getUnitName());
	}
}
