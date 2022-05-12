package coms.DemoSpringBootApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {

	@GetMapping("/")
	public String HomePageInfo()
	{
		return "HomePage";
	}
	
	@GetMapping("home")
	public String HomePageInfo1()
	{
		return "HomePage";
	}
	

	@GetMapping("p1")
	public String DemoPage1()
	{
		return "Page1";
	}
	
	@GetMapping("p2")
	public String DemoPage2()
	{
		return "Page2";
	}
	
	@GetMapping("login")
	public String Login()
	{
		return "LoginPage";
	}
	
	@PostMapping("loginProcess")
	public String Login(@RequestParam("txtUser") String user, @RequestParam("txtPass") String pass, Model m)
	{
		if(user.equals("venugopal") && pass.equals("12345"))
			return "Welcome";
		else
			m.addAttribute("msg", "Please check username/password");
		
		return "LoginPage";
	}
	
	@GetMapping("welcome")
	public String WelcomePage()
	{
		return "Welcome";
	}
}
