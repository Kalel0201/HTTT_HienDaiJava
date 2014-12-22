package Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import BLL.INotificationService;
import org.springframework.beans.factory.annotation.Autowired;


public class Interceptor extends HandlerInterceptorAdapter {
    @Autowired
    INotificationService service;
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        request.setAttribute("notis", service.gets(1));
        return true;
    }
    
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
//        List<Notification> _list = service.gets(1);
//        modelAndView.addObject("notifications2", _list);
        //super.postHandle(request, response, handler, modelAndView); //To change body of generated methods, choose Tools | Templates.
    }
}
