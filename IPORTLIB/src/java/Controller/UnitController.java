package Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import BLL.IUnitService;
import DTO.Unit;
@Controller
@RequestMapping("/unit")
public class UnitController {
	@Autowired
	IUnitService service;
	@RequestMapping("/index")
	public String index(Model model){
		model.addAttribute("units", service.gets(null));
		return "unit.index";
	}
	@RequestMapping("/add")
	public String add(){
		return "unit.add";
	}
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(Unit unit){
		service.add(unit);
		return "redirect:index";
	}
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
	public String edit(Model model, @PathVariable(value = "id") int id){
		Unit  unit = service.get(id);
		model.addAttribute("unit", unit);
		return "category.edit";
	}
	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public String edit(Model model, @ModelAttribute Unit unit){
		service.edit(unit);
		model.addAttribute("unit", unit);
		return "redirect:index";
	}
	@RequestMapping("/delete/{id}")
	public String delete(Model model, @PathVariable(value = "id") int id){
		service.delete(id);
		return "redirect:../index";
	}
}
