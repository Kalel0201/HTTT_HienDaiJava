package Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import BLL.ICurrencyService;
import DTO.Currency;
@Controller
@RequestMapping("/currency")
public class CurrencyController {
	@Autowired
	ICurrencyService service;
	@RequestMapping("/index")
	public String index(Model model){
		model.addAttribute("currencys", service.gets(null));
		return "currency.index";
	}
	@RequestMapping("/add")
	public String add(){
		return "currency.add";
	}
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(Currency currency){
		service.add(currency);
		return "redirect:index";
	}
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
	public String edit(Model model, @PathVariable(value = "id") int id){
		Currency  currency = service.get(id);
		model.addAttribute("currency", currency);
		return "category.edit";
	}
	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public String edit(Model model, @ModelAttribute Currency currency){
		service.edit(currency);
		model.addAttribute("currency", currency);
		return "redirect:index";
	}
	@RequestMapping("/delete/{id}")
	public String delete(Model model, @PathVariable(value = "id") int id){
		service.delete(id);
		return "redirect:../index";
	}
}
