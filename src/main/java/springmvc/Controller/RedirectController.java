package springmvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectController {
	
	@RequestMapping("/one")
	public String one() 
	{
		System.out.println("this is one handler");
		
		return " ";
		/*RedirectView redirectView=new RedirectView();
		redirectView.setUrl("/enjoy");
		return redirectView;*/
	}
	
	@RequestMapping("/enjoy")
	public String two()
	{
		System.out.println("this is two handler");

		return "contact";
	}
}
