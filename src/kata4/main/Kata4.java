package kata4.main;

import kata4.model.Histograma;
import kata4.view.HistogramDisplay;

public class Kata4 {

    public static void main(String[] args) {
        Histograma<String> histogram = new Histograma<>();
        
        histogram.increment("gmail.com");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("dis.ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("gmail.com");
        histogram.increment("dis.ulpgc.es");
        histogram.increment("gmail.com");
        
        
        HistogramDisplay histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    }
    
}
