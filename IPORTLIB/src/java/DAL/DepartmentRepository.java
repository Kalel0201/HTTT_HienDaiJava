package DAL;
import DTO.Department;
import java.sql.ResultSet;
import java.sql.SQLException;
@org.springframework.stereotype.Repository("departmentRepository")
public class DepartmentRepository extends Repository<Department> implements IDepartmentRepository{
	@Override
    protected Department getFromResultSet(ResultSet rs) throws SQLException {
        return new Department(rs.getInt("DepartmentId"), rs.getString("DepartmentName"));
    }
	@Override
    protected void setGetParam(Object id) throws SQLException {
        callableStatement("{call GetDepartmentById(?)}");
        stmt.setInt("DepartmentId", (int) id);
    }
    @Override
    protected void setGetsParam(Object obj) throws SQLException{
        callableStatement("{call GetDepartments()}");
    }
    @Override
    protected void setAddParam(Department obj) throws SQLException{
        callableStatement("{call InsertDepartment(?, ?)}");
        stmt.registerOutParameter("DepartmentId", java.sql.Types.INTEGER);
    }    
    @Override
    protected void setReturnParam(Department obj) throws SQLException {
        obj.setDepartmentId(stmt.getInt("DepartmentId"));
    }
    @Override
    protected void setEditParam(Department obj) throws SQLException {
        callableStatement("{call UpdateDepartment(?, ?)}");
        stmt.setInt("DepartmentId", obj.getDepartmentId());
    }
    @Override
    protected void setDeleteParam(Object id) throws SQLException {
        callableStatement("{call DeleteDepartment(?)}");
        stmt.setInt("DepartmentId", (int) id);
    }
	@Override
    protected void setCountParam(Object obj) throws SQLException {
        callableStatement("{call CountDepartments()}");
    }
	@Override
    protected void setParam(Department obj) throws SQLException {
		stmt.setInt("DepartmentId", obj.getDepartmentId());
		stmt.setString("DepartmentName", obj.getDepartmentName());
	}
}
