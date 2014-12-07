package BLL;
import DTO.Author;
import java.util.List;
public interface IAuthorService {
    boolean add(Author author);
    boolean edit(Author author);
    boolean delete(Object id);
    Author get(Object id);
    List<Author> gets(Object obj);
	int count(Object obj);
	int page(Object obj);
    int page(int pageSize, Object obj);
}

