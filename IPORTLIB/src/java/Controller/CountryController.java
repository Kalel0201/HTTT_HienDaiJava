package Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import BLL.ICountryService;
import DTO.Country;
@Controller
@RequestMapping("/country")
public class CountryController {
	@Autowired
	ICountryService service;
	@RequestMapping("/index")
	public String index(Model model){
		model.addAttribute("countrys", service.gets(null));
		return "country.index";
	}
	@RequestMapping("/add")
	public String add(){
		return "country.add";
	}
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(Country country){
		service.add(country);
		return "redirect:index";
	}
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
	public String edit(Model model, @PathVariable(value = "id") int id){
		Country  country = service.get(id);
		model.addAttribute("country", country);
		return "category.edit";
	}
	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public String edit(Model model, @ModelAttribute Country country){
		service.edit(country);
		model.addAttribute("country", country);
		return "redirect:index";
	}
	@RequestMapping("/delete/{id}")
	public String delete(Model model, @PathVariable(value = "id") int id){
		service.delete(id);
		return "redirect:../index";
	}
}
