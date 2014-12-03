package DAL;
import DTO.Publisher;
import java.sql.ResultSet;
import java.sql.SQLException;
@org.springframework.stereotype.Repository("publisherRepository")
public class PublisherRepository extends Repository<Publisher> implements IPublisherRepository{
	@Override
    protected Publisher getFromResultSet(ResultSet rs) throws SQLException {
        return new Publisher(rs.getInt("PublisherId"), rs.getString("PublisherName"), rs.getString("Note"));
    }
	@Override
    protected void setGetParam(Object id) throws SQLException {
        callableStatement("{call GetPublisherById(?)}");
        stmt.setInt("PublisherId", (int) id);
    }
    @Override
    protected void setGetsParam(Object obj) throws SQLException{
        callableStatement("{call GetPublishers()}");
    }
    @Override
    protected void setAddParam(Publisher obj) throws SQLException{
        callableStatement("{call InsertPublisher(?, ?, ?)}");
        stmt.registerOutParameter("PublisherId", java.sql.Types.INTEGER);
    }    
    @Override
    protected void setReturnParam(Publisher obj) throws SQLException {
        obj.setPublisherId(stmt.getInt("PublisherId"));
    }
    @Override
    protected void setEditParam(Publisher obj) throws SQLException {
        callableStatement("{call UpdatePublisher(?, ?, ?)}");
        stmt.setInt("PublisherId", obj.getPublisherId());
    }
    @Override
    protected void setDeleteParam(Object id) throws SQLException {
        callableStatement("{call DeletePublisher(?)}");
        stmt.setInt("PublisherId", (int) id);
    }
	@Override
    protected void setCountParam(Object obj) throws SQLException {
        callableStatement("{call CountPublishers()}");
    }
	@Override
    protected void setParam(Publisher obj) throws SQLException {
		stmt.setInt("PublisherId", obj.getPublisherId());
		stmt.setString("PublisherName", obj.getPublisherName());
		stmt.setString("Note", obj.getNote());
	}
}
