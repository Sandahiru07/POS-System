package pos_system;
import java.util.Random;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;
/**
 *
 * @author Sadahiru
 */
public class OTPGenerator {
    public static String generateOTP() {
        Random random = new Random();
        int otp = 100000 + random.nextInt(900000); // Generate 6-digit OTP
        return String.valueOf(otp);
    }
    public static boolean sendEmail(String recipientEmail, String otp) {
        final String senderEmail = "otpcenter07@gmail.com";
        final String senderPassword = "lchb pcif kzym lgwm";

        // Set up properties for email
        Properties properties = new Properties();
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");

        // Authenticate
        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(senderEmail, senderPassword);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(senderEmail));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipientEmail));
            message.setSubject("Your OTP for Password Reset");
            message.setText("Your OTP is: " + otp);

            Transport.send(message);
            return true; // Email sent successfully
        } catch (MessagingException e) {
            e.printStackTrace();
            return false; // Email sending failed
        }
    }

}
