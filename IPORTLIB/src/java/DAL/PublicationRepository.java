package DAL;
import DTO.Publication;
import java.sql.ResultSet;
import java.sql.SQLException;
@org.springframework.stereotype.Repository("publicationRepository")
public class PublicationRepository extends Repository<Publication> implements IPublicationRepository{
	@Override
    protected Publication getFromResultSet(ResultSet rs) throws SQLException {
        return new Publication(rs.getInt("PublicationId"), rs.getInt("TopicId"), rs.getInt("AuthorId"), rs.getInt("PublisherId"), rs.getInt("PublicationTypeId"), rs.getInt("MajorId"), rs.getInt("LanguageId"), rs.getString("Title"), rs.getString("SubTitle"), rs.getInt("PublisherYear"), rs.getInt("Edition"), rs.getString("Copyright"), rs.getString("Description"), rs.getString("Size"), rs.getInt("UnitId"), rs.getInt("Price"), rs.getInt("CurrencyId"), rs.getInt("Quantity"), rs.getString("NumberDewey"), rs.getString("ISBN"), rs.getString("Note"));
    }
	@Override
    protected void setGetParam(Object id) throws SQLException {
        callableStatement("{call GetPublicationById(?)}");
        stmt.setInt("PublicationId", (int) id);
    }
    @Override
    protected void setGetsParam(Object obj) throws SQLException{
        callableStatement("{call GetPublications()}");
    }
    @Override
    protected void setAddParam(Publication obj) throws SQLException{
        callableStatement("{call InsertPublication(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}");
        stmt.registerOutParameter("PublicationId", java.sql.Types.INTEGER);
    }    
    @Override
    protected void setReturnParam(Publication obj) throws SQLException {
        obj.setPublicationId(stmt.getInt("PublicationId"));
    }
    @Override
    protected void setEditParam(Publication obj) throws SQLException {
        callableStatement("{call UpdatePublication(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}");
        stmt.setInt("PublicationId", obj.getPublicationId());
    }
    @Override
    protected void setDeleteParam(Object id) throws SQLException {
        callableStatement("{call DeletePublication(?)}");
        stmt.setInt("PublicationId", (int) id);
    }
	@Override
    protected void setCountParam(Object obj) throws SQLException {
        callableStatement("{call CountPublications()}");
    }
	@Override
    protected void setParam(Publication obj) throws SQLException {
		stmt.setInt("PublicationId", obj.getPublicationId());
		stmt.setInt("TopicId", obj.getTopicId());
		stmt.setInt("AuthorId", obj.getAuthorId());
		stmt.setInt("PublisherId", obj.getPublisherId());
		stmt.setInt("PublicationTypeId", obj.getPublicationTypeId());
		stmt.setInt("MajorId", obj.getMajorId());
		stmt.setInt("LanguageId", obj.getLanguageId());
		stmt.setString("Title", obj.getTitle());
		stmt.setString("SubTitle", obj.getSubTitle());
		stmt.setInt("PublisherYear", obj.getPublisherYear());
		stmt.setInt("Edition", obj.getEdition());
		stmt.setString("Copyright", obj.getCopyright());
		stmt.setString("Description", obj.getDescription());
		stmt.setString("Size", obj.getSize());
		stmt.setInt("UnitId", obj.getUnitId());
		stmt.setInt("Price", obj.getPrice());
		stmt.setInt("CurrencyId", obj.getCurrencyId());
		stmt.setInt("Quantity", obj.getQuantity());
		stmt.setString("NumberDewey", obj.getNumberDewey());
		stmt.setString("ISBN", obj.getISBN());
		stmt.setString("Note", obj.getNote());
	}
}
