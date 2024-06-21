//package com.zak.controller;
//
//import java.util.Random;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import com.zak.service.EmailService;
//
//import jakarta.servlet.http.HttpSession;
//
//@Controller
//public class ForgotController {
//	Random random = new Random(1000);
//	
//	@Autowired
//	private EmailService emailService;
//	
//	
//	
//	//email id open handler
//	@RequestMapping("/forgot")
//	public String openEmailForm() {
//		return "forgot_email_form";
//	}
//	
//	@PostMapping("/send-otp")
//	public String sendOTP(@RequestParam("email") String email, HttpSession session) {
//		System.out.println("EMAIL "+email);
//		
//		//generating 4 digit otp
//	
//		int otp = random.nextInt(999999);
//		System.out.println("OTP "+otp);
//		
//		//write code for send otp to email
//		
//		String subject = "OTP from Resume Builder";
//		String message = " OTP = "+otp+"";
//		String to=email;
//		
//		boolean flag = this.emailService.sendEmail(subject, message, to);
//		
//		if(flag) {
//			session.setAttribute("otp", otp);
//			return "verify_otp";
//			
//		}else {
//			session.setAttribute("message", "Check your email id !!");
//			return "forgot_email_form";
//		}
//	
//	}
//
//}
