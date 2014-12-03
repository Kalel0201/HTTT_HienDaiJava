package Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import BLL.IAuthorService;
import DTO.Author;
@Controller
@RequestMapping("/author")
public class AuthorController {
	@Autowired
	IAuthorService service;
	@RequestMapping("/index")
	public String index(Model model){
            return setIndex(model, 0);
	}
        private String setIndex(Model model, int pageIndex){
            model.addAttribute("authors", service.gets(pageIndex));
            model.addAttribute("nPage", service.page(null));
            return "author.index";
        }
        @RequestMapping("/index/{pageIndex}")
	public String index(Model model, @PathVariable(value = "pageIndex") Integer pageIndex){
            return setIndex(model, pageIndex);
	}
        
	@RequestMapping("/add")
	public String add(){
		return "author.add";
	}
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(Author author){
		service.add(author);
		return "redirect:index";
	}
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
	public String edit(Model model, @PathVariable(value = "id") int id){
		Author  author = service.get(id);
		model.addAttribute("author", author);
		return "category.edit";
	}
	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public String edit(Model model, @ModelAttribute Author author){
		service.edit(author);
		model.addAttribute("author", author);
		return "redirect:index";
	}
	@RequestMapping("/delete/{id}")
	public String delete(Model model, @PathVariable(value = "id") int id){
		service.delete(id);
		return "redirect:../index";
	}
}
