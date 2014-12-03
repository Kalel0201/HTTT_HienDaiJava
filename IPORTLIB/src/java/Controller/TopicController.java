package Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import BLL.ITopicService;
import DTO.Topic;
@Controller
@RequestMapping("/topic")
public class TopicController {
	@Autowired
	ITopicService service;
	@RequestMapping("/index")
	public String index(Model model){
		model.addAttribute("topics", service.gets(null));
		return "topic.index";
	}
	@RequestMapping("/add")
	public String add(){
		return "topic.add";
	}
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(Topic topic){
		service.add(topic);
		return "redirect:index";
	}
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
	public String edit(Model model, @PathVariable(value = "id") int id){
		Topic  topic = service.get(id);
		model.addAttribute("topic", topic);
		return "category.edit";
	}
	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public String edit(Model model, @ModelAttribute Topic topic){
		service.edit(topic);
		model.addAttribute("topic", topic);
		return "redirect:index";
	}
	@RequestMapping("/delete/{id}")
	public String delete(Model model, @PathVariable(value = "id") int id){
		service.delete(id);
		return "redirect:../index";
	}
}
