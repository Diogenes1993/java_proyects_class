
package Form;
import Class.Consultas;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
public class Alumno_Historial extends javax.swing.JInternalFrame {
Consultas c=new Consultas();

private int ver_estado=0;
    public Alumno_Historial() {
        initComponents();
        cb_sexo_alumno.removeAllItems();
        cb_sexo_alumno.addItem("MASCULINO");
        cb_sexo_alumno.addItem("FEMENINO");
        c.VerAlumno_enTabla(tblAlumno);
        btn_agregar_.setText("Nuevo");
    
       
        desabilitar();
       
    }
void habilitar(){
    
     txt_nombre_alumno.setEnabled(true);
     txt_apellido_paterno_alumno.setEnabled(true);
     txt_apellido_materno_alumno.setEnabled(true);
     txt_edad_alumno.setEnabled(true);
     cb_sexo_alumno.setEnabled(true); 
     
     txt_nombre_alumno.requestFocus();
}
void desabilitar()
{
     btn_guardar_.setVisible(false);
     txt_matricula_alumno.setEnabled(false);
     txt_nombre_alumno.setEnabled(false);
     txt_apellido_paterno_alumno.setEnabled(false);
     txt_apellido_materno_alumno.setEnabled(false);
     txt_edad_alumno.setEnabled(false);
     cb_sexo_alumno.setEnabled(false);
}
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblAlumno = new javax.swing.JTable();
        btn_agregar_ = new javax.swing.JButton();
        btn_modificar_ = new javax.swing.JButton();
        btn_eliminar_ = new javax.swing.JButton();
        btn_salir_ = new javax.swing.JButton();
        txt_matricula_alumno = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_nombre_alumno = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_apellido_paterno_alumno = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_apellido_materno_alumno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_edad_alumno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cb_sexo_alumno = new javax.swing.JComboBox<>();
        btn_cancelar_ = new javax.swing.JButton();
        btn_guardar_ = new javax.swing.JButton();
        lbl_foto_alumno = new javax.swing.JLabel();
        btn_buscar = new javax.swing.JButton();
        txt_buscar_alumno = new javax.swing.JTextField();
        btn_seleccionar_imagen_alumno = new javax.swing.JButton();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblAlumno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblAlumno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAlumnoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblAlumno);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 950, 150));

        btn_agregar_.setText("Ingresar");
        btn_agregar_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregar_ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_agregar_, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 20, 100, -1));

        btn_modificar_.setText("Modificar");
        btn_modificar_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificar_ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_modificar_, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 60, 100, -1));

        btn_eliminar_.setText("Eliminar");
        btn_eliminar_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminar_ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_eliminar_, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 90, 100, -1));

        btn_salir_.setText("Salir");
        btn_salir_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salir_ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_salir_, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 150, 100, -1));
        getContentPane().add(txt_matricula_alumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 140, 20));

        jLabel1.setText("Matricula:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        txt_nombre_alumno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombre_alumnoKeyTyped(evt);
            }
        });
        getContentPane().add(txt_nombre_alumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 180, 20));

        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, -1, -1));

        txt_apellido_paterno_alumno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_apellido_paterno_alumnoKeyTyped(evt);
            }
        });
        getContentPane().add(txt_apellido_paterno_alumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 180, 20));

        jLabel3.setText("Apellido_Paterno:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, -1, -1));

        txt_apellido_materno_alumno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_apellido_materno_alumnoKeyTyped(evt);
            }
        });
        getContentPane().add(txt_apellido_materno_alumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 180, 20));

        jLabel4.setText("Apellido_Materno:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, -1, -1));

        txt_edad_alumno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_edad_alumnoKeyTyped(evt);
            }
        });
        getContentPane().add(txt_edad_alumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, 50, 20));

        jLabel5.setText("Edad:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, -1, -1));

        jLabel6.setText("Sexo:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, -1, -1));

        cb_sexo_alumno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cb_sexo_alumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 180, -1));

        btn_cancelar_.setText("Cancelar");
        btn_cancelar_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelar_ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cancelar_, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 120, 100, -1));

        btn_guardar_.setText("Guardar");
        btn_guardar_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardar_ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_guardar_, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 190, 100, -1));

        lbl_foto_alumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/descarga.png"))); // NOI18N
        getContentPane().add(lbl_foto_alumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 230, 160));

        btn_buscar.setText("Buscar");
        getContentPane().add(btn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 250, -1, -1));
        getContentPane().add(txt_buscar_alumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 460, -1));

        btn_seleccionar_imagen_alumno.setText("Seleccionar ");
        btn_seleccionar_imagen_alumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_seleccionar_imagen_alumnoActionPerformed(evt);
            }
        });
        getContentPane().add(btn_seleccionar_imagen_alumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 110, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_agregar_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregar_ActionPerformed
       if(ver_estado==1)
       {
           valores();
           c.insertarAlumno(tblAlumno);
           desabilitar();
          reset();
           limpiar();
            
           
       }           
           
        
        if(ver_estado==0)
       {
           limpiar();
           txt_matricula_alumno.setText(c.cod_nuevo_alumno());
           btn_agregar_.setText("Agregar");
           habilitar();
           ver_estado=1;
            
           
       }
    }//GEN-LAST:event_btn_agregar_ActionPerformed
