package BLL;
import DAL.IProvinceRepository;
import DTO.Province;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
@Service("provinceService")
public class ProvinceService implements IProvinceService{
	@Autowired
    IProvinceRepository repository;    
    @Override
    public boolean add(Province province) {
        return repository.add(province);
    }
    @Override
    public boolean edit(Province province) {
        return repository.edit(province);
    }
    @Override
    public boolean delete(Object id) {
        return repository.delete(id);
    }

    @Override
    public Province get(Object id) {
        return repository.get(id);
    }
    @Override
    public List<Province> gets(Object obj) {
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
