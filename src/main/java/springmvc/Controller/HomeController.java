package springmvc.Controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home(Model model){
		
		System.out.println("This is home url");
		model.addAttribute("name","Ragini chaudhary");
		model.addAttribute("id",124);
		
		List<String> friends=new ArrayList<String>();
		friends.add("khushboo");
		friends.add("ppoja");
		friends.add("Ragini");
		
		model.addAttribute("f",friends);
		return "index";
	}
	
	@RequestMapping("/about")
public String about(){
		
		System.out.println("This is about page");
		
		return "about";
	}

	@RequestMapping("/help")
	public ModelAndView help() {

		System.out.println("This is help page");
		
		ModelAndView modelAndView= new ModelAndView();
		modelAndView.addObject("name", "Pooja chaudhary");
		modelAndView.addObject("roll", 26);
		LocalDateTime now=LocalDateTime.now();
		modelAndView.addObject("time", now);
		
		List<Integer> list=new ArrayList<Integer>();
		
		list.add(12);
		list.add(112);
		list.add(132);
		list.add(142);
		modelAndView.addObject("marks",list);
		modelAndView.setViewName("help");
		
		return modelAndView;
	}
	
}
