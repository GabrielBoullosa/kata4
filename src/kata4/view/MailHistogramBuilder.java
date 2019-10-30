package kata4.view;


import java.util.List;
import kata4.model.Histograma;
import kata4.model.Mail;

public class MailHistogramBuilder {
    public static Histograma build(List<Mail> mailList){
        Histograma<String> histogram = new Histograma();
        
        for(Mail mail: mailList){
            histogram.increment(mail.getDomain());
        }
        return histogram;
    }
}
