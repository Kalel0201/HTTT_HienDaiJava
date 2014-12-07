package Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import BLL.IPublisherService;
import DTO.Publisher;
@Controller
@RequestMapping("/publisher")
public class PublisherController {
	@Autowired
	IPublisherService service;
	@RequestMapping("/index")
	public String index(Model model){
		model.addAttribute("publishers", service.gets(null));
		return "publisher.index";
	}
	@RequestMapping("/add")
	public String add(){
		return "publisher.add";
	}
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(Publisher publisher){
		service.add(publisher);
		return "redirect:index";
	}
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
	public String edit(Model model, @PathVariable(value = "id") int id){
		Publisher  publisher = service.get(id);
		model.addAttribute("publisher", publisher);
		return "category.edit";
	}
	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public String edit(Model model, @ModelAttribute Publisher publisher){
		service.edit(publisher);
		model.addAttribute("publisher", publisher);
		return "redirect:index";
	}
	@RequestMapping("/delete/{id}")
	public String delete(Model model, @PathVariable(value = "id") int id){
		service.delete(id);
		return "redirect:../index";
	}
}
