/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import database.IBilgiController;
import database.transactions.HesapBilgileri;
import database.transactions.TelNoYenileme;
import gui.ayarlar.ActionAyarlari;
import gui.ayarlar.Dialogs;
import gui.ayarlar.IDuzenleyici;

import gui.ayarlar.TextAyarlari;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author BurakBickioglu
 */
public class AyarlarEkrani extends javax.swing.JFrame implements IDuzenleyici, IBilgiController {

    private TelNoYenileme telNoYenilemeObject = null;

    private String eskiTelNo = null;

    public AyarlarEkrani() {
        initComponents();
        getEdits();
    }

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        ayarlarEkraniPanel.setFocusable(true);
        TextAyarlari.setOnlyNumber(telNoText);
        TextAyarlari.setMaxLimit(telNoText, 11);
        telNoText.setText(getHesapBilgileri().getTelNo());
        eskiTelNo = telNoText.getText();
        this.kullaniciAdiSoyadiLabel.setText("Sayın " + getHesapBilgileri().getAdSoyad());

    }

    @Override
    public boolean bilgilerGecerliMi() {
        return !(this.telNoText.getText().equals(""));
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }

    public TelNoYenileme getTelNoYenilemeObject() {
        if (this.telNoYenilemeObject == null) {
            this.telNoYenilemeObject = new TelNoYenileme();
        }
        return telNoYenilemeObject;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ayarlarEkraniPanel = new javax.swing.JPanel();
        geriIcon = new javax.swing.JLabel();
        kullaniciAdiSoyadiLabel = new javax.swing.JLabel();
        mesajTelNoLabel = new javax.swing.JLabel();
        telNoText = new javax.swing.JTextField();
        telNoDegistirIcon = new javax.swing.JLabel();
        mesajTelNoLabel1 = new javax.swing.JLabel();
        sifreText = new javax.swing.JTextField();
        sifreDegistirIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Kyk114Bank Ayarlar Ekranı");

        ayarlarEkraniPanel.setBackground(new java.awt.Color(255, 255, 204));

        geriIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/previousIcon.png"))); // NOI18N
        geriIcon.setText("jLabel1");
        geriIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        geriIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                geriIconMouseClicked(evt);
            }
        });

        kullaniciAdiSoyadiLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        kullaniciAdiSoyadiLabel.setForeground(new java.awt.Color(255, 51, 102));
        kullaniciAdiSoyadiLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        kullaniciAdiSoyadiLabel.setText("SAYIN BURAK BİÇKİOĞLU");

        mesajTelNoLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mesajTelNoLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mesajTelNoLabel.setText("Telefon Numaranız :");

        telNoText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        telNoText.setEnabled(false);

        telNoDegistirIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/updateTelIcon.png"))); // NOI18N
        telNoDegistirIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        telNoDegistirIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telNoDegistirIconMouseClicked(evt);
            }
        });

        mesajTelNoLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mesajTelNoLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mesajTelNoLabel1.setText("Şifreniz :");

        sifreText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sifreText.setText("**********");
        sifreText.setEnabled(false);

        sifreDegistirIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/updateTelIcon.png"))); // NOI18N
        sifreDegistirIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sifreDegistirIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sifreDegistirIconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ayarlarEkraniPanelLayout = new javax.swing.GroupLayout(ayarlarEkraniPanel);
        ayarlarEkraniPanel.setLayout(ayarlarEkraniPanelLayout);
        ayarlarEkraniPanelLayout.setHorizontalGroup(
            ayarlarEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ayarlarEkraniPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ayarlarEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ayarlarEkraniPanelLayout.createSequentialGroup()
                        .addComponent(geriIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(ayarlarEkraniPanelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(ayarlarEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ayarlarEkraniPanelLayout.createSequentialGroup()
                                .addComponent(mesajTelNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(telNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(telNoDegistirIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(kullaniciAdiSoyadiLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(ayarlarEkraniPanelLayout.createSequentialGroup()
                                .addComponent(mesajTelNoLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(sifreText, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sifreDegistirIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        ayarlarEkraniPanelLayout.setVerticalGroup(
            ayarlarEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ayarlarEkraniPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(geriIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kullaniciAdiSoyadiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(ayarlarEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(telNoDegistirIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(ayarlarEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(mesajTelNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(telNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(ayarlarEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sifreDegistirIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(ayarlarEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(mesajTelNoLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(sifreText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45))
        );

        ayarlarEkraniPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {sifreText, telNoText});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ayarlarEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ayarlarEkraniPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void geriIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_geriIconMouseClicked
        ActionAyarlari.setVisible(this, new HesapEkrani());
    }//GEN-LAST:event_geriIconMouseClicked

    private int clickCounter = 0;
    private void telNoDegistirIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_telNoDegistirIconMouseClicked
        // Button a ilk defa tıklanıyor ise burası çalışır
        if (this.clickCounter == 0) {
            telNoText.setEnabled(true);
            telNoDegistirIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/updateTelIcon2.png")));
            clickCounter++;
        } else { // daha önce tıklanmışsa
            telNoText.setEnabled(false);
            this.telNoYenile();
            telNoDegistirIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/updateTelIcon.png")));
            clickCounter = 0;
        }

    }//GEN-LAST:event_telNoDegistirIconMouseClicked

    private void telNoYenile() {
        if (this.bilgilerGecerliMi()) {
            String yeniTelNo = this.telNoText.getText().trim();
            getTelNoYenilemeObject().setTelNo(yeniTelNo);
            if (getTelNoYenilemeObject().telNoYenilendiMi()) {
                Dialogs.ozelMesajGoster(this, "Telefon numarası " + yeniTelNo + " olarak güncellenmiştir.");
            } else {
                Dialogs.ozelMesajGoster(this, "Başarısız. Bilgileri kontrol edin !");
                this.telNoText.setText(this.eskiTelNo);

            }
        } else {
            Dialogs.bosOlamazMesajiGoster(this);
            this.telNoText.setText(this.eskiTelNo);

        }
    }

    private void sifreDegistirIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sifreDegistirIconMouseClicked
        ActionAyarlari.setVisible(this, new SifreYenilemeEkrani());
    }//GEN-LAST:event_sifreDegistirIconMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AyarlarEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AyarlarEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AyarlarEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AyarlarEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AyarlarEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ayarlarEkraniPanel;
    private javax.swing.JLabel geriIcon;
    private javax.swing.JLabel kullaniciAdiSoyadiLabel;
    private javax.swing.JLabel mesajTelNoLabel;
    private javax.swing.JLabel mesajTelNoLabel1;
    private javax.swing.JLabel sifreDegistirIcon;
    private javax.swing.JTextField sifreText;
    private javax.swing.JLabel telNoDegistirIcon;
    private javax.swing.JTextField telNoText;
    // End of variables declaration//GEN-END:variables
}
