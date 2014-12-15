package BLL;
import DAL.INotificationRepository;
import DTO.Notification;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("notificationService")
public class NotificationService implements INotificationService {
    @Autowired
    INotificationRepository repository;
    @Override
    public List<Notification> gets(Object obj) {
        return repository.gets(obj);
    }
}
