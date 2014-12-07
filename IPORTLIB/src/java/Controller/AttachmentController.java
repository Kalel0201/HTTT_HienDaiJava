package Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import BLL.IAttachmentService;
import DTO.Attachment;
@Controller
@RequestMapping("/attachment")
public class AttachmentController {
	@Autowired
	IAttachmentService service;
	@RequestMapping("/index")
	public String index(Model model){
		model.addAttribute("attachments", service.gets(null));
		return "attachment.index";
	}
	@RequestMapping("/add")
	public String add(){
		return "attachment.add";
	}
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(Attachment attachment){
		service.add(attachment);
		return "redirect:index";
	}
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
	public String edit(Model model, @PathVariable(value = "id") int id){
		Attachment  attachment = service.get(id);
		model.addAttribute("attachment", attachment);
		return "category.edit";
	}
	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public String edit(Model model, @ModelAttribute Attachment attachment){
		service.edit(attachment);
		model.addAttribute("attachment", attachment);
		return "redirect:index";
	}
	@RequestMapping("/delete/{id}")
	public String delete(Model model, @PathVariable(value = "id") int id){
		service.delete(id);
		return "redirect:../index";
	}
}
