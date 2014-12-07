package Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import BLL.IStatusService;
import DTO.Status;
@Controller
@RequestMapping("/status")
public class StatusController {
	@Autowired
	IStatusService service;
	@RequestMapping("/index")
	public String index(Model model){
		model.addAttribute("statuses", service.gets(null));
                model.addAttribute("nPage", service.count(null));
		return "status.index";
	}
	@RequestMapping("/add")
	public String add(){
		return "status.add";
	}
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(Status status){
		service.add(status);
		return "redirect:index";
	}
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
	public String edit(Model model, @PathVariable(value = "id") int id){
		Status  status = service.get(id);
		model.addAttribute("status", status);
		return "category.edit";
	}
	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public String edit(Model model, @ModelAttribute Status status){
		service.edit(status);
		model.addAttribute("status", status);
		return "redirect:index";
	}
	@RequestMapping("/delete/{id}")
	public String delete(Model model, @PathVariable(value = "id") int id){
		service.delete(id);
		return "redirect:../index";
	}
}
