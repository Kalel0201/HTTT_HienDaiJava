package BLL;
import DTO.Book;
import java.util.List;
public interface IBookService {
    boolean add(Book book);
    boolean edit(Book book);
    boolean delete(Object id);
    Book get(Object id);
    List<Book> gets(Object obj);
	int count(Object obj);
	int page(Object obj);
    int page(int pageSize, Object obj);
}

