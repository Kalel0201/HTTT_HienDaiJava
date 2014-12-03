package BLL;
import DAL.IAuthorRepository;
import DTO.Author;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
@Service("authorService")
public class AuthorService implements IAuthorService{
	@Autowired
    IAuthorRepository repository;    
    @Override
    public boolean add(Author author) {
        return repository.add(author);
    }
    @Override
    public boolean edit(Author author) {
        return repository.edit(author);
    }
    @Override
    public boolean delete(Object id) {
        return repository.delete(id);
    }

    @Override
    public Author get(Object id) {
        return repository.get(id);
    }
    @Override
    public List<Author> gets(Object obj) {
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
