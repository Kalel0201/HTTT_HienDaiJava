package Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import BLL.ISupplierService;
import DTO.Supplier;
@Controller
@RequestMapping("/supplier")
public class SupplierController {
	@Autowired
	ISupplierService service;
	@RequestMapping("/index")
	public String index(Model model){
		model.addAttribute("suppliers", service.gets(null));
		return "supplier.index";
	}
	@RequestMapping("/add")
	public String add(){
		return "supplier.add";
	}
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(Supplier supplier){
		service.add(supplier);
		return "redirect:index";
	}
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
	public String edit(Model model, @PathVariable(value = "id") int id){
		Supplier  supplier = service.get(id);
		model.addAttribute("supplier", supplier);
		return "category.edit";
	}
	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public String edit(Model model, @ModelAttribute Supplier supplier){
		service.edit(supplier);
		model.addAttribute("supplier", supplier);
		return "redirect:index";
	}
	@RequestMapping("/delete/{id}")
	public String delete(Model model, @PathVariable(value = "id") int id){
		service.delete(id);
		return "redirect:../index";
	}
}
