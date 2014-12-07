package Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import BLL.ILanguageService;
import DTO.Language;
@Controller
@RequestMapping("/language")
public class LanguageController {
	@Autowired
	ILanguageService service;
	@RequestMapping("/index")
	public String index(Model model){
		model.addAttribute("languages", service.gets(null));
		return "language.index";
	}
	@RequestMapping("/add")
	public String add(){
		return "language.add";
	}
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(Language language){
		service.add(language);
		return "redirect:index";
	}
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
	public String edit(Model model, @PathVariable(value = "id") int id){
		Language  language = service.get(id);
		model.addAttribute("language", language);
		return "category.edit";
	}
	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public String edit(Model model, @ModelAttribute Language language){
		service.edit(language);
		model.addAttribute("language", language);
		return "redirect:index";
	}
	@RequestMapping("/delete/{id}")
	public String delete(Model model, @PathVariable(value = "id") int id){
		service.delete(id);
		return "redirect:../index";
	}
}
