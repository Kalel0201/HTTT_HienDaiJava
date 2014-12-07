package BLL;
import DAL.ICardUserRepository;
import DTO.CardUser;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
@Service("cardUserService")
public class CardUserService implements ICardUserService{
	@Autowired
    ICardUserRepository repository;    
    @Override
    public boolean add(CardUser cardUser) {
        return repository.add(cardUser);
    }
    @Override
    public boolean edit(CardUser cardUser) {
        return repository.edit(cardUser);
    }
    @Override
    public boolean delete(Object id) {
        return repository.delete(id);
    }

    @Override
    public CardUser get(Object id) {
        return repository.get(id);
    }
    @Override
    public List<CardUser> gets(Object obj) {
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
