package DAL;
import DTO.PublicationType;
import java.sql.ResultSet;
import java.sql.SQLException;
@org.springframework.stereotype.Repository("publicationTypeRepository")
public class PublicationTypeRepository extends Repository<PublicationType> implements IPublicationTypeRepository{
	@Override
    protected PublicationType getFromResultSet(ResultSet rs) throws SQLException {
        return new PublicationType(rs.getInt("PublicationTypeId"), rs.getString("PublicationTypeName"));
    }
	@Override
    protected void setGetParam(Object id) throws SQLException {
        callableStatement("{call GetPublicationTypeById(?)}");
        stmt.setInt("PublicationTypeId", (int) id);
    }
    @Override
    protected void setGetsParam(Object obj) throws SQLException{
        callableStatement("{call GetPublicationTypes()}");
    }
    @Override
    protected void setAddParam(PublicationType obj) throws SQLException{
        callableStatement("{call InsertPublicationType(?, ?)}");
        stmt.registerOutParameter("PublicationTypeId", java.sql.Types.INTEGER);
    }    
    @Override
    protected void setReturnParam(PublicationType obj) throws SQLException {
        obj.setPublicationTypeId(stmt.getInt("PublicationTypeId"));
    }
    @Override
    protected void setEditParam(PublicationType obj) throws SQLException {
        callableStatement("{call UpdatePublicationType(?, ?)}");
        stmt.setInt("PublicationTypeId", obj.getPublicationTypeId());
    }
    @Override
    protected void setDeleteParam(Object id) throws SQLException {
        callableStatement("{call DeletePublicationType(?)}");
        stmt.setInt("PublicationTypeId", (int) id);
    }
	@Override
    protected void setCountParam(Object obj) throws SQLException {
        callableStatement("{call CountPublicationTypes()}");
    }
	@Override
    protected void setParam(PublicationType obj) throws SQLException {
		stmt.setInt("PublicationTypeId", obj.getPublicationTypeId());
		stmt.setString("PublicationTypeName", obj.getPublicationTypeName());
	}
}
