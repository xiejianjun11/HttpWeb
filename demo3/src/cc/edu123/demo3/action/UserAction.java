package cc.edu123.demo3.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cc.edu123.demo3.service.UserService;

@Controller  
@RequestMapping("/user") 
public class UserAction {
	
	  @Resource  
	    private UserService userService;  
	  
	    @RequestMapping("/findUserById")  
	    public String findUserById(int id, Model model) {  
	        String username = userService.findUserById(id);  
	        if (username !="" ) {  
	            model.addAttribute("username", username);  
	        } else {  
	            model.addAttribute("username", "Œ¥’“µΩ");  
	        }  
	        return "test";  
	    } 
}
