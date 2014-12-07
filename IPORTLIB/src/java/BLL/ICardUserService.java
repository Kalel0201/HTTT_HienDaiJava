package BLL;
import DTO.CardUser;
import java.util.List;
public interface ICardUserService {
    boolean add(CardUser cardUser);
    boolean edit(CardUser cardUser);
    boolean delete(Object id);
    CardUser get(Object id);
    List<CardUser> gets(Object obj);
	int count(Object obj);
	int page(Object obj);
    int page(int pageSize, Object obj);
}

