package DAL;
import DTO.Major;
import java.sql.ResultSet;
import java.sql.SQLException;
@org.springframework.stereotype.Repository("majorRepository")
public class MajorRepository extends Repository<Major> implements IMajorRepository{
	@Override
    protected Major getFromResultSet(ResultSet rs) throws SQLException {
        return new Major(rs.getInt("MajorId"), rs.getString("MajorName"));
    }
	@Override
    protected void setGetParam(Object id) throws SQLException {
        callableStatement("{call GetMajorById(?)}");
        stmt.setInt("MajorId", (int) id);
    }
    @Override
    protected void setGetsParam(Object obj) throws SQLException{
        callableStatement("{call GetMajors()}");
    }
    @Override
    protected void setAddParam(Major obj) throws SQLException{
        callableStatement("{call InsertMajor(?, ?)}");
        stmt.registerOutParameter("MajorId", java.sql.Types.INTEGER);
    }    
    @Override
    protected void setReturnParam(Major obj) throws SQLException {
        obj.setMajorId(stmt.getInt("MajorId"));
    }
    @Override
    protected void setEditParam(Major obj) throws SQLException {
        callableStatement("{call UpdateMajor(?, ?)}");
        stmt.setInt("MajorId", obj.getMajorId());
    }
    @Override
    protected void setDeleteParam(Object id) throws SQLException {
        callableStatement("{call DeleteMajor(?)}");
        stmt.setInt("MajorId", (int) id);
    }
	@Override
    protected void setCountParam(Object obj) throws SQLException {
        callableStatement("{call CountMajors()}");
    }
	@Override
    protected void setParam(Major obj) throws SQLException {
		stmt.setInt("MajorId", obj.getMajorId());
		stmt.setString("MajorName", obj.getMajorName());
	}
}
