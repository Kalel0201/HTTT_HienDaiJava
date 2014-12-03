package Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import BLL.ILoanService;
import DTO.Loan;
@Controller
@RequestMapping("/loan")
public class LoanController {
	@Autowired
	ILoanService service;
	@RequestMapping("/index")
	public String index(Model model){
		model.addAttribute("loans", service.gets(null));
		return "loan.index";
	}
	@RequestMapping("/add")
	public String add(){
		return "loan.add";
	}
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(Loan loan){
		service.add(loan);
		return "redirect:index";
	}
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
	public String edit(Model model, @PathVariable(value = "id") int id){
		Loan  loan = service.get(id);
		model.addAttribute("loan", loan);
		return "category.edit";
	}
	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public String edit(Model model, @ModelAttribute Loan loan){
		service.edit(loan);
		model.addAttribute("loan", loan);
		return "redirect:index";
	}
	@RequestMapping("/delete/{id}")
	public String delete(Model model, @PathVariable(value = "id") int id){
		service.delete(id);
		return "redirect:../index";
	}
}
