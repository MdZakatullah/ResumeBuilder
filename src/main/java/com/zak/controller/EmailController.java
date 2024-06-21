//package com.zak.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.zak.model.EmailRequest;
//import com.zak.service.EmailService;
//
//@RestController
//public class EmailController {
//	
//	@Autowired
//	private EmailService emailService;
//	
//	@RequestMapping("/welcome")
//	public String welcome() {
//		return "Hello this is my email api";
//	}
//	
//	//api to send email
//	@RequestMapping(value = "/sendemail", method = RequestMethod.POST)
//	public ResponseEntity<?> sendEmail(@RequestBody EmailRequest request){
//		boolean result=this.emailService.sendEmail(request.getSubject(), request.getMessage(), request.getTo());
//		
//		if(result) {
//			return ResponseEntity.ok("Email sent successfully..");
//		}else {
//			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Email not sent..");
//		}
//		
//		
//	}
//
//}
