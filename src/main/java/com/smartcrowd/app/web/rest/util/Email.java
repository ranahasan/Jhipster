package com.smartcrowd.app.web.rest.util;


import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

/**
 * Created by rana
 */
public class Email {

    private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    static Properties mailServerProperties;
    static Session getMailSession;
    static MimeMessage generateMailMessage;

    public Boolean Send(Emails emails) {
        String EMAIL_SENDER_ID = "sakib35-164@diu.edu.bd";
        String EMAIL_SENDER_PASSWORD = "123456";
        Boolean emailStatus = false;

        try {
            // Step1
            System.out.println("\n 1st ===> setup Mail Server Properties..");
            mailServerProperties = System.getProperties();
            mailServerProperties.put("mail.smtp.port", "587");
            mailServerProperties.put("mail.smtp.auth", "true");
            mailServerProperties.put("mail.smtp.starttls.enable", "true");
            System.out.println("Mail Server Properties have been setup successfully..");

            // Step2
            System.out.println("\n\n 2nd ===> get Mail Session..");
            getMailSession = Session.getDefaultInstance(mailServerProperties, null);
            generateMailMessage = new MimeMessage(getMailSession);

            generateMailMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(emails.getTo()));

            generateMailMessage.addRecipient(Message.RecipientType.CC, new InternetAddress(emails.getCc()));
            generateMailMessage.setSubject(emails.getSubject());
            String emailBody = emails.getEmailBody();
            generateMailMessage.setContent(emailBody, "text/html");
            System.out.println("Mail Session has been created successfully..");

            // Step3
            System.out.println("\n\n 3rd ===> Get Session and Send mail");
            Transport transport = getMailSession.getTransport("smtp");

            // Enter your correct gmail UserID and Password
            // if you have 2FA enabled then provide App Specific Password
            transport.connect("smtp.gmail.com", EMAIL_SENDER_ID, EMAIL_SENDER_PASSWORD);
            transport.sendMessage(generateMailMessage, generateMailMessage.getAllRecipients());
            transport.close();
            emailStatus = true;

        } catch (MessagingException e) {
            e.printStackTrace();
        }
        return emailStatus;
    }
}
