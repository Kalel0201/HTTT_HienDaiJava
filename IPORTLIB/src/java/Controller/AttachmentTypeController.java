package Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import BLL.IAttachmentTypeService;
import DTO.AttachmentType;
@Controller
@RequestMapping("/attachmentType")
public class AttachmentTypeController {
	@Autowired
	IAttachmentTypeService service;
	@RequestMapping("/index")
	public String index(Model model){
		model.addAttribute("attachmentTypes", service.gets(null));
		return "attachmentType.index";
	}
	@RequestMapping("/add")
	public String add(){
		return "attachmentType.add";
	}
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(AttachmentType attachmentType){
		service.add(attachmentType);
		return "redirect:index";
	}
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
	public String edit(Model model, @PathVariable(value = "id") int id){
		AttachmentType  attachmentType = service.get(id);
		model.addAttribute("attachmentType", attachmentType);
		return "category.edit";
	}
	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public String edit(Model model, @ModelAttribute AttachmentType attachmentType){
		service.edit(attachmentType);
		model.addAttribute("attachmentType", attachmentType);
		return "redirect:index";
	}
	@RequestMapping("/delete/{id}")
	public String delete(Model model, @PathVariable(value = "id") int id){
		service.delete(id);
		return "redirect:../index";
	}
}
