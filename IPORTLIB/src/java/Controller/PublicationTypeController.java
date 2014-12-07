package Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import BLL.IPublicationTypeService;
import DTO.PublicationType;
@Controller
@RequestMapping("/publicationType")
public class PublicationTypeController {
	@Autowired
	IPublicationTypeService service;
	@RequestMapping("/index")
	public String index(Model model){
		model.addAttribute("publicationTypes", service.gets(null));
		return "publicationType.index";
	}
	@RequestMapping("/add")
	public String add(){
		return "publicationType.add";
	}
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(PublicationType publicationType){
		service.add(publicationType);
		return "redirect:index";
	}
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
	public String edit(Model model, @PathVariable(value = "id") int id){
		PublicationType  publicationType = service.get(id);
		model.addAttribute("publicationType", publicationType);
		return "category.edit";
	}
	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public String edit(Model model, @ModelAttribute PublicationType publicationType){
		service.edit(publicationType);
		model.addAttribute("publicationType", publicationType);
		return "redirect:index";
	}
	@RequestMapping("/delete/{id}")
	public String delete(Model model, @PathVariable(value = "id") int id){
		service.delete(id);
		return "redirect:../index";
	}
}
