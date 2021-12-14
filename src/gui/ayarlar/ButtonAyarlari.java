package gui.ayarlar;

import java.awt.Color;
import javax.swing.JButton;

public class ButtonAyarlari {

    /*
    Arkaplan ve yazı rengi ayarları
    */
    private static Color originalBgColor, originalFgColor;

    public static void setBgFg(JButton button, Color bgColor, Color fgColor) {
        originalBgColor = button.getBackground();
        originalFgColor = button.getForeground();
        button.setBackground(bgColor);
        button.setForeground(fgColor);
    }

    public static void setOriginalBg(JButton button) {
        button.setBackground(originalBgColor);
        button.setForeground(originalFgColor);
    }
}
