package mvcdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import dto.LoginDTO;

@Controller
public class AccountController {
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Model model) {
		
		LoginDTO loginDTO = new LoginDTO();
		
		loginDTO.setEmail("halop@gmail.com");
		
		model.addAttribute("credentials", loginDTO);
		
		return "account/login";
	}
	@RequestMapping(value = "/login", method = RequestMethod.POST)
    public String submit(@ModelAttribute("credentials")LoginDTO credentials, 
      BindingResult result, ModelMap modelMap, Model model) {
		
		System.out.println("------Good Work-------");
		String email=credentials.getEmail();
		System.out.println("-------------"+email);
		//String password=user.getPassword();
		if(email.equals("admin@gmail.com"))
		{
			model.addAttribute("email", email);
			return "account/user-profile";
		}
		else
			return "account/login";
        
    }
	

}
