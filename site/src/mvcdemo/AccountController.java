package mvcdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import dto.LoginDTO;

@Controller
public class AccountController {
	
	@RequestMapping("/login")
	public String login(Model model) {
		
		LoginDTO loginDTO = new LoginDTO();
		
		loginDTO.setEmail("halop@gmail.com");
		
		model.addAttribute("credentials", loginDTO);
		
		return "account/login";
	}

}
