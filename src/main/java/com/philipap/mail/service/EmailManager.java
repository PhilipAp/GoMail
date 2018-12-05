package com.philipap.mail.service;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class EmailManager {
	
	private EmailService emailService;	
	
	private EmailManager(EmailService emailService) {
		this.emailService = emailService;
	}
	
	//Can be scheduled with a cron to send email at desired time intervals if you wish to
	public void sendEmail() {
		String to = "recipient@gmail.com";//Email left for brevity
		String subject = "Jave Tutorials";
		String text = "Pls where can i get a copy of your learning materials";
		try {
			emailService.sendSimpleMessage(to, subject, text);
		} catch (Exception e) {
			log.error("",e);
		}
	}

}
