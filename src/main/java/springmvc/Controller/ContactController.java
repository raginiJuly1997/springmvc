package springmvc.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import springmvc.Model.User;
import springmvc.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;



@Controller
public class ContactController {
	
	
	@Autowired
	private UserService userService;
	
	@ModelAttribute
	public void  commonDataForModel(Model m) {
		
		m.addAttribute("Header","LearnSpring");
		m.addAttribute("Desc","Home for prohrammer");
	
	}
	
	
	@RequestMapping("/contact")
	public String showForm(Model m){
			return "contact";
	}

	
@RequestMapping(path= "/processform",method=RequestMethod.POST)
	
	public String handleForm(@ModelAttribute User user,Model model) 
	{
		int createdUser=this.userService.createUser(user);
	    model.addAttribute("msg", "user created with id"+createdUser);
		//System.out.println("user:"+user);
		
		
		if(user.getUserName().isBlank())
		{
			return "redirect;/contact";
		}
	
		
		return "success";
	}
	
/*	@RequestMapping(path= "/processform",method=RequestMethod.POST)
	
	public String handleForm(
			@RequestParam("email") String userEmail,
			@RequestParam("UserName") String userName,
			@RequestParam("password") String Userpassword,
			Model model) 
	{
		
		User user=new User();
		user.setEmail(userEmail);
		user.setUserName(userName);
		user.setPassword(Userpassword);
		
		
		
		model.addAttribute("user",user);
		System.out.println("user:"+user);
		
		
		
	/*	model.addAttribute("email",userEmail);
		model.addAttribute("userName",userName);
		model.addAttribute("password",Userpassword);
		
		
		
		System.out.println("email:"+userEmail);
		System.out.println("userName:"+userName);
		System.out.println("Userpassword:"+Userpassword);
	
		
		return "success";
	}*/
}
