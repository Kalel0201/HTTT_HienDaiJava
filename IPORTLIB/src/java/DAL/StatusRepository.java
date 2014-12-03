package DAL;
import DTO.Status;
import java.sql.ResultSet;
import java.sql.SQLException;
@org.springframework.stereotype.Repository("statusRepository")
public class StatusRepository extends Repository<Status> implements IStatusRepository{
	@Override
    protected Status getFromResultSet(ResultSet rs) throws SQLException {
        return new Status(rs.getInt("StatusId"), rs.getString("StatusName"));
    }
	@Override
    protected void setGetParam(Object id) throws SQLException {
        callableStatement("{call GetStatusById(?)}");
        stmt.setInt("StatusId", (int) id);
    }
    @Override
    protected void setGetsParam(Object obj) throws SQLException{
        callableStatement("{call GetStatuses()}");
    }
    @Override
    protected void setAddParam(Status obj) throws SQLException{
        callableStatement("{call InsertStatus(?, ?)}");
        stmt.registerOutParameter("StatusId", java.sql.Types.INTEGER);
    }    
    @Override
    protected void setReturnParam(Status obj) throws SQLException {
        obj.setStatusId(stmt.getInt("StatusId"));
    }
    @Override
    protected void setEditParam(Status obj) throws SQLException {
        callableStatement("{call UpdateStatus(?, ?)}");
        stmt.setInt("StatusId", obj.getStatusId());
    }
    @Override
    protected void setDeleteParam(Object id) throws SQLException {
        callableStatement("{call DeleteStatus(?)}");
        stmt.setInt("StatusId", (int) id);
    }
	@Override
    protected void setCountParam(Object obj) throws SQLException {
        callableStatement("{call CountStatuses()}");
    }
	@Override
    protected void setParam(Status obj) throws SQLException {
		stmt.setInt("StatusId", obj.getStatusId());
		stmt.setString("StatusName", obj.getStatusName());
	}
}
