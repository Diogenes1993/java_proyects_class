
package Form;


    
    import Class.Consultas;

    import java.awt. Image;
    import java.awt.event.KeyEvent;
    import java.io.File;
    import java.io.IOException;
    import java.sql.Blob;
    import java.sql.Connection;
    import java.sql.SQLException;
import java.util.Arrays;
    import java.util.logging.Level;
    import java.util.logging.Logger;
    import javax.swing. ImageIcon;
    import javax.swing.JFileChooser;
    import javax.swing.JOptionPane;
    
import javax.swing.JTextField;
    import javax.swing.filechooser.FileNameExtensionFilter;
    
        

public final class frmAlumno extends javax.swing.JInternalFrame {

    
    Blob imagen_consulta;
    private void Ordenar_Tabla()
    {
        tbl_alumno.getColumnModel().getColumn(0).setPreferredWidth(150);
        tbl_alumno.getColumnModel().getColumn(1).setPreferredWidth(100);
        tbl_alumno.getColumnModel().getColumn(2).setPreferredWidth(100);
        tbl_alumno.getColumnModel().getColumn(3).setPreferredWidth(100);
        tbl_alumno.getColumnModel().getColumn(4).setPreferredWidth(30);
        tbl_alumno.getColumnModel().getColumn(5).setPreferredWidth(100);
        
    }
    
    
    
