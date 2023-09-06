package Form;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.*;

public class Menu extends javax.swing.JFrame implements Runnable{
String hora,minutos,segundos,am_o_pm;
 frmAlumno frm_alumno=new frmAlumno();
Thread hilo;
   
    public Menu() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        
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
        lbl_info_app = new javax.swing.JLabel();
        tb_opciones = new javax.swing.JToolBar();
        lbl_alumno_click_ = new javax.swing.JLabel();
        lbl_salir_click_ = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Escritorio.setBackground(new java.awt.Color(51, 153, 255));
        Escritorio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Escritorio.setForeground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1376, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 598, Short.MAX_VALUE)
        );

        getContentPane().add(Escritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, 600));

        lbl_info_app.setBackground(new java.awt.Color(0, 0, 0));
        lbl_info_app.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbl_info_app.setText("asdadadad");
        getContentPane().add(lbl_info_app, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 660, 1378, 30));

        tb_opciones.setRollover(true);
        tb_opciones.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lbl_alumno_click_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1490886306-20-graduation_82484.png"))); // NOI18N
        lbl_alumno_click_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_alumno_click_MouseClicked(evt);
            }
        });
        tb_opciones.add(lbl_alumno_click_);

        lbl_salir_click_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/SALIR.png"))); // NOI18N
        lbl_salir_click_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_salir_click_MouseClicked(evt);
            }
        });
        tb_opciones.add(lbl_salir_click_);

        getContentPane().add(tb_opciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1378, 60));

        menu_guia.setText("Navegador");

        sub_menu_frmAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/social_college_education_graduation_cap_hat_university_icon_133176.png"))); // NOI18N
        sub_menu_frmAlumno.setText("Alumno");
        sub_menu_frmAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub_menu_frmAlumnoActionPerformed(evt);
            }
        });
        menu_guia.add(sub_menu_frmAlumno);

        jMenuBar1.add(menu_guia);

        mnu_Help.setText("Help");

        sub_menu_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/off_downnearexit_apagado_abajo_6017.png"))); // NOI18N
        sub_menu_salir.setText("salir");
        mnu_Help.add(sub_menu_salir);

        jMenuBar1.add(mnu_Help);

        setJMenuBar(jMenuBar1);

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

    private void lbl_salir_click_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_salir_click_MouseClicked
     System.exit(0);
    }//GEN-LAST:event_lbl_salir_click_MouseClicked

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lbl_alumno_click_;
    private javax.swing.JLabel lbl_info_app;
    private javax.swing.JLabel lbl_salir_click_;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.Menu menu3;
    private java.awt.Menu menu4;
    private java.awt.MenuBar menuBar1;
    private java.awt.MenuBar menuBar2;
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
          lbl_info_app.setText("SISTEMA DE REGISTRO DE ALUMNO                  "
          + "                                                "
          + "                     "
          + "       "+hora_);
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
