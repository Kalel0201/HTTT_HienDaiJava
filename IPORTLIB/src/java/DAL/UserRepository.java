package DAL;
import DTO.User;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
@org.springframework.stereotype.Repository("userRepository")
public class UserRepository extends Repository<User> implements IUserRepository{
	@Override
    protected User getFromResultSet(ResultSet rs) throws SQLException {
        return new User(rs.getInt("UserId"), rs.getInt("DepartmentId"), rs.getInt("ProvinceId"), rs.getInt("GroupId"), rs.getInt("AttachmentId"), rs.getString("UserNo"), rs.getString("FirstName"), rs.getString("LastName"), rs.getBoolean("Gender"), rs.getDate("BirthDay"), rs.getString("Address"), rs.getString("Phone"), rs.getString("IdentityCard"), rs.getString("Email"));
    }
	@Override
    protected void setGetParam(Object id) throws SQLException {
        callableStatement("{call GetUserById(?)}");
        stmt.setInt("UserId", (int) id);
    }
    @Override
    protected void setGetsParam(Object obj) throws SQLException{
        callableStatement("{call GetUsers()}");
    }
    @Override
    protected void setAddParam(User obj) throws SQLException{
        callableStatement("{call InsertUser(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}");
        stmt.registerOutParameter("UserId", java.sql.Types.INTEGER);
    }    
    @Override
    protected void setReturnParam(User obj) throws SQLException {
        obj.setUserId(stmt.getInt("UserId"));
    }
    @Override
    protected void setEditParam(User obj) throws SQLException {
        callableStatement("{call UpdateUser(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}");
        stmt.setInt("UserId", obj.getUserId());
    }
    @Override
    protected void setDeleteParam(Object id) throws SQLException {
        callableStatement("{call DeleteUser(?)}");
        stmt.setInt("UserId", (int) id);
    }
	@Override
    protected void setCountParam(Object obj) throws SQLException {
        callableStatement("{call CountUsers()}");
    }
	@Override
    protected void setParam(User obj) throws SQLException {
		stmt.setInt("UserId", obj.getUserId());
		stmt.setInt("DepartmentId", obj.getDepartmentId());
		stmt.setInt("ProvinceId", obj.getProvinceId());
		stmt.setInt("GroupId", obj.getGroupId());
		stmt.setInt("AttachmentId", obj.getAttachmentId());
		stmt.setString("UserNo", obj.getUserNo());
		stmt.setString("FirstName", obj.getFirstName());
		stmt.setString("LastName", obj.getLastName());
		stmt.setBoolean("Gender", obj.getGender());
		stmt.setDate("BirthDay", (Date) obj.getBirthDay());
		stmt.setString("Address", obj.getAddress());
		stmt.setString("Phone", obj.getPhone());
		stmt.setString("IdentityCard", obj.getIdentityCard());
		stmt.setString("Email", obj.getEmail());
	}
}
