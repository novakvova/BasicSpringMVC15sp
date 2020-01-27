package mvcdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/home")
	public String showPage() {
		System.out.println("---hello home action---");
		return "home";
	}
}
