/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import BLL.INotificationService;
import DTO.Notification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.List;
@Controller
@RequestMapping("/")
public class HomeController {
    @Autowired
    INotificationService service;
    @RequestMapping("/index")
    public String index(Model model){
        //List<DTO.Notification> _list = service.gets(1);
        //model.addAttribute("notifications", service.gets(1));
        return "home.index";
    }
    
    @RequestMapping("/search")
    public String search(){
        return "home.search";
    }
    
    @RequestMapping("/notifications")
    public String notifications(Model model){
        model.addAttribute("notifications", service.gets(1));
        return "home.notifications";
    }
}