     Consultas consultas=new Consultas();
    public frmAlumno() {
        initComponents();
        
        consultas.VerAlumno_enTabla(this.tbl_alumno);
        cb_sexo_alumno.removeAllItems();
        cb_sexo_alumno.addItem("SELECCIONA SEXO");
        cb_sexo_alumno.addItem("MASCULINO");
        cb_sexo_alumno.addItem("FEMENINO");
        lbl_image();
        inhabilitar();
        Ordenar_Tabla();   
        reinicio();
       
    }
    
    
    public void lbl_image()
    {
          Image imagen_default=getToolkit().getImage("src/imagenes/person_110935.png");
            imagen_default=imagen_default.getScaledInstance(110,110,Image.SCALE_DEFAULT);
        lbl_mostrar_imagen_alumno.setIcon(new ImageIcon(imagen_default));
    }
    
private void inhabilitar()
    {
       
        txt_apellido_paterno_alumno.setEnabled(false);
        txt_apellido_materno_alumno.setEnabled(false);
        txt_nombre_alumno.setEnabled(false);
        txt_ruta_imagen_alumno.setEnabled(false);
        txt_edad_alumno.setEnabled(false);
        cb_sexo_alumno.setEnabled(false);
        lbl_ruta_image.setVisible(false);
        txt_ruta_imagen_alumno.setVisible(false);
        
        btn_nuevo.setEnabled(true);
        btn_guardar.setEnabled(false);
        
        btn_modificar.setEnabled(true);
        btn_eliminar.setEnabled(true);
        btn_salir.setEnabled(true);    
    
       btn_seleccionar_ruta_imagen_alumno.setEnabled(false);
        Ordenar_Tabla();
    }
    
private void habilitar()
    {
       
        txt_apellido_paterno_alumno.setEnabled(true);
        txt_apellido_materno_alumno.setEnabled(true);
        txt_nombre_alumno.setEnabled(true);
        txt_ruta_imagen_alumno.setEnabled(true);
        txt_edad_alumno.setEnabled(true);
        cb_sexo_alumno.setEnabled(true);
        btn_nuevo.setEnabled(false);
        btn_guardar.setEnabled(true);
        btn_cancelar.setEnabled(true);
        btn_modificar.setEnabled(false);
        btn_eliminar.setEnabled(false);
        btn_seleccionar_ruta_imagen_alumno.setEnabled(true);
        Ordenar_Tabla();
        this.txt_apellido_paterno_alumno.requestFocus();
    }

private void reinicio()
{
        txt_matricula_alumno.setText("");
        txt_apellido_paterno_alumno.setText("");
        txt_apellido_materno_alumno.setText("");
        txt_apellido_materno_alumno.setText("");
        txt_nombre_alumno.setText("");
        txt_edad_alumno.setText("");
        cb_sexo_alumno.setSelectedIndex(0);
        txt_ruta_imagen_alumno.setText("");
        txt_matricula_alumno.setText(consultas.cod_nuevo_alumno());
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        btn_seleccionar_ruta_imagen_alumno = new java.awt.Button();
        btn_nuevo = new java.awt.Button();
        btn_guardar = new java.awt.Button();
        btn_cancelar = new java.awt.Button();
        btn_modificar = new java.awt.Button();
        btn_eliminar = new java.awt.Button();
        btn_salir = new java.awt.Button();
        lbl_mostrar_imagen_alumno = new javax.swing.JLabel();
        txt_matricula_alumno = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_apellido_paterno_alumno = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_apellido_materno_alumno = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_nombre_alumno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_edad_alumno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cb_sexo_alumno = new javax.swing.JComboBox<>();
        btn_buscador_ = new java.awt.Button();
        jLabel7 = new javax.swing.JLabel();
        lbl_ruta_image = new java.awt.Label();
        txt_ruta_imagen_alumno = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_alumno = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_seleccionar_ruta_imagen_alumno.setBackground(new java.awt.Color(255, 255, 255));
        btn_seleccionar_ruta_imagen_alumno.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btn_seleccionar_ruta_imagen_alumno.setLabel("Seleccionar");
        btn_seleccionar_ruta_imagen_alumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_seleccionar_ruta_imagen_alumnoActionPerformed(evt);
            }
        });
        jPanel1.add(btn_seleccionar_ruta_imagen_alumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, -1, -1));

        btn_nuevo.setBackground(new java.awt.Color(255, 255, 255));
        btn_nuevo.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 14)); // NOI18N
        btn_nuevo.setLabel("Nuevo");
        btn_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoActionPerformed(evt);
            }
        });
        jPanel1.add(btn_nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 110, 30));

        btn_guardar.setBackground(new java.awt.Color(255, 255, 255));
        btn_guardar.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 14)); // NOI18N
        btn_guardar.setLabel("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 100, 30));

        btn_cancelar.setBackground(new java.awt.Color(255, 255, 255));
        btn_cancelar.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 14)); // NOI18N
        btn_cancelar.setLabel("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 100, 30));

        btn_modificar.setBackground(new java.awt.Color(255, 255, 255));
        btn_modificar.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 14)); // NOI18N
        btn_modificar.setLabel("Modifica");
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, -1, -1));

        btn_eliminar.setBackground(new java.awt.Color(255, 255, 255));
        btn_eliminar.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 14)); // NOI18N
        btn_eliminar.setLabel("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, -1, -1));

        btn_salir.setBackground(new java.awt.Color(255, 255, 255));
        btn_salir.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 14)); // NOI18N
        btn_salir.setLabel("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        jPanel1.add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, -1, -1));

        lbl_mostrar_imagen_alumno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lbl_mostrar_imagen_alumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, 100, 100));

        txt_matricula_alumno.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, java.awt.Color.black));
        jPanel1.add(txt_matricula_alumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 180, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 15)); // NOI18N
        jLabel1.setText("Matricula:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        txt_apellido_paterno_alumno.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, java.awt.Color.black));
        txt_apellido_paterno_alumno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_apellido_paterno_alumnoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_apellido_paterno_alumnoKeyTyped(evt);
            }
        });
        jPanel1.add(txt_apellido_paterno_alumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 180, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Sitka Text", 1, 15)); // NOI18N
        jLabel2.setText("Apellido_Paterno:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        txt_apellido_materno_alumno.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, java.awt.Color.black));
        txt_apellido_materno_alumno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_apellido_materno_alumnoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_apellido_materno_alumnoKeyTyped(evt);
            }
        });
        jPanel1.add(txt_apellido_materno_alumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 180, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Sitka Text", 1, 15)); // NOI18N
        jLabel3.setText("Apellido_Materno:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        txt_nombre_alumno.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, java.awt.Color.black));
        txt_nombre_alumno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_nombre_alumnoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombre_alumnoKeyTyped(evt);
            }
        });
        jPanel1.add(txt_nombre_alumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 180, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Sitka Text", 1, 15)); // NOI18N
        jLabel4.setText("Nombre:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        txt_edad_alumno.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, java.awt.Color.black));
        txt_edad_alumno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_edad_alumnoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_edad_alumnoKeyTyped(evt);
            }
        });
        jPanel1.add(txt_edad_alumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 50, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Sitka Text", 1, 15)); // NOI18N
        jLabel5.setText("Edad:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        cb_sexo_alumno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cb_sexo_alumno.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, java.awt.Color.black));
        cb_sexo_alumno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cb_sexo_alumnoKeyPressed(evt);
            }
        });
        jPanel1.add(cb_sexo_alumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 180, -1));

        btn_buscador_.setBackground(new java.awt.Color(255, 255, 255));
        btn_buscador_.setFont(new java.awt.Font("Felix Titling", 1, 12)); // NOI18N
        btn_buscador_.setLabel("Buscar");
        btn_buscador_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscador_ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_buscador_, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, 70, 30));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Sitka Text", 1, 15)); // NOI18N
        jLabel7.setText("Sexo:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        lbl_ruta_image.setForeground(new java.awt.Color(204, 255, 255));
        lbl_ruta_image.setName(""); // NOI18N
        lbl_ruta_image.setText("Ruta Imagen:");
        jPanel1.add(lbl_ruta_image, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 50, 90, -1));

        txt_ruta_imagen_alumno.setBackground(new java.awt.Color(204, 255, 255));
        txt_ruta_imagen_alumno.setForeground(new java.awt.Color(204, 255, 255));
        txt_ruta_imagen_alumno.setBorder(null);
        jPanel1.add(txt_ruta_imagen_alumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 80, 80, 10));

        tbl_alumno.setAutoCreateRowSorter(true);
        tbl_alumno.setBackground(new java.awt.Color(0, 242, 222));
        tbl_alumno.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tbl_alumno.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        tbl_alumno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbl_alumno.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tbl_alumno.setGridColor(new java.awt.Color(204, 255, 204));
        tbl_alumno.setSurrendersFocusOnKeystroke(true);
        jScrollPane2.setViewportView(tbl_alumno);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 760, 250));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 10, 17, 14);
        getContentPane().add(jPanel1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents
private String accion="";
    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
inhabilitar();
reinicio();
  
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_seleccionar_ruta_imagen_alumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_seleccionar_ruta_imagen_alumnoActionPerformed
        FileNameExtensionFilter filtro_para_las_imagenes=new FileNameExtensionFilter("Selecciona Imagen"
                + "(*.JPG,*.JPEG,*.PNG,*.BMP)","jpg","jpeg","png","bmp");
        
        JFileChooser selector_de_archivo = new JFileChooser();
        
        selector_de_archivo.addChoosableFileFilter(filtro_para_las_imagenes);
        selector_de_archivo.setDialogTitle("Abrir archivo");
        File ruta_imagen= new File("/home/frank/Descargas/archivos_rar/sem4_Estudiante_proyect/src/Tomos_bleach");
        selector_de_archivo.setCurrentDirectory(ruta_imagen);
        
        int seleccion_de_boton_abrir_de_la_ventana=selector_de_archivo.showOpenDialog(null);
        
        if(seleccion_de_boton_abrir_de_la_ventana==JFileChooser.APPROVE_OPTION)
        {
            File archivo_seleccionado=selector_de_archivo.getSelectedFile();
            txt_ruta_imagen_alumno.setText(String.valueOf(archivo_seleccionado));
            Image objeto_para_tomar_ruta_y_mostrar_imagen=getToolkit().getImage(txt_ruta_imagen_alumno.getText());
            objeto_para_tomar_ruta_y_mostrar_imagen=objeto_para_tomar_ruta_y_mostrar_imagen.getScaledInstance(110, 110,Image.SCALE_DEFAULT);
            this.lbl_mostrar_imagen_alumno.setIcon(new ImageIcon(objeto_para_tomar_ruta_y_mostrar_imagen));
        }
        
    }//GEN-LAST:event_btn_seleccionar_ruta_imagen_alumnoActionPerformed

    private void btn_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoActionPerformed
        lbl_image();
        consultas.VerAlumno_enTabla(tbl_alumno);
        accion="insertar";
        habilitar();
        reinicio();
    }//GEN-LAST:event_btn_nuevoActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        if("insertar".equals(accion))
        {
            if(txt_ruta_imagen_alumno.getText().equals(""))
            {
                int respuesta = JOptionPane.showConfirmDialog(null, "ESTA INGRESANDO UN ALUMNO SIN FOTOGRAFIA \n¿ESTA SEGURO?", "Confirmación", JOptionPane.YES_NO_OPTION);
                if(respuesta==JOptionPane.YES_OPTION)
                {
                    String ruta="C:\\Users\\alexz\\Downloads\\git_proyects\\java_proyects_class\\pRUEBAS\\Pruebas_Sofware_sem01\\src\\imagenes\\sin_foto.jpg";
                    txt_ruta_imagen_alumno.setText(ruta);
                    llenar_set_consultas();
            int resultado=consultas.insertarAlumno(tbl_alumno);
            if(resultado==1)
            {
                JOptionPane.showMessageDialog(null,"SE INSERTO EXITOSAMENTE");
            }
            reinicio();
            consultas.VerAlumno_enTabla(tbl_alumno);
              inhabilitar();    
                }
                if(respuesta==JOptionPane.NO_OPTION)
                {
                    btn_seleccionar_ruta_imagen_alumno.requestFocus();
                }
            }
            else{
            llenar_set_consultas();
            int resultado=consultas.insertarAlumno(tbl_alumno);
            if(resultado==1)
            {
                JOptionPane.showMessageDialog(null,"SE INSERTO EXITOSAMENTE");
            }
            reinicio();
            consultas.VerAlumno_enTabla(tbl_alumno);
              inhabilitar();
        }
        }
        
        //-----------------------------------------------------------------------------------------------
        if(("modifica").equals(accion))
                {
                    if(this.txt_ruta_imagen_alumno.getText().equals(""))
                    {
                        
                        consultas.setFoto("");
                    }
                 int respuesta = JOptionPane.showConfirmDialog(null, "¿Modificara  "+txt_matricula_alumno.getText()+"? ¿Desea Continuar?", "Confirmación", JOptionPane.YES_NO_OPTION);
                if(respuesta==JOptionPane.YES_OPTION){
                        llenar_set_consultas();
                       int resultado=consultas.modificaAlumno();
                       if(resultado==1)
                       {
                           JOptionPane.showMessageDialog(null,"SE ACTUALIZO EXITOSAMENTE");
                       }
                        inhabilitar();
                        reinicio();
                        consultas.VerAlumno_enTabla(tbl_alumno);
                                }
                else
                {
                    inhabilitar();
                }
                }//fin modificar
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void llenar_set_consultas()
    {
        consultas.setMatricula(txt_matricula_alumno.getText());
        consultas.setNombre(txt_nombre_alumno.getText());
        consultas.setApellido_paterno(txt_apellido_paterno_alumno.getText());
        consultas.setApellido_materno(txt_apellido_materno_alumno.getText());
        consultas.setEdad(txt_edad_alumno.getText());
        consultas.setSexo(cb_sexo_alumno.getSelectedItem().toString());
          consultas.setFoto(txt_ruta_imagen_alumno.getText());
    }
    
    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        
        accion="modifica";
         String i=txt_matricula_alumno.getText();
         
        if((i).equals(consultas.cod_nuevo_alumno())){
            System.out.println("VALOR NO ENCONTRADO");
        }
        else{
        habilitar();
        }
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void txt_apellido_paterno_alumnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_apellido_paterno_alumnoKeyTyped
    validade_de_txt(evt,txt_apellido_paterno_alumno);
    }//GEN-LAST:event_txt_apellido_paterno_alumnoKeyTyped

    private void txt_apellido_materno_alumnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_apellido_materno_alumnoKeyTyped
  validade_de_txt(evt,txt_apellido_materno_alumno);
    }//GEN-LAST:event_txt_apellido_materno_alumnoKeyTyped

    private void txt_nombre_alumnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombre_alumnoKeyTyped
      validade_de_txt(evt,txt_nombre_alumno);
    }//GEN-LAST:event_txt_nombre_alumnoKeyTyped

    private void txt_edad_alumnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_edad_alumnoKeyTyped
      char key = evt.getKeyChar();
    if (!Character.isDigit(key)) {
        evt.consume();
        return;
    }
    String currentText = txt_edad_alumno.getText().trim();
    String newText = currentText + key;

    try {
        int value = Integer.parseInt(newText);
        
        if (newText.length() > 3 || value >= 103) {
            evt.consume(); 
        }
    } catch (NumberFormatException ex) {
        evt.consume(); 
    }
    }//GEN-LAST:event_txt_edad_alumnoKeyTyped

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
   
                 int respuesta = JOptionPane.showConfirmDialog(null, "¿Eliminara a "+txt_matricula_alumno.getText()+"? ¿Desea Continuar?", "Confirmación", JOptionPane.YES_NO_OPTION);
                if(respuesta==JOptionPane.YES_OPTION){
              
                String valor_seleccionado_matricula=txt_matricula_alumno.getText();
                consultas.setMatricula(valor_seleccionado_matricula);
                consultas.eliminaAlumno(tbl_alumno);
                System.out.println("SE ELIMINO CORRECTAMENTE");
                inhabilitar();
                }else if (respuesta == JOptionPane.NO_OPTION)
                    inhabilitar();
            
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_buscador_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscador_ActionPerformed
         buscado_();
    }//GEN-LAST:event_btn_buscador_ActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
