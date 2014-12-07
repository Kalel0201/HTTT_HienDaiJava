package BLL;
import DAL.ILanguageRepository;
import DTO.Language;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
@Service("languageService")
public class LanguageService implements ILanguageService{
	@Autowired
    ILanguageRepository repository;    
    @Override
    public boolean add(Language language) {
        return repository.add(language);
    }
    @Override
    public boolean edit(Language language) {
        return repository.edit(language);
    }
    @Override
    public boolean delete(Object id) {
        return repository.delete(id);
    }

    @Override
    public Language get(Object id) {
        return repository.get(id);
    }
    @Override
    public List<Language> gets(Object obj) {
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
