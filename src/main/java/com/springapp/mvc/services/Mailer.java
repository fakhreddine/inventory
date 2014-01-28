package com.springapp.mvc.services;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

/**
 * Created by aleksandrs on 1/28/14.
 */
@Service
@Scope("session")
public class Mailer {
    private static String smtp = "office.csc.lv";
    private static String subject = "This is message from Inventory management system";
    private static String replayTo = "noreplay@csc.lv";
    private static String from = "noreplay@csc.lv";
    private static String to = null;

    private static String templatePassword = "<h3>Password reminder</h3><br />Your current pasword is: ";
    public static void send(String template, String password, String mail) {
        to = mail;

        Properties properties = System.getProperties();
        properties.setProperty("mail.smtp.host", smtp);
        Session session = Session.getInstance(properties);

        try{
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject(subject);
            StringBuilder builder = new StringBuilder();

            if (template.equals("password")){
                builder.append(templatePassword)
                    .append("<strong>")
                    .append(password)
                    .append("</strong><br />")
                    .append("Please do not replay on this message!");
            }

            message.setContent(builder.toString(),"text/html");
            Transport.send(message);
        } catch (AddressException e) {
            e.printStackTrace();
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
