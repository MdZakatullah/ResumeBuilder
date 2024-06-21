//package com.zak.service;
//
//import java.util.Properties;
//
//import org.springframework.stereotype.Service;
//
//import jakarta.mail.Authenticator;
//import jakarta.mail.Message;
//import jakarta.mail.PasswordAuthentication;
//import jakarta.mail.Session;
//import jakarta.mail.Transport;
//import jakarta.mail.internet.InternetAddress;
//import jakarta.mail.internet.MimeMessage;
//
////import org.springframework.beans.factory.annotation.Autowired;
////import org.springframework.mail.SimpleMailMessage;
////import org.springframework.mail.javamail.JavaMailSender;
////import org.springframework.stereotype.Service;
//
//@Service
//public class EmailService {
////
////    @Autowired
////    private JavaMailSender mailSender;
//
////    public void sendResetToken(String email, String token) {
////        SimpleMailMessage message = new SimpleMailMessage();
////        message.setTo(email);
////        message.setSubject("Password Reset Request");
////        message.setText("To reset your password, click the link below:\n" + "http://localhost:8080/reset-password?token=" + token);
////        mailSender.send(message);
////    }
//	
//	//System.out.println(preparing to send message..");
////	String message="Hello, dear, this is message for security check";
////	String subject="CodersArea : Confirmation";
////	String to="mdzakatullah444@gmail.com";
////	String from="mdzakatullah444@gmail.com";
//	
//	
//	public boolean sendEmail(String subject, String message, String to) {
//		
//		boolean f=false;
//		
//		String from="mdzakatullah444@gmail.com";
//		
//		//variable for gmail
//		String host="smtp.gmail.com";
//		
//		//get the system properties
//		Properties properties=System.getProperties();
//		System.out.println("PROPERTIES"+properties);
//		
//		//setting important information to properties object
//		//host set
//		properties.put("mail.smtp.host", host);
//		properties.put("mail.smtp.port", "465");
//		properties.put("mail.smtp.ssl.enable", "true");
//		properties.put("mail.smtp.auth", "true");
//		
//		//step1: to get the session object
//		Session session=Session.getInstance(properties, new Authenticator() {
//
//			@Override
//			protected PasswordAuthentication getPasswordAuthentication() {
//				
//				return new PasswordAuthentication("mdzakatullah444@gmail.com", "Md@95463");
//			}
//			
//			
//		});
//		session.setDebug(true);
//		
//		//step2:compose the message[text, multi media] 
//		MimeMessage m=new MimeMessage(session);
//		
//		try {
//			
//		//from email
//		m.setFrom(from);
//		
//		//adding recepient to message
//		m.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
//		
//		//adding subject to message
//		m.setSubject(subject);
//		
//		//adding text to message
//		m.setText(message);
//		
//		//send
//		
//		//step3: send the message using transport class
//		Transport.send(m);
//		
//		System.out.println("Send success...");
//		f=true;
//		
//		
//	}catch (Exception e) {
//		e.printStackTrace();
//	}
//		return f;
//	}
//	
//	
//}
//
