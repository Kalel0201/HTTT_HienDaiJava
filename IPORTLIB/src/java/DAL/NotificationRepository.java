package DAL;
import DTO.Notification;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Repository("notificationRepository")
public class NotificationRepository extends Repository<Notification> implements INotificationRepository {
    @Override
    protected void setParam(Notification noti) {
        
    }
    
    @Override
    protected void setAddParam(Notification noti) {
        
    }
    
    @Override
    protected void setReturnParam(Notification noti) {
        
    }
    
    @Override
    protected void setEditParam(Notification noti) {
        
    }
    
    @Override
    protected void setDeleteParam(Object noti) {
        
    }
    
    @Override
    protected void setGetParam(Object id) throws SQLException {
        
    }
    
    @Override
    protected void setGetsParam(Object obj) throws SQLException {
        callableStatement("{call GetNotificationsByUserId(?)}");
        stmt.setInt("UserId", (int)obj);
    }
    
    @Override
    protected void setCountParam(Object obj) throws SQLException {
        
    }

    @Override
    protected Notification getFromResultSet(ResultSet rs) throws SQLException {
        return new Notification (
                rs.getInt("NoID"),
                rs.getString("Title"),
                rs.getDate("Created"),
                rs.getString("Name"),
                rs.getString("PubTitle"),
                rs.getDate("DateLoan"),
                rs.getDate("DatePay"),
                rs.getInt("LoanDetailId")
        );
    }
}
