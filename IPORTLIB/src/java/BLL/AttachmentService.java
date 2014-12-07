package BLL;
import DAL.IAttachmentRepository;
import DTO.Attachment;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
@Service("attachmentService")
public class AttachmentService implements IAttachmentService{
	@Autowired
    IAttachmentRepository repository;    
    @Override
    public boolean add(Attachment attachment) {
        return repository.add(attachment);
    }
    @Override
    public boolean edit(Attachment attachment) {
        return repository.edit(attachment);
    }
    @Override
    public boolean delete(Object id) {
        return repository.delete(id);
    }

    @Override
    public Attachment get(Object id) {
        return repository.get(id);
    }
    @Override
    public List<Attachment> gets(Object obj) {
        return repository.gets(obj);
    }
	@Override
    public int count(Object obj) {
        return repository.count(obj);
    }
	@Override
    public int page(Object obj) {
        return repository.page(obj);
    }
    @Override
    public int page(int pageSize, Object obj) {
        return repository.page(pageSize, obj);
    }
}
