package BLL;
import DAL.IAttachmentTypeRepository;
import DTO.AttachmentType;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
@Service("attachmentTypeService")
public class AttachmentTypeService implements IAttachmentTypeService{
	@Autowired
    IAttachmentTypeRepository repository;    
    @Override
    public boolean add(AttachmentType attachmentType) {
        return repository.add(attachmentType);
    }
    @Override
    public boolean edit(AttachmentType attachmentType) {
        return repository.edit(attachmentType);
    }
    @Override
    public boolean delete(Object id) {
        return repository.delete(id);
    }

    @Override
    public AttachmentType get(Object id) {
        return repository.get(id);
    }
    @Override
    public List<AttachmentType> gets(Object obj) {
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
