package com.zak.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.zak.model.UserDtls;
import com.zak.repository.UserRepository;

@Controller
public class HomeController {
	
	@Autowired
	private UserRepository repo;
	
	@GetMapping("/")
	public String landingPage() {
		return "landingPage";
	}
	
	@GetMapping("/sign")
	public String signup() {
		return "signup";
	}
	
	@GetMapping("/log")
	public String login() {
		return "login";
	}
	
	@PostMapping("/registerUser")
	public String registerUser(@ModelAttribute UserDtls u) {
		System.out.println(u);
		repo.save(u);
		return "redirect:/log";
	}
	
	@PostMapping("/loginUser")
	public String loginUser(@ModelAttribute UserDtls u) {
		return "redirect:/dash";
	}
	
	@GetMapping("/fpassword")
	public String forgotPassword() {
		return "forgotPassword";
	}
	
	@GetMapping("/forgotemail")
	public String forgot_email_form() {
		return "forgot_email_form";
	}
	
	@GetMapping("/edit")
	public String editor() {
		return "editor";
	}
	
	@GetMapping("/rt")
	public String resumeTemplate() {
		return "resumeTemplate";
	}
	
	@GetMapping("/pro")
	public String profile() {
		return "profile";
	}
	
	@GetMapping("/dash")
	public String dashboard() {
		return "dashboard";
	}
	
	@GetMapping("/abt")
	public String about() {
		return "about";
	}
	
	@GetMapping("/prodisplay")
	public String profileDisplay() {
		return "profileDisplay";
	}
	
	@GetMapping("/care")
	public String career() {
		return "career";
	}
	
}
