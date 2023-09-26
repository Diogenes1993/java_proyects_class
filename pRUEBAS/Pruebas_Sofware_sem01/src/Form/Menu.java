package Form;
import Class.image_DesktopPane;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.*;

public class Menu extends javax.swing.JFrame implements Runnable{
String hora,minutos,segundos,am_o_pm;
 frmAlumno frm_alumno=new frmAlumno();
Thread hilo;
   
    public Menu() {
        initComponents();
        Escritorio.setBorder(new image_DesktopPane());
        this.setExtendedState(Menu.MAXIMIZED_BOTH);
        
        hilo=new Thread(this);
        hilo.start();
        
        this.setTitle("MENU ALUMNO");
        
        this.setIconImage(getIconImage());
    }

 @Override
 public Image getIconImage()
 {
    
        Image valor;
   
        valor = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/7.png"));
  
        return valor;
 }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        menuBar2 = new java.awt.MenuBar();
        menu3 = new java.awt.Menu();
        menu4 = new java.awt.Menu();
        Escritorio = new javax.swing.JDesktopPane();
        Jpanel_mne = new javax.swing.JPanel();
        tb_opciones = new javax.swing.JToolBar();
        lbl_alumno_click_ = new javax.swing.JLabel();
        lbl_salir_click_ = new javax.swing.JLabel();
        Jpanel_our = new javax.swing.JPanel();
        lbl_info_app = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lbl_hora = new javax.swing.JLabel();
        menu_bar_ = new javax.swing.JMenuBar();
        menu_guia = new javax.swing.JMenu();
        sub_menu_frmAlumno = new javax.swing.JMenuItem();
        mnu_Help = new javax.swing.JMenu();
        sub_menu_salir = new javax.swing.JMenuItem();

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        menu3.setLabel("File");
        menuBar2.add(menu3);

        menu4.setLabel("Edit");
        menuBar2.add(menu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);

