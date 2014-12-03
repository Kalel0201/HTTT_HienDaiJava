package DAL;
import DTO.AttachmentType;
import java.sql.ResultSet;
import java.sql.SQLException;
@org.springframework.stereotype.Repository("attachmentTypeRepository")
public class AttachmentTypeRepository extends Repository<AttachmentType> implements IAttachmentTypeRepository{
	@Override
    protected AttachmentType getFromResultSet(ResultSet rs) throws SQLException {
        return new AttachmentType(rs.getInt("AttachmentTypeId"), rs.getString("AttachmentTypeName"));
    }
	@Override
    protected void setGetParam(Object id) throws SQLException {
        callableStatement("{call GetAttachmentTypeById(?)}");
        stmt.setInt("AttachmentTypeId", (int) id);
    }
    @Override
    protected void setGetsParam(Object obj) throws SQLException{
        callableStatement("{call GetAttachmentTypes()}");
    }
    @Override
    protected void setAddParam(AttachmentType obj) throws SQLException{
        callableStatement("{call InsertAttachmentType(?, ?)}");
        stmt.registerOutParameter("AttachmentTypeId", java.sql.Types.INTEGER);
    }    
    @Override
    protected void setReturnParam(AttachmentType obj) throws SQLException {
        obj.setAttachmentTypeId(stmt.getInt("AttachmentTypeId"));
    }
    @Override
    protected void setEditParam(AttachmentType obj) throws SQLException {
        callableStatement("{call UpdateAttachmentType(?, ?)}");
        stmt.setInt("AttachmentTypeId", obj.getAttachmentTypeId());
    }
    @Override
    protected void setDeleteParam(Object id) throws SQLException {
        callableStatement("{call DeleteAttachmentType(?)}");
        stmt.setInt("AttachmentTypeId", (int) id);
    }
	@Override
    protected void setCountParam(Object obj) throws SQLException {
        callableStatement("{call CountAttachmentTypes()}");
    }
	@Override
    protected void setParam(AttachmentType obj) throws SQLException {
		stmt.setInt("AttachmentTypeId", obj.getAttachmentTypeId());
		stmt.setString("AttachmentTypeName", obj.getAttachmentTypeName());
	}
}