private void limpiar()
{
        this.txt_matricula_alumno.setText("");
        this.txt_nombre_alumno.setText("");
        this.txt_apellido_paterno_alumno.setText("");
        this.txt_apellido_materno_alumno.setText("");
        this.txt_edad_alumno.setText("");
        this.cb_sexo_alumno.setSelectedIndex(0);
}
    
private void reset()
{
  ver_estado=0;  
  btn_agregar_.setText("Nuevo");
}
    
    private void tblAlumnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAlumnoMouseClicked
     int i;
     desabilitar();
        i = tblAlumno.getSelectedRow();
        this.txt_matricula_alumno.setText((String)tblAlumno.getValueAt(i,0));
        this.txt_nombre_alumno.setText((String)tblAlumno.getValueAt(i,1));
        this.txt_apellido_paterno_alumno.setText((String)tblAlumno.getValueAt(i,2));
        this.txt_apellido_materno_alumno.setText((String)tblAlumno.getValueAt(i,3));
        this.txt_edad_alumno.setText((String)tblAlumno.getValueAt(i,4));
        this.cb_sexo_alumno.setSelectedItem((String)tblAlumno.getValueAt(i,5));
        btn_modificar_.setVisible(true);
        btn_guardar_.setVisible(false);
         reset();
        
        
    }//GEN-LAST:event_tblAlumnoMouseClicked
private String accion="";
    private void btn_modificar_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificar_ActionPerformed
       accion="modificar";
       reset();
       habilitar();
       btn_agregar_.setEnabled(false);
       btn_eliminar_.setEnabled(false);
       btn_modificar_.setVisible(false);
       btn_guardar_.setVisible(true);
       
    }//GEN-LAST:event_btn_modificar_ActionPerformed

    private void btn_eliminar_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminar_ActionPerformed
       c.setMatricula(txt_matricula_alumno.getText());
       c.eliminaAlumno(tblAlumno);
       limpiar();
       reset();
    }//GEN-LAST:event_btn_eliminar_ActionPerformed

    private void btn_salir_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salir_ActionPerformed
       this.setVisible(false);
    }//GEN-LAST:event_btn_salir_ActionPerformed

    private void btn_cancelar_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelar_ActionPerformed
         btn_agregar_.setEnabled(true);
         btn_eliminar_.setEnabled(true);
        reset();
         desabilitar();
         limpiar();
         btn_modificar_.setVisible(true);
         btn_guardar_.setVisible(false);
    }//GEN-LAST:event_btn_cancelar_ActionPerformed

    private void btn_guardar_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardar_ActionPerformed
       
    }//GEN-LAST:event_btn_guardar_ActionPerformed

    private void txt_nombre_alumnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombre_alumnoKeyTyped
        char c = evt.getKeyChar();
    if((c<'a'||c>'z')&&(c<'A')|c>'Z')evt.consume();//Solo dejo ingresar letras minúsculas y  mayusculas (no numeros ni caracteres)
    if(Character.isLowerCase(c)){//Todo lo que ingresa se pone em mayúscula
    String cad=(""+c).toUpperCase();
    c=cad.charAt(0);
    evt.setKeyChar(c);
    }
    }//GEN-LAST:event_txt_nombre_alumnoKeyTyped

    private void txt_edad_alumnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_edad_alumnoKeyTyped
