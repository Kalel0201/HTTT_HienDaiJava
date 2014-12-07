package Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import BLL.IBookService;
import DTO.Book;
@Controller
@RequestMapping("/book")
public class BookController {
	@Autowired
	IBookService service;
	@RequestMapping("/index")
	public String index(Model model){
		model.addAttribute("books", service.gets(null));
		return "book.index";
	}
	@RequestMapping("/add")
	public String add(){
		return "book.add";
	}
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(Book book){
		service.add(book);
		return "redirect:index";
	}
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
	public String edit(Model model, @PathVariable(value = "id") int id){
		Book  book = service.get(id);
		model.addAttribute("book", book);
		return "category.edit";
	}
	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public String edit(Model model, @ModelAttribute Book book){
		service.edit(book);
		model.addAttribute("book", book);
		return "redirect:index";
	}
	@RequestMapping("/delete/{id}")
	public String delete(Model model, @PathVariable(value = "id") int id){
		service.delete(id);
		return "redirect:../index";
	}
}
