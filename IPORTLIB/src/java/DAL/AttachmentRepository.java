package DAL;
import DTO.Attachment;
import java.sql.ResultSet;
import java.sql.SQLException;
@org.springframework.stereotype.Repository("attachmentRepository")
public class AttachmentRepository extends Repository<Attachment> implements IAttachmentRepository{
	@Override
    protected Attachment getFromResultSet(ResultSet rs) throws SQLException {
        return new Attachment(rs.getInt("AttachmentId"), rs.getString("Url"), rs.getInt("AttachmentTypeId"));
    }
	@Override
    protected void setGetParam(Object id) throws SQLException {
        callableStatement("{call GetAttachmentById(?)}");
        stmt.setInt("AttachmentId", (int) id);
    }
    @Override
    protected void setGetsParam(Object obj) throws SQLException{
        callableStatement("{call GetAttachments()}");
    }
    @Override
    protected void setAddParam(Attachment obj) throws SQLException{
        callableStatement("{call InsertAttachment(?, ?, ?)}");
        stmt.registerOutParameter("AttachmentId", java.sql.Types.INTEGER);
    }    
    @Override
    protected void setReturnParam(Attachment obj) throws SQLException {
        obj.setAttachmentId(stmt.getInt("AttachmentId"));
    }
    @Override
    protected void setEditParam(Attachment obj) throws SQLException {
        callableStatement("{call UpdateAttachment(?, ?, ?)}");
        stmt.setInt("AttachmentId", obj.getAttachmentId());
    }
    @Override
    protected void setDeleteParam(Object id) throws SQLException {
        callableStatement("{call DeleteAttachment(?)}");
        stmt.setInt("AttachmentId", (int) id);
    }
	@Override
    protected void setCountParam(Object obj) throws SQLException {
        callableStatement("{call CountAttachments()}");
    }
	@Override
    protected void setParam(Attachment obj) throws SQLException {
		stmt.setInt("AttachmentId", obj.getAttachmentId());
		stmt.setString("Url", obj.getUrl());
		stmt.setInt("AttachmentTypeId", obj.getAttachmentTypeId());
	}
}
