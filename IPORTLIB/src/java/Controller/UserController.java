package Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import BLL.IUserService;
import DTO.User;
@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	IUserService service;
	@RequestMapping("/index")
	public String index(Model model){
		model.addAttribute("users", service.gets(null));
		return "user.index";
	}
	@RequestMapping("/add")
	public String add(){
		return "user.add";
	}
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(User user){
		service.add(user);
		return "redirect:index";
	}
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
	public String edit(Model model, @PathVariable(value = "id") int id){
		User  user = service.get(id);
		model.addAttribute("user", user);
		return "category.edit";
	}
	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public String edit(Model model, @ModelAttribute User user){
		service.edit(user);
		model.addAttribute("user", user);
		return "redirect:index";
	}
	@RequestMapping("/delete/{id}")
	public String delete(Model model, @PathVariable(value = "id") int id){
		service.delete(id);
		return "redirect:../index";
	}
}
