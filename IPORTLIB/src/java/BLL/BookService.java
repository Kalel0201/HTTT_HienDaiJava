package BLL;
import DAL.IBookRepository;
import DTO.Book;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
@Service("bookService")
public class BookService implements IBookService{
	@Autowired
    IBookRepository repository;    
    @Override
    public boolean add(Book book) {
        return repository.add(book);
    }
    @Override
    public boolean edit(Book book) {
        return repository.edit(book);
    }
    @Override
    public boolean delete(Object id) {
        return repository.delete(id);
    }

    @Override
    public Book get(Object id) {
        return repository.get(id);
    }
    @Override
    public List<Book> gets(Object obj) {
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