this.setVisible(false);
    }//GEN-LAST:event_btn_salirActionPerformed

    private void txt_apellido_paterno_alumnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_apellido_paterno_alumnoKeyPressed
 enter_pressed(evt,txt_apellido_materno_alumno);            
    }//GEN-LAST:event_txt_apellido_paterno_alumnoKeyPressed

    private void txt_apellido_materno_alumnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_apellido_materno_alumnoKeyPressed
     enter_pressed(evt,txt_nombre_alumno);            
    }//GEN-LAST:event_txt_apellido_materno_alumnoKeyPressed

    private void txt_nombre_alumnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombre_alumnoKeyPressed
   enter_pressed(evt,txt_edad_alumno);                
    }//GEN-LAST:event_txt_nombre_alumnoKeyPressed

    private void txt_edad_alumnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_edad_alumnoKeyPressed
   if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        cb_sexo_alumno.requestFocus(); 
    }         
    }//GEN-LAST:event_txt_edad_alumnoKeyPressed

    private void cb_sexo_alumnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cb_sexo_alumnoKeyPressed
     enter_pressed(evt,txt_apellido_paterno_alumno);              
    }//GEN-LAST:event_cb_sexo_alumnoKeyPressed
  
    private void enter_pressed(java.awt.event.KeyEvent evt,JTextField siguiente_press)
  {
      if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        siguiente_press.requestFocus(); 
    }   
  }
    
    private void validade_de_txt(java.awt.event.KeyEvent evt,JTextField Jtextfield)
{
      char c = evt.getKeyChar();
if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || c == ' ')) {
    evt.consume(); // Solo permite letras minúsculas, mayúsculas y espacios
}

