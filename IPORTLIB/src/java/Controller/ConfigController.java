package Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import BLL.IConfigService;
import DTO.Config;
@Controller
@RequestMapping("/config")
public class ConfigController {
	@Autowired
	IConfigService service;
	@RequestMapping("/index")
	public String index(Model model){
		model.addAttribute("configs", service.gets(null));
		return "config.index";
	}
	@RequestMapping("/add")
	public String add(){
		return "config.add";
	}
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(Config config){
		service.add(config);
		return "redirect:index";
	}
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
	public String edit(Model model, @PathVariable(value = "id") int id){
		Config  config = service.get(id);
		model.addAttribute("config", config);
		return "category.edit";
	}
	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public String edit(Model model, @ModelAttribute Config config){
		service.edit(config);
		model.addAttribute("config", config);
		return "redirect:index";
	}
	@RequestMapping("/delete/{id}")
	public String delete(Model model, @PathVariable(value = "id") int id){
		service.delete(id);
		return "redirect:../index";
	}
}
