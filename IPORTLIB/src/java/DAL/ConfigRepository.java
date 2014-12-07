package DAL;
import DTO.Config;
import java.sql.ResultSet;
import java.sql.SQLException;
@org.springframework.stereotype.Repository("configRepository")
public class ConfigRepository extends Repository<Config> implements IConfigRepository{
	@Override
    protected Config getFromResultSet(ResultSet rs) throws SQLException {
        return new Config(rs.getInt("ConfigId"), rs.getString("ConfigName"), rs.getString("DataType"), rs.getString("Value"), rs.getInt("StatusId"));
    }
	@Override
    protected void setGetParam(Object id) throws SQLException {
        callableStatement("{call GetConfigById(?)}");
        stmt.setInt("ConfigId", (int) id);
    }
    @Override
    protected void setGetsParam(Object obj) throws SQLException{
        callableStatement("{call GetConfigs()}");
    }
    @Override
    protected void setAddParam(Config obj) throws SQLException{
        callableStatement("{call InsertConfig(?, ?, ?, ?, ?)}");
        stmt.registerOutParameter("ConfigId", java.sql.Types.INTEGER);
    }    
    @Override
    protected void setReturnParam(Config obj) throws SQLException {
        obj.setConfigId(stmt.getInt("ConfigId"));
    }
    @Override
    protected void setEditParam(Config obj) throws SQLException {
        callableStatement("{call UpdateConfig(?, ?, ?, ?, ?)}");
        stmt.setInt("ConfigId", obj.getConfigId());
    }
    @Override
    protected void setDeleteParam(Object id) throws SQLException {
        callableStatement("{call DeleteConfig(?)}");
        stmt.setInt("ConfigId", (int) id);
    }
	@Override
    protected void setCountParam(Object obj) throws SQLException {
        callableStatement("{call CountConfigs()}");
    }
	@Override
    protected void setParam(Config obj) throws SQLException {
		stmt.setInt("ConfigId", obj.getConfigId());
		stmt.setString("ConfigName", obj.getConfigName());
		stmt.setString("DataType", obj.getDataType());
		stmt.setString("Value", obj.getValue());
		stmt.setInt("StatusId", obj.getStatusId());
	}
}