if (Character.isLowerCase(c)) {
    String cad = ("" + c).toUpperCase();
    c = cad.charAt(0);
    evt.setKeyChar(c);
}

String cantidad_de_caracteres = Jtextfield.getText();
if (cantidad_de_caracteres.length() >= 50 && c != '\b') {
    evt.consume(); // Limita a 50 caracteres, permitiendo la eliminación (tecla retroceso '\b')
}
}
    
    
    private void buscado_()
    {
        if(txt_matricula_alumno.getText().equals(consultas.cod_nuevo_alumno()))
         {
             JOptionPane.showMessageDialog(null,"ALUMNO NO ENCONTRADO");
         }
         else{
        consultas.setMatricula(txt_matricula_alumno.getText());
         
         Object datos[]=consultas.BuscarAlumno_enTabla(tbl_alumno);
       
         txt_nombre_alumno.setText(datos[0].toString());
         txt_apellido_paterno_alumno.setText(datos[1].toString());
         txt_apellido_materno_alumno.setText(datos[2].toString());
         txt_edad_alumno.setText(datos[3].toString());
         cb_sexo_alumno.setSelectedItem(datos[4].toString());
          try
          {
                  Image contenedor_image_en_label=null;
                   imagen_consulta=(Blob) datos[5];
                  contenedor_image_en_label=javax.imageio.ImageIO.read(imagen_consulta.getBinaryStream());
                  contenedor_image_en_label=contenedor_image_en_label.getScaledInstance(110,110,Image.SCALE_DEFAULT);
                  lbl_mostrar_imagen_alumno.setIcon(new ImageIcon(contenedor_image_en_label));
                Ordenar_Tabla();
          } catch (IOException | SQLException ex) {
             Logger.getLogger(frmAlumno.class.getName()).log(Level.SEVERE, null, ex);
         }
         }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btn_buscador_;
    private java.awt.Button btn_cancelar;
    private java.awt.Button btn_eliminar;
    private java.awt.Button btn_guardar;
    private java.awt.Button btn_modificar;
    private java.awt.Button btn_nuevo;
    private java.awt.Button btn_salir;
    private java.awt.Button btn_seleccionar_ruta_imagen_alumno;
    private javax.swing.JComboBox<String> cb_sexo_alumno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_mostrar_imagen_alumno;
    private java.awt.Label lbl_ruta_image;
    private javax.swing.JTable tbl_alumno;
    private javax.swing.JTextField txt_apellido_materno_alumno;
    private javax.swing.JTextField txt_apellido_paterno_alumno;
    private javax.swing.JTextField txt_edad_alumno;
    private javax.swing.JTextField txt_matricula_alumno;
    private javax.swing.JTextField txt_nombre_alumno;
    private javax.swing.JTextField txt_ruta_imagen_alumno;
    // End of variables declaration//GEN-END:variables
}
