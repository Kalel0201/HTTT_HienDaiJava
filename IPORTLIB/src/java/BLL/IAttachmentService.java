package BLL;
import DTO.Attachment;
import java.util.List;
public interface IAttachmentService {
    boolean add(Attachment attachment);
    boolean edit(Attachment attachment);
    boolean delete(Object id);
    Attachment get(Object id);
    List<Attachment> gets(Object obj);
	int count(Object obj);
	int page(Object obj);
    int page(int pageSize, Object obj);
}

