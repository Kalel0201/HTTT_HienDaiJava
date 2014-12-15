package BLL;
import DTO.Notification;
import java.util.List;

public interface INotificationService {
    List<Notification> gets(Object obj);
}