        Escritorio.setBackground(new java.awt.Color(51, 153, 255));
        Escritorio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Escritorio.setForeground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 906, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 253, Short.MAX_VALUE)
        );

        getContentPane().add(Escritorio, java.awt.BorderLayout.CENTER);

        Jpanel_mne.setLayout(new javax.swing.BoxLayout(Jpanel_mne, javax.swing.BoxLayout.LINE_AXIS));

        tb_opciones.setRollover(true);
        tb_opciones.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lbl_alumno_click_.setFont(new java.awt.Font("Tw Cen MT", 1, 13)); // NOI18N
        lbl_alumno_click_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1490886306-20-graduation_82484.png"))); // NOI18N
        lbl_alumno_click_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_alumno_click_MouseClicked(evt);
            }
        });
        tb_opciones.add(lbl_alumno_click_);

        Jpanel_mne.add(tb_opciones);

        lbl_salir_click_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/SALIR.png"))); // NOI18N
        lbl_salir_click_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_salir_click_MouseClicked(evt);
            }
        });
        Jpanel_mne.add(lbl_salir_click_);

        getContentPane().add(Jpanel_mne, java.awt.BorderLayout.PAGE_START);

        Jpanel_our.setBackground(new java.awt.Color(213, 255, 255));
        Jpanel_our.setLayout(new javax.swing.BoxLayout(Jpanel_our, javax.swing.BoxLayout.LINE_AXIS));

        lbl_info_app.setBackground(new java.awt.Color(0, 0, 0));
        lbl_info_app.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        lbl_info_app.setText("asdadadad");
        Jpanel_our.add(lbl_info_app);

        jPanel3.setBackground(new java.awt.Color(213, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 403, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        Jpanel_our.add(jPanel3);

        lbl_hora.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        lbl_hora.setText("asdaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        Jpanel_our.add(lbl_hora);

        getContentPane().add(Jpanel_our, java.awt.BorderLayout.PAGE_END);

        menu_guia.setText("Navegador");

        sub_menu_frmAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/social_college_education_graduation_cap_hat_university_icon_133176.png"))); // NOI18N
        sub_menu_frmAlumno.setText("Alumno");
        sub_menu_frmAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub_menu_frmAlumnoActionPerformed(evt);
            }
        });
        menu_guia.add(sub_menu_frmAlumno);

        menu_bar_.add(menu_guia);

        mnu_Help.setText("Help");

        sub_menu_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/off_downnearexit_apagado_abajo_6017.png"))); // NOI18N
        sub_menu_salir.setText("salir");
        sub_menu_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub_menu_salirActionPerformed(evt);
            }
        });
        mnu_Help.add(sub_menu_salir);

        menu_bar_.add(mnu_Help);

        setJMenuBar(menu_bar_);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sub_menu_frmAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub_menu_frmAlumnoActionPerformed
             if(frm_alumno.isVisible())
        {
            
            frm_alumno.setVisible(false);
            Escritorio.remove(frm_alumno);
        }else{
        Escritorio.add(frm_alumno);
            
           frm_alumno.setVisible(true);
            frm_alumno.setSize(750,700);
           frm_alumno.setLocation(200, 40);
            frm_alumno.setResizable(false);
        }
    }//GEN-LAST:event_sub_menu_frmAlumnoActionPerformed

    private void lbl_salir_click_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_salir_click_MouseClicked
        System.exit(0);
    }//GEN-LAST:event_lbl_salir_click_MouseClicked

    private void lbl_alumno_click_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_alumno_click_MouseClicked
        if(frm_alumno.isVisible())
        {
            frm_alumno.setVisible(false);
            Escritorio.remove(frm_alumno);

        }else{
            Escritorio.add(frm_alumno);

            frm_alumno.setVisible(true);
            frm_alumno.setSize(750,700);
            frm_alumno.setLocation(200, 40);
            frm_alumno.setResizable(false);
        }
    }//GEN-LAST:event_lbl_alumno_click_MouseClicked

    private void sub_menu_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub_menu_salirActionPerformed
    System.exit(0);
    }//GEN-LAST:event_sub_menu_salirActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JPanel Jpanel_mne;
    private javax.swing.JPanel Jpanel_our;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbl_alumno_click_;
    private javax.swing.JLabel lbl_hora;
    private javax.swing.JLabel lbl_info_app;
    private javax.swing.JLabel lbl_salir_click_;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.Menu menu3;
    private java.awt.Menu menu4;
    private java.awt.MenuBar menuBar1;
    private java.awt.MenuBar menuBar2;
    private javax.swing.JMenuBar menu_bar_;
    private javax.swing.JMenu menu_guia;
    private javax.swing.JMenu mnu_Help;
    private javax.swing.JMenuItem sub_menu_frmAlumno;
    private javax.swing.JMenuItem sub_menu_salir;
    private javax.swing.JToolBar tb_opciones;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
      Thread definicion_de_hilo=Thread.currentThread();
     
      while(definicion_de_hilo==hilo)
      {
          calcula_hora();
          String hora_=hora+":"+minutos+":"+segundos+" "+am_o_pm;
          lbl_info_app.setText("SISTEMA DE REGISTRO DE ALUMNO");
          lbl_hora.setText(hora_);
          try
          {
              Thread.sleep(1000);
            
          }catch(InterruptedException e){}
      }
    }

    private void calcula_hora() {
      Calendar calendario=new GregorianCalendar(); 
      Date fecha_hora_actual=new Date();
      
      calendario.setTime(fecha_hora_actual);
      am_o_pm=calendario.get(Calendar.AM_PM)==Calendar.AM?"AM":"PM";
      
      if(am_o_pm.equals("PM"))
      {
          int hora_actual=calendario.get(Calendar.HOUR_OF_DAY);
          hora=hora_actual>9?""+hora_actual:"0"+hora_actual;
      }else
      {
          hora=calendario.get(Calendar.HOUR_OF_DAY)>9?""+calendario.get(Calendar.HOUR_OF_DAY):"0"+calendario.get(Calendar.HOUR_OF_DAY);
      }
      minutos=calendario.get(Calendar.MINUTE)>9?""+calendario.get(Calendar.MINUTE):"0"+calendario.get(Calendar.MINUTE);
      segundos=calendario.get(Calendar.SECOND)>9?""+calendario.get(Calendar.SECOND):"0"+calendario.get(Calendar.SECOND);
    }
}
