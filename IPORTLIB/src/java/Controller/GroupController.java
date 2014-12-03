package Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import BLL.IGroupService;
import DTO.Group;
@Controller
@RequestMapping("/group")
public class GroupController {
	@Autowired
	IGroupService service;
	@RequestMapping("/index")
	public String index(Model model){
		model.addAttribute("groups", service.gets(null));
		return "group.index";
	}
	@RequestMapping("/add")
	public String add(){
		return "group.add";
	}
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(Group group){
		service.add(group);
		return "redirect:index";
	}
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
	public String edit(Model model, @PathVariable(value = "id") int id){
		Group  group = service.get(id);
		model.addAttribute("group", group);
		return "category.edit";
	}
	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public String edit(Model model, @ModelAttribute Group group){
		service.edit(group);
		model.addAttribute("group", group);
		return "redirect:index";
	}
	@RequestMapping("/delete/{id}")
	public String delete(Model model, @PathVariable(value = "id") int id){
		service.delete(id);
		return "redirect:../index";
	}
}
