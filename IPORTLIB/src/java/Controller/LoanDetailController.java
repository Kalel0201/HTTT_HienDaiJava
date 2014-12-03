package Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import BLL.ILoanDetailService;
import DTO.LoanDetail;
@Controller
@RequestMapping("/loanDetail")
public class LoanDetailController {
	@Autowired
	ILoanDetailService service;
	@RequestMapping("/index")
	public String index(Model model){
		model.addAttribute("loanDetails", service.gets(null));
		return "loanDetail.index";
	}
	@RequestMapping("/add")
	public String add(){
		return "loanDetail.add";
	}
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(LoanDetail loanDetail){
		service.add(loanDetail);
		return "redirect:index";
	}
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
	public String edit(Model model, @PathVariable(value = "id") int id){
		LoanDetail  loanDetail = service.get(id);
		model.addAttribute("loanDetail", loanDetail);
		return "category.edit";
	}
	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public String edit(Model model, @ModelAttribute LoanDetail loanDetail){
		service.edit(loanDetail);
		model.addAttribute("loanDetail", loanDetail);
		return "redirect:index";
	}
	@RequestMapping("/delete/{id}")
	public String delete(Model model, @PathVariable(value = "id") int id){
		service.delete(id);
		return "redirect:../index";
	}
}
