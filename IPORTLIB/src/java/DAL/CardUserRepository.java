package DAL;
import DTO.CardUser;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
@org.springframework.stereotype.Repository("cardUserRepository")
public class CardUserRepository extends Repository<CardUser> implements ICardUserRepository{
	@Override
    protected CardUser getFromResultSet(ResultSet rs) throws SQLException {
        return new CardUser(rs.getInt("CardUserId"), rs.getInt("UserId"), rs.getString("CardUserNo"), rs.getString("UserName"), rs.getString("Password"), rs.getBoolean("Status"), rs.getDate("DueDate"));
    }
	@Override
    protected void setGetParam(Object id) throws SQLException {
        callableStatement("{call GetCardUserById(?)}");
        stmt.setInt("CardUserId", (int) id);
    }
    @Override
    protected void setGetsParam(Object obj) throws SQLException{
        callableStatement("{call GetCardUsers()}");
    }
    @Override
    protected void setAddParam(CardUser obj) throws SQLException{
        callableStatement("{call InsertCardUser(?, ?, ?, ?, ?, ?, ?)}");
        stmt.registerOutParameter("CardUserId", java.sql.Types.INTEGER);
    }    
    @Override
    protected void setReturnParam(CardUser obj) throws SQLException {
        obj.setCardUserId(stmt.getInt("CardUserId"));
    }
    @Override
    protected void setEditParam(CardUser obj) throws SQLException {
        callableStatement("{call UpdateCardUser(?, ?, ?, ?, ?, ?, ?)}");
        stmt.setInt("CardUserId", obj.getCardUserId());
    }
    @Override
    protected void setDeleteParam(Object id) throws SQLException {
        callableStatement("{call DeleteCardUser(?)}");
        stmt.setInt("CardUserId", (int) id);
    }
	@Override
    protected void setCountParam(Object obj) throws SQLException {
        callableStatement("{call CountCardUsers()}");
    }
	@Override
    protected void setParam(CardUser obj) throws SQLException {
		stmt.setInt("CardUserId", obj.getCardUserId());
		stmt.setInt("UserId", obj.getUserId());
		stmt.setString("CardUserNo", obj.getCardUserNo());
		stmt.setString("UserName", obj.getUserName());
		stmt.setString("Password", obj.getPassword());
		stmt.setBoolean("Status", obj.getStatus());
		stmt.setDate("DueDate", (Date) obj.getDueDate());
	}
}
