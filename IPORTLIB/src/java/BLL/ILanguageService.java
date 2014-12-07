package BLL;
import DTO.Language;
import java.util.List;
public interface ILanguageService {
    boolean add(Language language);
    boolean edit(Language language);
    boolean delete(Object id);
    Language get(Object id);
    List<Language> gets(Object obj);
	int count(Object obj);
	int page(Object obj);
    int page(int pageSize, Object obj);
}

