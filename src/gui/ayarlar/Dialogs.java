
package gui.ayarlar;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Dialogs {
    
    public static void bosOlamazMesajiGoster(JFrame frame){
        JOptionPane.showMessageDialog(frame, "Tüm alanlar doldurulmalıdır.");
    }
    
    public static void ozelMesajGoster(JFrame frame, String mesaj){
        JOptionPane.showMessageDialog(frame, mesaj);
    }
    
    public static int onayMesajiGoster(JFrame frame, String mesaj){
        int optionType = JOptionPane.YES_NO_OPTION;
        int selected = JOptionPane.showConfirmDialog(frame, mesaj, "UYARI",optionType);
        if(optionType == selected){
            return 1;
        }else{
            return 0;
        }
    }
}
