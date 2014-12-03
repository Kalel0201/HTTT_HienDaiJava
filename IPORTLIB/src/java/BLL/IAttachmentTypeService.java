package BLL;
import DTO.AttachmentType;
import java.util.List;
public interface IAttachmentTypeService {
    boolean add(AttachmentType attachmentType);
    boolean edit(AttachmentType attachmentType);
    boolean delete(Object id);
    AttachmentType get(Object id);
    List<AttachmentType> gets(Object obj);
	int count(Object obj);
	int page(Object obj);
    int page(int pageSize, Object obj);
}

