/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import database.IBilgiController;
import database.transactions.HesapBilgileri;
import database.transactions.ParaYatirma;
import gui.ayarlar.ActionAyarlari;
import gui.ayarlar.Dialogs;
import gui.ayarlar.IDuzenleyici;
import gui.ayarlar.TextAyarlari;
import javax.swing.JOptionPane;

/**
 *
 * @author BurakBickioglu
 */
public class ParaYatirmaEkrani extends javax.swing.JFrame implements IDuzenleyici, IBilgiController {

    private ParaYatirma paraYatirmaObject = null;

    private int yatirilacakMiktar = 0;

    public ParaYatirmaEkrani() {
        initComponents();
        getEdits();
    }

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        paraYatirmaEkraniPanel.setFocusable(true);
        TextAyarlari.setOnlyNumber(yatirilacakMiktarText);
        TextAyarlari.setMaxLimit(yatirilacakMiktarText, 5);
        this.kullaniciAdiSoyadiLabel.setText("Sayın " + getHesapBilgileri().getAdSoyad());
        this.bakiyeLabel.setText(String.valueOf(getHesapBilgileri().getBakiye()));

    }

    @Override
    public boolean bilgilerGecerliMi() {
        return !(this.yatirilacakMiktarText.getText().equals(""));
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }

    public ParaYatirma getParaYatirmaObject() {
        if (paraYatirmaObject == null) {
            paraYatirmaObject = new ParaYatirma();
        }
        return paraYatirmaObject;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paraYatirmaEkraniPanel = new javax.swing.JPanel();
        kullaniciAdiSoyadiLabel = new javax.swing.JLabel();
        limitUyariLabel = new javax.swing.JLabel();
        toplamBakiyenizLabel = new javax.swing.JLabel();
        bakiyeLabel = new javax.swing.JLabel();
        yatiracaginizMiktarLabel = new javax.swing.JLabel();
        yatirilacakMiktarText = new javax.swing.JTextField();
        paraYatirButton = new javax.swing.JButton();
        geriIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kyk114Bank Para Yatırma Ekranı");
        setResizable(false);

        paraYatirmaEkraniPanel.setBackground(new java.awt.Color(204, 204, 255));

        kullaniciAdiSoyadiLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        kullaniciAdiSoyadiLabel.setForeground(new java.awt.Color(255, 51, 102));
        kullaniciAdiSoyadiLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        kullaniciAdiSoyadiLabel.setText("SAYIN BURAK BİÇKİOĞLU");

        limitUyariLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        limitUyariLabel.setText("Tek seferde 40.000 TL ve altını yatırabilirsiniz.");

        toplamBakiyenizLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        toplamBakiyenizLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        toplamBakiyenizLabel.setText("Toplam Bakiyeniz :");

        bakiyeLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bakiyeLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bakiyeLabel.setText("[BAKİYE]");

        yatiracaginizMiktarLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        yatiracaginizMiktarLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        yatiracaginizMiktarLabel.setText("Çekeceğiniz Miktar:");

        yatirilacakMiktarText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                yatirilacakMiktarTextKeyReleased(evt);
            }
        });

        paraYatirButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        paraYatirButton.setText("Para Yatır");
        paraYatirButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        paraYatirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paraYatirButtonActionPerformed(evt);
            }
        });

        geriIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/previousIcon.png"))); // NOI18N
        geriIcon.setText("jLabel1");
        geriIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        geriIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                geriIconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout paraYatirmaEkraniPanelLayout = new javax.swing.GroupLayout(paraYatirmaEkraniPanel);
        paraYatirmaEkraniPanel.setLayout(paraYatirmaEkraniPanelLayout);
        paraYatirmaEkraniPanelLayout.setHorizontalGroup(
            paraYatirmaEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paraYatirmaEkraniPanelLayout.createSequentialGroup()
                .addGroup(paraYatirmaEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paraYatirmaEkraniPanelLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(paraYatirmaEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(paraYatirmaEkraniPanelLayout.createSequentialGroup()
                                .addGroup(paraYatirmaEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(paraYatirmaEkraniPanelLayout.createSequentialGroup()
                                        .addComponent(toplamBakiyenizLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(bakiyeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(paraYatirmaEkraniPanelLayout.createSequentialGroup()
                                        .addComponent(yatiracaginizMiktarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(paraYatirmaEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(paraYatirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(yatirilacakMiktarText))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(kullaniciAdiSoyadiLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(paraYatirmaEkraniPanelLayout.createSequentialGroup()
                        .addGroup(paraYatirmaEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(paraYatirmaEkraniPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(geriIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(paraYatirmaEkraniPanelLayout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(limitUyariLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 69, Short.MAX_VALUE)))
                .addContainerGap())
        );
        paraYatirmaEkraniPanelLayout.setVerticalGroup(
            paraYatirmaEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paraYatirmaEkraniPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(geriIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(kullaniciAdiSoyadiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(limitUyariLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(paraYatirmaEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(toplamBakiyenizLabel)
                    .addComponent(bakiyeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paraYatirmaEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yatiracaginizMiktarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yatirilacakMiktarText, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(paraYatirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paraYatirmaEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(paraYatirmaEkraniPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void yatirilacakMiktarTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_yatirilacakMiktarTextKeyReleased
        this.yatirilacakMiktar = TextAyarlari.checkTheTextKeyReleased(yatirilacakMiktarText, 40000);
    }//GEN-LAST:event_yatirilacakMiktarTextKeyReleased

    private void paraYatirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paraYatirButtonActionPerformed
        if (bilgilerGecerliMi()) {
            this.paraYatir();
        } else {
            Dialogs.bosOlamazMesajiGoster(this);
        }

    }//GEN-LAST:event_paraYatirButtonActionPerformed

    private void paraYatir() {
        this.getParaYatirmaObject().setYatirilacakMiktar(this.yatirilacakMiktar);
        if(getParaYatirmaObject().paraYatirildiMi()){
            Dialogs.ozelMesajGoster(this, "Para başarıyla hesabınıza tanımlanmıştır.\nYatırılan miktar : " + this.yatirilacakMiktar + " TL");
            ActionAyarlari.setVisible(this, new HesapEkrani());
        }else{
            Dialogs.ozelMesajGoster(this, "Bilgilerinizi kontrol edin !");
        }
        
    }
    private void geriIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_geriIconMouseClicked
        ActionAyarlari.setVisible(this, new HesapEkrani());
    }//GEN-LAST:event_geriIconMouseClicked

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
            java.util.logging.Logger.getLogger(ParaYatirmaEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ParaYatirmaEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ParaYatirmaEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ParaYatirmaEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ParaYatirmaEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bakiyeLabel;
    private javax.swing.JLabel geriIcon;
    private javax.swing.JLabel kullaniciAdiSoyadiLabel;
    private javax.swing.JLabel limitUyariLabel;
    private javax.swing.JButton paraYatirButton;
    private javax.swing.JPanel paraYatirmaEkraniPanel;
    private javax.swing.JLabel toplamBakiyenizLabel;
    private javax.swing.JLabel yatiracaginizMiktarLabel;
    private javax.swing.JTextField yatirilacakMiktarText;
    // End of variables declaration//GEN-END:variables
}
