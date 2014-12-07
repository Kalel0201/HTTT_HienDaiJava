package Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import BLL.IPublicationService;
import DTO.Publication;
@Controller
@RequestMapping("/publication")
public class PublicationController {
	@Autowired
	IPublicationService service;
	@RequestMapping("/index")
	public String index(Model model){
		model.addAttribute("publications", service.gets(null));
		return "publication.index";
	}
	@RequestMapping("/add")
	public String add(){
		return "publication.add";
	}
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(Publication publication){
		service.add(publication);
		return "redirect:index";
	}
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
	public String edit(Model model, @PathVariable(value = "id") int id){
		Publication  publication = service.get(id);
		model.addAttribute("publication", publication);
		return "category.edit";
	}
	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public String edit(Model model, @ModelAttribute Publication publication){
		service.edit(publication);
		model.addAttribute("publication", publication);
		return "redirect:index";
	}
	@RequestMapping("/delete/{id}")
	public String delete(Model model, @PathVariable(value = "id") int id){
		service.delete(id);
		return "redirect:../index";
	}
}
