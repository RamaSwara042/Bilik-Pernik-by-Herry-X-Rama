/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author iwaya
 */
public class KataSandiBaruPage extends javax.swing.JFrame {
        public String NamaPengguna; //Variabel global dari username
        public String Email; //Variabel global dari email

    /**
     * Creates new form KataSandiBaruPage
     */
    public KataSandiBaruPage() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        KataSandiBaru_TextField.setBackground(new java.awt.Color(0,0,0,1));
        KonfirmasiKataSandiBaru_TextField.setBackground(new java.awt.Color(0,0,0,1));
    }

    KataSandiBaruPage(String NamaPenggunaEmail) {
        initComponents();
        NamaPengguna = NamaPenggunaEmail;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Logo_Picture = new javax.swing.JLabel();
        Latar_Picture = new javax.swing.JLabel();
        KataSandiBaru_TextField = new javax.swing.JPasswordField();
        KataSandiBaru_Text = new javax.swing.JLabel();
        MataTutup1_Icon = new javax.swing.JLabel();
        KataSandiBaru_Field = new javax.swing.JLabel();
        KonfirmasiKataSandiBaru_TextField = new javax.swing.JPasswordField();
        KonfirmasiKataSandiBaru_Text = new javax.swing.JLabel();
        MataTutup2_Icon = new javax.swing.JLabel();
        KonfirmasiKataSandiBaru_Field = new javax.swing.JLabel();
        KataSandi_NotifFalse = new javax.swing.JLabel();
        Konfirmasi_Tombol = new javax.swing.JLabel();
        KataSandiBaru_Picture = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(48, 57, 150));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Logo_Picture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/KataSandiBaruPage/Logo.png"))); // NOI18N
        jPanel1.add(Logo_Picture, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 82, -1, -1));

        Latar_Picture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/KataSandiBaruPage/Gambar Latar.png"))); // NOI18N
        jPanel1.add(Latar_Picture, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 23, -1, -1));

        KataSandiBaru_TextField.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        KataSandiBaru_TextField.setForeground(new java.awt.Color(255, 255, 255));
        KataSandiBaru_TextField.setBorder(null);
        KataSandiBaru_TextField.setEchoChar('\u25cf');
        KataSandiBaru_TextField.setOpaque(false);
        KataSandiBaru_TextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                KataSandiBaru_TextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                KataSandiBaru_TextFieldFocusLost(evt);
            }
        });
        KataSandiBaru_TextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                KataSandiBaru_TextFieldKeyPressed(evt);
            }
        });
        jPanel1.add(KataSandiBaru_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 515, 300, 30));

        KataSandiBaru_Text.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/KataSandiBaruPage/Kata Sandi.png"))); // NOI18N
        jPanel1.add(KataSandiBaru_Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(1309, 521, -1, -1));

        MataTutup1_Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/KataSandiBaruPage/Mata Tutup.png"))); // NOI18N
        MataTutup1_Icon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MataTutup1_IconMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MataTutup1_IconMousePressed(evt);
            }
        });
        jPanel1.add(MataTutup1_Icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(1610, 515, -1, -1));

        KataSandiBaru_Field.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/KataSandiBaruPage/Kata Sandi Field.png"))); // NOI18N
        jPanel1.add(KataSandiBaru_Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(1231, 493, -1, -1));

        KonfirmasiKataSandiBaru_TextField.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        KonfirmasiKataSandiBaru_TextField.setForeground(new java.awt.Color(255, 255, 255));
        KonfirmasiKataSandiBaru_TextField.setBorder(null);
        KonfirmasiKataSandiBaru_TextField.setEchoChar('\u25cf');
        KonfirmasiKataSandiBaru_TextField.setOpaque(false);
        KonfirmasiKataSandiBaru_TextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                KonfirmasiKataSandiBaru_TextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                KonfirmasiKataSandiBaru_TextFieldFocusLost(evt);
            }
        });
        KonfirmasiKataSandiBaru_TextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                KonfirmasiKataSandiBaru_TextFieldKeyPressed(evt);
            }
        });
        jPanel1.add(KonfirmasiKataSandiBaru_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 663, 300, 30));

        KonfirmasiKataSandiBaru_Text.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/KataSandiBaruPage/Konfirmasi Kata Sandi.png"))); // NOI18N
        jPanel1.add(KonfirmasiKataSandiBaru_Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(1309, 669, -1, -1));

        MataTutup2_Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/KataSandiBaruPage/Mata Tutup.png"))); // NOI18N
        MataTutup2_Icon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MataTutup2_IconMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MataTutup2_IconMousePressed(evt);
            }
        });
        jPanel1.add(MataTutup2_Icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(1610, 665, -1, -1));

        KonfirmasiKataSandiBaru_Field.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/KataSandiBaruPage/Konfirmasi Kata Sandi Field.png"))); // NOI18N
        jPanel1.add(KonfirmasiKataSandiBaru_Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(1231, 641, -1, -1));
        jPanel1.add(KataSandi_NotifFalse, new org.netbeans.lib.awtextra.AbsoluteConstraints(1241, 742, -1, -1));

        Konfirmasi_Tombol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/KataSandiBaruPage/Tombol Konfirmasi 1.png"))); // NOI18N
        Konfirmasi_Tombol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Konfirmasi_TombolMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Konfirmasi_TombolMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Konfirmasi_TombolMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Konfirmasi_TombolMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Konfirmasi_TombolMouseReleased(evt);
            }
        });
        jPanel1.add(Konfirmasi_Tombol, new org.netbeans.lib.awtextra.AbsoluteConstraints(1445, 799, -1, -1));

        KataSandiBaru_Picture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/KataSandiBaruPage/Kata Sandi Baru.png"))); // NOI18N
        jPanel1.add(KataSandiBaru_Picture, new org.netbeans.lib.awtextra.AbsoluteConstraints(1132, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1080));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MataTutup2_IconMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MataTutup2_IconMousePressed
        ImageIcon MataBuka_icon;
        MataBuka_icon = new ImageIcon("src/Pictures/KataSandiBaruPage/Mata Buka.png");
        MataTutup2_Icon.setIcon(MataBuka_icon);

        KonfirmasiKataSandiBaru_TextField.setEchoChar((char)0);
    }//GEN-LAST:event_MataTutup2_IconMousePressed

    private void MataTutup2_IconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MataTutup2_IconMouseClicked
        ImageIcon MataTutup2_icon;
        MataTutup2_icon = new ImageIcon("src/Pictures/KataSandiBaruPage/Mata Tutup.png");
        MataTutup2_Icon.setIcon(MataTutup2_icon);

        KonfirmasiKataSandiBaru_TextField.setEchoChar('\u25cf');
    }//GEN-LAST:event_MataTutup2_IconMouseClicked

    private void MataTutup1_IconMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MataTutup1_IconMousePressed
        ImageIcon MataBuka_icon;
        MataBuka_icon = new ImageIcon("src/Pictures/KataSandiBaruPage/Mata Buka.png");
        MataTutup1_Icon.setIcon(MataBuka_icon);

        KataSandiBaru_TextField.setEchoChar((char)0);
    }//GEN-LAST:event_MataTutup1_IconMousePressed

    private void MataTutup1_IconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MataTutup1_IconMouseClicked
        ImageIcon MataTutup1_icon;
        MataTutup1_icon = new ImageIcon("src/Pictures/KataSandiBaruPage/Mata Tutup.png");
        MataTutup1_Icon.setIcon(MataTutup1_icon);

        KataSandiBaru_TextField.setEchoChar('\u25cf');
    }//GEN-LAST:event_MataTutup1_IconMouseClicked

    private void KataSandiBaru_TextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_KataSandiBaru_TextFieldFocusGained
        KataSandiBaru_Text.setVisible(false);

        if(KataSandiBaru_TextField.getPassword().length == 0){

            ImageIcon KataSandiBaruTextField_icon;
            KataSandiBaruTextField_icon = new ImageIcon("src/Pictures/KataSandiBaruPage/Kata Sandi Field.png");
            KataSandiBaru_Field.setIcon(KataSandiBaruTextField_icon);

            //NotifFalse.setVisible(false);
        }
    }//GEN-LAST:event_KataSandiBaru_TextFieldFocusGained

    private void KataSandiBaru_TextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_KataSandiBaru_TextFieldFocusLost
        if(KataSandiBaru_TextField.getText().length() == 0){
            KataSandiBaru_Text.setVisible(true);
        }
    }//GEN-LAST:event_KataSandiBaru_TextFieldFocusLost

    private void KataSandiBaru_TextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_KataSandiBaru_TextFieldKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_DOWN){
            KonfirmasiKataSandiBaru_TextField.requestFocus();
        }else if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            KonfirmasiKataSandiBaru_TextField.requestFocus();
        }
    }//GEN-LAST:event_KataSandiBaru_TextFieldKeyPressed

    private void KonfirmasiKataSandiBaru_TextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_KonfirmasiKataSandiBaru_TextFieldFocusGained
        KonfirmasiKataSandiBaru_Text.setVisible(false);

        if(KonfirmasiKataSandiBaru_TextField.getPassword().length == 0){

            ImageIcon KonfirmasiKataSandiBaruTextField_icon;
            KonfirmasiKataSandiBaruTextField_icon = new ImageIcon("src/Pictures/KataSandiBaruPage/Konfirmasi Kata Sandi Field.png");
            KataSandiBaru_Field.setIcon(KonfirmasiKataSandiBaruTextField_icon);

            //NotifFalse.setVisible(false);
        }
    }//GEN-LAST:event_KonfirmasiKataSandiBaru_TextFieldFocusGained

    private void KonfirmasiKataSandiBaru_TextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_KonfirmasiKataSandiBaru_TextFieldFocusLost
        if(KonfirmasiKataSandiBaru_TextField.getText().length() == 0){
            KonfirmasiKataSandiBaru_Text.setVisible(true);
        }
    }//GEN-LAST:event_KonfirmasiKataSandiBaru_TextFieldFocusLost

    private void KonfirmasiKataSandiBaru_TextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_KonfirmasiKataSandiBaru_TextFieldKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_UP){
            KataSandiBaru_TextField.requestFocus();
        }
    }//GEN-LAST:event_KonfirmasiKataSandiBaru_TextFieldKeyPressed

    private void Konfirmasi_TombolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Konfirmasi_TombolMouseClicked
        ImageIcon KonfirmasiTombol_icon; /*Deklarasi variabel yang digunakan untuk memanggil ImageIcon*/
        KonfirmasiTombol_icon = new ImageIcon("src/Pictures/KataSandiBaruPage/Tombol Konfirmasi 3.png"); /*Format pemanggilan file ImageIcon yang ingin dipanggil*/
        Konfirmasi_Tombol.setIcon( KonfirmasiTombol_icon); /*Pallete pada java (berupa JLabel) yang digunakan untuk melakukan set pada ImageIcon*/
        
        String Password1 = KataSandiBaru_TextField.getPassword().toString(); /*Variabel untuk mengambil data Confirm New Password*/
        String Password2 = KonfirmasiKataSandiBaru_TextField.getPassword().toString(); /*Variabel untuk mengambil data New Password*/
        
        /*Try dan Catch digunakan untuk menangani error pada java, eksekusi yang menampilkan 
        error dan membuat program tetap berjalan tanpa dihentikan secara langsung*/
        try{ /*Statement yang digunakan untuk menghubungkan database pada mysql ke Netbeans*/
           Class.forName("com.mysql.jdbc.Driver"); /*Pemanggilan kelas pad library JDBC driver mysql*/
           Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_coba","root", ""); /*variabel yang digunakan untuk pemanggilan driver mysql pada database server*/
           String sql = "update tb_daftar set `katasandi` =? where `nama`= '"+NamaPengguna+"' or `email`= '"+Email+"'"; /*Syntax pada mysql yang digunakan untuk melakukan peng-update-an data 
           password melalui username atau email yang dimasukkan pada form sebelumnya*/
           PreparedStatement pst = connect.prepareStatement(sql); /*Variabel untuk mengambil data-data yang ingin dimasukkan ke dalam database server*/
           pst.setString(1, KataSandiBaru_TextField.getText()); /*Pemasangan dan pemasukkan data password pada database server*/
           
           if(KataSandiBaru_TextField.getText().equalsIgnoreCase(KonfirmasiKataSandiBaru_TextField.getText()) && KataSandiBaru_TextField.getPassword().length > 0 
                   && KonfirmasiKataSandiBaru_TextField.getPassword().length > 0){ /*Kondisi bahwa karakter dari password yang telah dimasukkan pada JTextField harus sesuai dengan apa 
               password yang dimasukkan kembali pada JTextField berikutnya*/
               pst.executeUpdate(); /*Untuk melakukan ekseskusi pada syntax sql*/
               KonfirmasiPage a = new KonfirmasiPage(); /*Deklarasi variabel pada form yang ingin dituju dan variabel tersebut menujukkan nilai yang sama dengan form yang ingin dituju*/
                a.setVisible(true); /*Variabel tersebut akan menampilkan form yang dituju*/
                this.dispose(); /*Untuk menutup form*/
           }else{ /*Jika kondisi diatas tidak sesuai, maka menuju ke else*/
            KataSandiBaru_TextField.setText(""); /*JTextField untuk menyimpan data new password yang dimana karakter kata yang telah dimasukkan yang dimana karakter kata yang telah dimasukkan 
            di buat menghilang*/
            KonfirmasiKataSandiBaru_TextField.setText(""); /*JTextField untuk menyimpan data confirm new password yang dimana karakter kata yang telah dimasukkan yang dimana karakter kata yang 
            telah dimasukkan di buat menghilang*/
        
            ImageIcon textfieldusername_icon; /*Deklarasi variabel yang digunakan untuk memanggil ImageIcon*/
            textfieldusername_icon = new ImageIcon("src/Pictures/Create Password/Confirm New Password Salah.png"); /*Format pemanggilan file ImageIcon yang ingin dipanggil*/
            KataSandiBaru_Field.setIcon(textfieldusername_icon); /*Pallete pada java (berupa JLabel) yang digunakan untuk melakukan set pada ImageIcon*/
            
            ImageIcon textfieldusername_icon1; /*Deklarasi variabel yang digunakan untuk memanggil ImageIcon*/
            textfieldusername_icon1 = new ImageIcon("src/Pictures/Create Password/New Password Salah.png"); /*Format pemanggilan file ImageIcon yang ingin dipanggil*/
            KonfirmasiKataSandiBaru_Field.setIcon(textfieldusername_icon1); /*Pallete pada java (berupa JLabel) yang digunakan untuk melakukan set pada ImageIcon*/
        
            ImageIcon NotifFalse_icon; /*Deklarasi variabel yang digunakan untuk memanggil ImageIcon*/
            NotifFalse_icon = new ImageIcon("src/Pictures/Create Password/Password did not match.png"); /*Format pemanggilan file ImageIcon yang ingin dipanggil*/
            KataSandi_NotifFalse.setIcon(NotifFalse_icon); /*Pallete pada java (berupa JLabel) yang digunakan untuk melakukan set pada ImageIcon*/
            KataSandi_NotifFalse.setVisible(true); /*Membuat Jlabel muncul*/
           }
        }catch(ClassNotFoundException | SQLException e) /*Menangkap kesalahan atau bug yang terjadi dalam block try*/
        {
        JOptionPane.showMessageDialog(null, e); /*Kondisi apabila terjadi kesalahan pada saat melakukan input data*/
        }
    }//GEN-LAST:event_Konfirmasi_TombolMouseClicked

    private void Konfirmasi_TombolMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Konfirmasi_TombolMouseEntered
        ImageIcon KonfirmasiTombol_icon; /*Deklarasi variabel yang digunakan untuk memanggil ImageIcon*/
        KonfirmasiTombol_icon = new ImageIcon("src/Pictures/KataSandiBaruPage/Tombol Konfirmasi 2.png"); /*Format pemanggilan file ImageIcon yang ingin dipanggil*/
        Konfirmasi_Tombol.setIcon( KonfirmasiTombol_icon); /*Pallete pada java (berupa JLabel) yang digunakan untuk melakukan set pada ImageIcon*/
    }//GEN-LAST:event_Konfirmasi_TombolMouseEntered

    private void Konfirmasi_TombolMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Konfirmasi_TombolMouseExited
        ImageIcon KonfirmasiTombol_icon; /*Deklarasi variabel yang digunakan untuk memanggil ImageIcon*/
        KonfirmasiTombol_icon = new ImageIcon("src/Pictures/KataSandiBaruPage/Tombol Konfirmasi 1.png"); /*Format pemanggilan file ImageIcon yang ingin dipanggil*/
        Konfirmasi_Tombol.setIcon( KonfirmasiTombol_icon); /*Pallete pada java (berupa JLabel) yang digunakan untuk melakukan set pada ImageIcon*/
    }//GEN-LAST:event_Konfirmasi_TombolMouseExited

    private void Konfirmasi_TombolMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Konfirmasi_TombolMousePressed
        ImageIcon KonfirmasiTombol_icon; /*Deklarasi variabel yang digunakan untuk memanggil ImageIcon*/
        KonfirmasiTombol_icon = new ImageIcon("src/Pictures/KataSandiBaruPage/Tombol Konfirmasi 4.png"); /*Format pemanggilan file ImageIcon yang ingin dipanggil*/
        Konfirmasi_Tombol.setIcon( KonfirmasiTombol_icon); /*Pallete pada java (berupa JLabel) yang digunakan untuk melakukan set pada ImageIcon*/
    }//GEN-LAST:event_Konfirmasi_TombolMousePressed

    private void Konfirmasi_TombolMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Konfirmasi_TombolMouseReleased
        ImageIcon KonfirmasiTombol_icon; /*Deklarasi variabel yang digunakan untuk memanggil ImageIcon*/
        KonfirmasiTombol_icon = new ImageIcon("src/Pictures/KataSandiBaruPage/Tombol Konfirmasi 1.png"); /*Format pemanggilan file ImageIcon yang ingin dipanggil*/
        Konfirmasi_Tombol.setIcon( KonfirmasiTombol_icon); /*Pallete pada java (berupa JLabel) yang digunakan untuk melakukan set pada ImageIcon*/
    }//GEN-LAST:event_Konfirmasi_TombolMouseReleased

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
            java.util.logging.Logger.getLogger(KataSandiBaruPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KataSandiBaruPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KataSandiBaruPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KataSandiBaruPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KataSandiBaruPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel KataSandiBaru_Field;
    private javax.swing.JLabel KataSandiBaru_Picture;
    private javax.swing.JLabel KataSandiBaru_Text;
    private javax.swing.JPasswordField KataSandiBaru_TextField;
    private javax.swing.JLabel KataSandi_NotifFalse;
    private javax.swing.JLabel KonfirmasiKataSandiBaru_Field;
    private javax.swing.JLabel KonfirmasiKataSandiBaru_Text;
    private javax.swing.JPasswordField KonfirmasiKataSandiBaru_TextField;
    private javax.swing.JLabel Konfirmasi_Tombol;
    private javax.swing.JLabel Latar_Picture;
    private javax.swing.JLabel Logo_Picture;
    private javax.swing.JLabel MataTutup1_Icon;
    private javax.swing.JLabel MataTutup2_Icon;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