int key = evt.getKeyChar();

    boolean numeros = key >= 48 && key <= 57;
        
    if (!numeros)
    {
        evt.consume();
    }

    if (txt_edad_alumno.getText().trim().length() == 10) {
        evt.consume();
    }         
    }//GEN-LAST:event_txt_edad_alumnoKeyTyped

    private void txt_apellido_paterno_alumnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_apellido_paterno_alumnoKeyTyped
 char c = evt.getKeyChar();
    if((c<'a'||c>'z')&&(c<'A')|c>'Z')evt.consume();//Solo dejo ingresar letras minúsculas y  mayusculas (no numeros ni caracteres)
    if(Character.isLowerCase(c)){//Todo lo que ingresa se pone em mayúscula
    String cad=(""+c).toUpperCase();
    c=cad.charAt(0);
    evt.setKeyChar(c);
    }      
    }//GEN-LAST:event_txt_apellido_paterno_alumnoKeyTyped

    private void txt_apellido_materno_alumnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_apellido_materno_alumnoKeyTyped
 char c = evt.getKeyChar();
    if((c<'a'||c>'z')&&(c<'A')|c>'Z')evt.consume();//Solo dejo ingresar letras minúsculas y  mayusculas (no numeros ni caracteres)
    if(Character.isLowerCase(c)){//Todo lo que ingresa se pone em mayúscula
    String cad=(""+c).toUpperCase();
    c=cad.charAt(0);
    evt.setKeyChar(c);
    }        
    }//GEN-LAST:event_txt_apellido_materno_alumnoKeyTyped
 private String ruta="";
    private void btn_seleccionar_imagen_alumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_seleccionar_imagen_alumnoActionPerformed
  FileNameExtensionFilter filtro_para_las_imagenes=new FileNameExtensionFilter("Selecciona Perra"
                + "(*.JPG,*.JPEG,*.PNG,*.BMP)","jpg","jpeg","png","bmp");
        
        JFileChooser selector_de_archivo = new JFileChooser();
        
        selector_de_archivo.addChoosableFileFilter(filtro_para_las_imagenes);
        selector_de_archivo.setDialogTitle("Abrir archivo");
        File ruta_imagen= new File("C:\\Users\\LAB G\\Downloads\\ControlBoletas\\src\\image\\Empleados");
        selector_de_archivo.setCurrentDirectory(ruta_imagen);
        
        int seleccion_de_boton_abrir_de_la_ventana=selector_de_archivo.showOpenDialog(null);
        
        if(seleccion_de_boton_abrir_de_la_ventana==JFileChooser.APPROVE_OPTION)
        {
            File archivo_seleccionado=selector_de_archivo.getSelectedFile();
            ruta=(String.valueOf(archivo_seleccionado));
            Image objeto_para_tomar_ruta_y_mostrar_imagen=getToolkit().getImage(ruta);
            objeto_para_tomar_ruta_y_mostrar_imagen=objeto_para_tomar_ruta_y_mostrar_imagen.getScaledInstance(110, 110,Image.SCALE_DEFAULT);
            lbl_foto_alumno.setIcon(new ImageIcon(objeto_para_tomar_ruta_y_mostrar_imagen));
        }
    }//GEN-LAST:event_btn_seleccionar_imagen_alumnoActionPerformed

   private void valores()
   {
       
       c.setMatricula(this.txt_matricula_alumno.getText());
       c.setNombre(this.txt_nombre_alumno.getText());
       c.setApellido_paterno(this.txt_apellido_paterno_alumno.getText());
       c.setApellido_materno(this.txt_apellido_materno_alumno.getText());
       c.setEdad(this.txt_edad_alumno.getText());
       c.setSexo(this.cb_sexo_alumno.getSelectedItem().toString()); 
   //    c.Set<String> hashSet = new HashSet<String>();
       
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar_;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_cancelar_;
    private javax.swing.JButton btn_eliminar_;
    private javax.swing.JButton btn_guardar_;
    private javax.swing.JButton btn_modificar_;
    private javax.swing.JButton btn_salir_;
    private javax.swing.JButton btn_seleccionar_imagen_alumno;
    private javax.swing.JComboBox<String> cb_sexo_alumno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_foto_alumno;
    private javax.swing.JTable tblAlumno;
    private javax.swing.JTextField txt_apellido_materno_alumno;
    private javax.swing.JTextField txt_apellido_paterno_alumno;
    private javax.swing.JTextField txt_buscar_alumno;
    private javax.swing.JTextField txt_edad_alumno;
    private javax.swing.JTextField txt_matricula_alumno;
    private javax.swing.JTextField txt_nombre_alumno;
    // End of variables declaration//GEN-END:variables
}
