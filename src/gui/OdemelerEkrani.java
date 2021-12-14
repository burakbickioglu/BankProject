package gui;

import database.IBilgiController;
import database.transactions.FaturaOdemeleri;
import database.transactions.HesapBilgileri;
import gui.ayarlar.ActionAyarlari;
import gui.ayarlar.ButtonAyarlari;
import gui.ayarlar.Dialogs;
import gui.ayarlar.IDuzenleyici;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author BurakBickioglu
 */
public class OdemelerEkrani extends javax.swing.JFrame implements IDuzenleyici, IBilgiController {

    private FaturaOdemeleri faturaOdemeleriObject = null;

    public OdemelerEkrani() {
        initComponents();
        getEdits();
    }

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        odemelerEkraniPanel.setFocusable(true);
        this.kullaniciAdiSoyadiLabel.setText("Sayın " + getHesapBilgileri().getAdSoyad());
        this.elektrikBorcuLabel.setText(String.valueOf(getHesapBilgileri().getElektrikFaturasi()));
        this.suBorcuLabel.setText(String.valueOf(getHesapBilgileri().getSuFaturasi()));
        this.dogalgazBorcuLabel.setText(String.valueOf(getHesapBilgileri().getDogalgazFaturasi()));
        this.internetBorcuLabel.setText(String.valueOf(getHesapBilgileri().getInternetFaturasi()));

    }

    @Override
    public boolean bilgilerGecerliMi() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }

    public FaturaOdemeleri getFaturaOdemeleriObject() {
        if (this.faturaOdemeleriObject == null) {
            this.faturaOdemeleriObject = new FaturaOdemeleri();
        }
        return faturaOdemeleriObject;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        odemelerEkraniPanel = new javax.swing.JPanel();
        kullaniciAdiSoyadiLabel = new javax.swing.JLabel();
        geriIcon = new javax.swing.JLabel();
        mesajElektrikLabel = new javax.swing.JLabel();
        elektrikBorcuLabel = new javax.swing.JLabel();
        elektrikOdeButton = new javax.swing.JButton();
        mesajSuLabel = new javax.swing.JLabel();
        suBorcuLabel = new javax.swing.JLabel();
        suOdeButton = new javax.swing.JButton();
        mesajDogalgazLabel = new javax.swing.JLabel();
        dogalgazBorcuLabel = new javax.swing.JLabel();
        dogalgazOdeButton = new javax.swing.JButton();
        mesajInternetLabel = new javax.swing.JLabel();
        internetBorcuLabel = new javax.swing.JLabel();
        internetOdeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kyk114Bank Ödemeler Ekranı");
        setResizable(false);

        odemelerEkraniPanel.setBackground(new java.awt.Color(204, 255, 204));

        kullaniciAdiSoyadiLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        kullaniciAdiSoyadiLabel.setForeground(new java.awt.Color(255, 51, 102));
        kullaniciAdiSoyadiLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        kullaniciAdiSoyadiLabel.setText("SAYIN BURAK BİÇKİOĞLU");

        geriIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/previousIcon.png"))); // NOI18N
        geriIcon.setText("jLabel1");
        geriIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        geriIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                geriIconMouseClicked(evt);
            }
        });

        mesajElektrikLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mesajElektrikLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mesajElektrikLabel.setText("Toplam elektrik faturası borcunuz :");

        elektrikBorcuLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        elektrikBorcuLabel.setForeground(new java.awt.Color(0, 0, 255));
        elektrikBorcuLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        elektrikBorcuLabel.setText("[Elekt Borç]");

        elektrikOdeButton.setBackground(new java.awt.Color(255, 204, 204));
        elektrikOdeButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        elektrikOdeButton.setText("Öde");
        elektrikOdeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        elektrikOdeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                elektrikOdeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                elektrikOdeButtonMouseExited(evt);
            }
        });
        elektrikOdeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elektrikOdeButtonActionPerformed(evt);
            }
        });

        mesajSuLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mesajSuLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mesajSuLabel.setText("Toplam su faturası borcunuz :");

        suBorcuLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        suBorcuLabel.setForeground(new java.awt.Color(0, 0, 255));
        suBorcuLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        suBorcuLabel.setText("[Su Borç]");

        suOdeButton.setBackground(new java.awt.Color(204, 204, 255));
        suOdeButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        suOdeButton.setText("Öde");
        suOdeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        suOdeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                suOdeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                suOdeButtonMouseExited(evt);
            }
        });
        suOdeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suOdeButtonActionPerformed(evt);
            }
        });

        mesajDogalgazLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mesajDogalgazLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mesajDogalgazLabel.setText("Toplam doğalgaz faturası borcunuz :");

        dogalgazBorcuLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dogalgazBorcuLabel.setForeground(new java.awt.Color(0, 0, 255));
        dogalgazBorcuLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        dogalgazBorcuLabel.setText("[Doğalgaz Borç]");

        dogalgazOdeButton.setBackground(new java.awt.Color(255, 0, 102));
        dogalgazOdeButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dogalgazOdeButton.setText("Öde");
        dogalgazOdeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dogalgazOdeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dogalgazOdeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dogalgazOdeButtonMouseExited(evt);
            }
        });
        dogalgazOdeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dogalgazOdeButtonActionPerformed(evt);
            }
        });

        mesajInternetLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mesajInternetLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mesajInternetLabel.setText("Toplam internet faturası borcunuz :");

        internetBorcuLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        internetBorcuLabel.setForeground(new java.awt.Color(0, 0, 255));
        internetBorcuLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        internetBorcuLabel.setText("[İnternet Borç]");

        internetOdeButton.setBackground(new java.awt.Color(0, 255, 204));
        internetOdeButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        internetOdeButton.setText("Öde");
        internetOdeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        internetOdeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                internetOdeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                internetOdeButtonMouseExited(evt);
            }
        });
        internetOdeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                internetOdeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout odemelerEkraniPanelLayout = new javax.swing.GroupLayout(odemelerEkraniPanel);
        odemelerEkraniPanel.setLayout(odemelerEkraniPanelLayout);
        odemelerEkraniPanelLayout.setHorizontalGroup(
            odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(odemelerEkraniPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(geriIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(odemelerEkraniPanelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kullaniciAdiSoyadiLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE)
                            .addGroup(odemelerEkraniPanelLayout.createSequentialGroup()
                                .addGroup(odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mesajElektrikLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mesajSuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mesajDogalgazLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mesajInternetLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(elektrikBorcuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(suBorcuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dogalgazBorcuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(internetBorcuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(elektrikOdeButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(suOdeButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dogalgazOdeButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(internetOdeButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(24, 24, 24))
        );
        odemelerEkraniPanelLayout.setVerticalGroup(
            odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(odemelerEkraniPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(geriIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(kullaniciAdiSoyadiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mesajElektrikLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(elektrikBorcuLabel)
                    .addComponent(elektrikOdeButton))
                .addGap(18, 18, 18)
                .addGroup(odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mesajSuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(suBorcuLabel)
                    .addComponent(suOdeButton))
                .addGap(18, 18, 18)
                .addGroup(odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mesajDogalgazLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dogalgazBorcuLabel)
                    .addComponent(dogalgazOdeButton))
                .addGap(18, 18, 18)
                .addGroup(odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mesajInternetLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(internetBorcuLabel)
                    .addComponent(internetOdeButton))
                .addGap(244, 244, 244))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(odemelerEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(odemelerEkraniPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*
    Button renklendirmeleri
     */
    private void setBgFg(Component component) {
        ButtonAyarlari.setBgFg((JButton) component, Color.black, Color.white);
    }

    private void geriIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_geriIconMouseClicked
        ActionAyarlari.setVisible(this, new HesapEkrani());
    }//GEN-LAST:event_geriIconMouseClicked

    private void elektrikOdeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_elektrikOdeButtonMouseEntered
        this.setBgFg(evt.getComponent());
    }//GEN-LAST:event_elektrikOdeButtonMouseEntered

    private void elektrikOdeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_elektrikOdeButtonMouseExited
        ButtonAyarlari.setOriginalBg((JButton) evt.getComponent());
    }//GEN-LAST:event_elektrikOdeButtonMouseExited

    private void suOdeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suOdeButtonMouseEntered
        this.setBgFg(evt.getComponent());

    }//GEN-LAST:event_suOdeButtonMouseEntered

    private void suOdeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suOdeButtonMouseExited
        ButtonAyarlari.setOriginalBg((JButton) evt.getComponent());
    }//GEN-LAST:event_suOdeButtonMouseExited

    private void dogalgazOdeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dogalgazOdeButtonMouseEntered
        this.setBgFg(evt.getComponent());
    }//GEN-LAST:event_dogalgazOdeButtonMouseEntered

    private void dogalgazOdeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dogalgazOdeButtonMouseExited
        ButtonAyarlari.setOriginalBg((JButton) evt.getComponent());
    }//GEN-LAST:event_dogalgazOdeButtonMouseExited

    private void internetOdeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_internetOdeButtonMouseEntered
        this.setBgFg(evt.getComponent());
    }//GEN-LAST:event_internetOdeButtonMouseEntered

    private void internetOdeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_internetOdeButtonMouseExited
        ButtonAyarlari.setOriginalBg((JButton) evt.getComponent());
    }//GEN-LAST:event_internetOdeButtonMouseExited

    /*
    Actions
     */
    private void elektrikOdeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elektrikOdeButtonActionPerformed
        double elektrikTutari = Double.valueOf(this.elektrikBorcuLabel.getText());
        if (this.faturaOncedenOdenmisMi(elektrikTutari)) {
            Dialogs.ozelMesajGoster(this, "Elektrik faturası zaten ödenmiş !");
        } else {
            this.faturayiOde("elektrik", elektrikTutari);
        }
    }//GEN-LAST:event_elektrikOdeButtonActionPerformed

    private void suOdeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suOdeButtonActionPerformed
        double suTutari = Double.valueOf(this.suBorcuLabel.getText());
        if (this.faturaOncedenOdenmisMi(suTutari)) {
            Dialogs.ozelMesajGoster(this, "Su faturası zaten ödenmiş !");
        } else {
            this.faturayiOde("su", suTutari);
        }
    }//GEN-LAST:event_suOdeButtonActionPerformed

    private void dogalgazOdeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dogalgazOdeButtonActionPerformed
        double dogalgazTutari = Double.valueOf(this.dogalgazBorcuLabel.getText());
        if (this.faturaOncedenOdenmisMi(dogalgazTutari)) {
            Dialogs.ozelMesajGoster(this, "Doğalgaz faturası zaten ödenmiş !");
        } else {
            this.faturayiOde("dogalgaz", dogalgazTutari);
        }
    }//GEN-LAST:event_dogalgazOdeButtonActionPerformed

    private void internetOdeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_internetOdeButtonActionPerformed
        double internetTutari = Double.valueOf(this.internetBorcuLabel.getText());
        if (this.faturaOncedenOdenmisMi(internetTutari)) {
            Dialogs.ozelMesajGoster(this, "Internet faturası zaten ödenmiş !");
        } else {
            this.faturayiOde("internet", internetTutari);
        }
    }//GEN-LAST:event_internetOdeButtonActionPerformed

    private boolean faturaOncedenOdenmisMi(double odenecekTutar) {
        return odenecekTutar == 0.0;
    }

    private void faturayiOde(String faturaIsmi, double faturaTutari) {
        this.getFaturaOdemeleriObject().setFaturaIsmi(faturaIsmi);
        this.getFaturaOdemeleriObject().setFaturaTutari(faturaTutari);

        if (getFaturaOdemeleriObject().faturaOdendiMi()) {
            Dialogs.ozelMesajGoster(this, "Faturanız başarıyla ödenmiştir.");
            ActionAyarlari.setVisible(this, new HesapEkrani());
        } else {
            Dialogs.ozelMesajGoster(this, "Ödeme işlemi gerçekleştirilemedi.");
        }
    }

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
            java.util.logging.Logger.getLogger(OdemelerEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OdemelerEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OdemelerEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OdemelerEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OdemelerEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dogalgazBorcuLabel;
    private javax.swing.JButton dogalgazOdeButton;
    private javax.swing.JLabel elektrikBorcuLabel;
    private javax.swing.JButton elektrikOdeButton;
    private javax.swing.JLabel geriIcon;
    private javax.swing.JLabel internetBorcuLabel;
    private javax.swing.JButton internetOdeButton;
    private javax.swing.JLabel kullaniciAdiSoyadiLabel;
    private javax.swing.JLabel mesajDogalgazLabel;
    private javax.swing.JLabel mesajElektrikLabel;
    private javax.swing.JLabel mesajInternetLabel;
    private javax.swing.JLabel mesajSuLabel;
    private javax.swing.JPanel odemelerEkraniPanel;
    private javax.swing.JLabel suBorcuLabel;
    private javax.swing.JButton suOdeButton;
    // End of variables declaration//GEN-END:variables
}
