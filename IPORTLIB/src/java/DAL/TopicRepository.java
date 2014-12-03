package DAL;
import DTO.Topic;
import java.sql.ResultSet;
import java.sql.SQLException;
@org.springframework.stereotype.Repository("topicRepository")
public class TopicRepository extends Repository<Topic> implements ITopicRepository{
	@Override
    protected Topic getFromResultSet(ResultSet rs) throws SQLException {
        return new Topic(rs.getInt("TopicId"), rs.getString("TopicName"), rs.getString("Note"));
    }
	@Override
    protected void setGetParam(Object id) throws SQLException {
        callableStatement("{call GetTopicById(?)}");
        stmt.setInt("TopicId", (int) id);
    }
    @Override
    protected void setGetsParam(Object obj) throws SQLException{
        callableStatement("{call GetTopics()}");
    }
    @Override
    protected void setAddParam(Topic obj) throws SQLException{
        callableStatement("{call InsertTopic(?, ?, ?)}");
        stmt.registerOutParameter("TopicId", java.sql.Types.INTEGER);
    }    
    @Override
    protected void setReturnParam(Topic obj) throws SQLException {
        obj.setTopicId(stmt.getInt("TopicId"));
    }
    @Override
    protected void setEditParam(Topic obj) throws SQLException {
        callableStatement("{call UpdateTopic(?, ?, ?)}");
        stmt.setInt("TopicId", obj.getTopicId());
    }
    @Override
    protected void setDeleteParam(Object id) throws SQLException {
        callableStatement("{call DeleteTopic(?)}");
        stmt.setInt("TopicId", (int) id);
    }
	@Override
    protected void setCountParam(Object obj) throws SQLException {
        callableStatement("{call CountTopics()}");
    }
	@Override
    protected void setParam(Topic obj) throws SQLException {
		stmt.setInt("TopicId", obj.getTopicId());
		stmt.setString("TopicName", obj.getTopicName());
		stmt.setString("Note", obj.getNote());
	}
}
