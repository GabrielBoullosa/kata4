package kata4.main;

import java.util.List;
import kata4.model.Histograma;
import kata4.model.Mail;
import kata4.view.HistogramDisplay;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailListReader;

public class Kata4 {

    public static void main(String[] args) {
        String fileName = new String("email.txt");
        List<Mail> mailList = MailListReader.read(fileName);
        Histograma histogram =  MailHistogramBuilder.build(mailList);
        HistogramDisplay histogramDisplay = new HistogramDisplay(histogram);
        histogramDisplay.execute();
        
    }
    
}
