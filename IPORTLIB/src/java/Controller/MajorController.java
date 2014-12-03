package Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import BLL.IMajorService;
import DTO.Major;
@Controller
@RequestMapping("/major")
public class MajorController {
	@Autowired
	IMajorService service;
	@RequestMapping("/index")
	public String index(Model model){
		model.addAttribute("majors", service.gets(null));
		return "major.index";
	}
	@RequestMapping("/add")
	public String add(){
		return "major.add";
	}
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(Major major){
		service.add(major);
		return "redirect:index";
	}
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
	public String edit(Model model, @PathVariable(value = "id") int id){
		Major  major = service.get(id);
		model.addAttribute("major", major);
		return "category.edit";
	}
	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public String edit(Model model, @ModelAttribute Major major){
		service.edit(major);
		model.addAttribute("major", major);
		return "redirect:index";
	}
	@RequestMapping("/delete/{id}")
	public String delete(Model model, @PathVariable(value = "id") int id){
		service.delete(id);
		return "redirect:../index";
	}
}
