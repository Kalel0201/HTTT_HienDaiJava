package DAL;
import DTO.Group;
import java.sql.ResultSet;
import java.sql.SQLException;
@org.springframework.stereotype.Repository("groupRepository")
public class GroupRepository extends Repository<Group> implements IGroupRepository{
	@Override
    protected Group getFromResultSet(ResultSet rs) throws SQLException {
        return new Group(rs.getInt("GroupId"), rs.getString("GroupName"));
    }
	@Override
    protected void setGetParam(Object id) throws SQLException {
        callableStatement("{call GetGroupById(?)}");
        stmt.setInt("GroupId", (int) id);
    }
    @Override
    protected void setGetsParam(Object obj) throws SQLException{
        callableStatement("{call GetGroups()}");
    }
    @Override
    protected void setAddParam(Group obj) throws SQLException{
        callableStatement("{call InsertGroup(?, ?)}");
        stmt.registerOutParameter("GroupId", java.sql.Types.INTEGER);
    }    
    @Override
    protected void setReturnParam(Group obj) throws SQLException {
        obj.setGroupId(stmt.getInt("GroupId"));
    }
    @Override
    protected void setEditParam(Group obj) throws SQLException {
        callableStatement("{call UpdateGroup(?, ?)}");
        stmt.setInt("GroupId", obj.getGroupId());
    }
    @Override
    protected void setDeleteParam(Object id) throws SQLException {
        callableStatement("{call DeleteGroup(?)}");
        stmt.setInt("GroupId", (int) id);
    }
	@Override
    protected void setCountParam(Object obj) throws SQLException {
        callableStatement("{call CountGroups()}");
    }
	@Override
    protected void setParam(Group obj) throws SQLException {
		stmt.setInt("GroupId", obj.getGroupId());
		stmt.setString("GroupName", obj.getGroupName());
	}
}
