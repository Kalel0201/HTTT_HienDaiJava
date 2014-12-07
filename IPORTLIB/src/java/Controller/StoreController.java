package Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import BLL.IStoreService;
import DTO.Store;
@Controller
@RequestMapping("/store")
public class StoreController {
	@Autowired
	IStoreService service;
	@RequestMapping("/index")
	public String index(Model model){
		model.addAttribute("stores", service.gets(null));
		return "store.index";
	}
	@RequestMapping("/add")
	public String add(){
		return "store.add";
	}
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(Store store){
		service.add(store);
		return "redirect:index";
	}
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
	public String edit(Model model, @PathVariable(value = "id") int id){
		Store  store = service.get(id);
		model.addAttribute("store", store);
		return "category.edit";
	}
	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public String edit(Model model, @ModelAttribute Store store){
		service.edit(store);
		model.addAttribute("store", store);
		return "redirect:index";
	}
	@RequestMapping("/delete/{id}")
	public String delete(Model model, @PathVariable(value = "id") int id){
		service.delete(id);
		return "redirect:../index";
	}
}
