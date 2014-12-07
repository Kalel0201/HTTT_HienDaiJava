package Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import BLL.IDepartmentService;
import DTO.Department;
@Controller
@RequestMapping("/department")
public class DepartmentController {
	@Autowired
	IDepartmentService service;
	@RequestMapping("/index")
	public String index(Model model){
		model.addAttribute("departments", service.gets(null));
		return "department.index";
	}
	@RequestMapping("/add")
	public String add(){
		return "department.add";
	}
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(Department department){
		service.add(department);
		return "redirect:index";
	}
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
	public String edit(Model model, @PathVariable(value = "id") int id){
		Department  department = service.get(id);
		model.addAttribute("department", department);
		return "category.edit";
	}
	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public String edit(Model model, @ModelAttribute Department department){
		service.edit(department);
		model.addAttribute("department", department);
		return "redirect:index";
	}
	@RequestMapping("/delete/{id}")
	public String delete(Model model, @PathVariable(value = "id") int id){
		service.delete(id);
		return "redirect:../index";
	}
}
