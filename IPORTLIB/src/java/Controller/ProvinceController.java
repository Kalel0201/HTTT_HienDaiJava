package Controller;
import BLL.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import BLL.IProvinceService;
import DTO.Province;
@Controller
@RequestMapping("/province")
public class ProvinceController {
	@Autowired
	IProvinceService service;
        @Autowired
        CountryService countryService;        
	@RequestMapping("/index")
	public String index(Model model){
		model.addAttribute("provinces", service.gets(null));
		return "province.index";
	}
	@RequestMapping("/add")
	public String add(Model model){
                model.addAttribute("countries", countryService.gets(null));
                model.addAttribute("province", new Province());
		return "province.add";
	}
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(Province province){
		service.add(province);
		return "redirect:index";
	}
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
	public String edit(Model model, @PathVariable(value = "id") int id){
		Province  province = service.get(id);
		model.addAttribute("province", province);
		return "category.edit";
	}
	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public String edit(Model model, @ModelAttribute Province province){
		service.edit(province);
		model.addAttribute("province", province);
		return "redirect:index";
	}
	@RequestMapping("/delete/{id}")
	public String delete(Model model, @PathVariable(value = "id") int id){
		service.delete(id);
		return "redirect:../index";
	}
}
