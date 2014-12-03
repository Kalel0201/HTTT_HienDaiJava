package Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import BLL.ICardUserService;
import DTO.CardUser;
@Controller
@RequestMapping("/cardUser")
public class CardUserController {
	@Autowired
	ICardUserService service;
	@RequestMapping("/index")
	public String index(Model model){
		model.addAttribute("cardUsers", service.gets(null));
		return "cardUser.index";
	}
	@RequestMapping("/add")
	public String add(){
		return "cardUser.add";
	}
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(CardUser cardUser){
		service.add(cardUser);
		return "redirect:index";
	}
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
	public String edit(Model model, @PathVariable(value = "id") int id){
		CardUser  cardUser = service.get(id);
		model.addAttribute("cardUser", cardUser);
		return "category.edit";
	}
	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public String edit(Model model, @ModelAttribute CardUser cardUser){
		service.edit(cardUser);
		model.addAttribute("cardUser", cardUser);
		return "redirect:index";
	}
	@RequestMapping("/delete/{id}")
	public String delete(Model model, @PathVariable(value = "id") int id){
		service.delete(id);
		return "redirect:../index";
	}
}
