
package Class;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Consultas {
    private String matricula;
    private String nombre;
    private String apellido_paterno;
    private String apellido_materno;
    private String edad;
    private String sexo;
    private String foto;
    
    private Connection xcon;
    private Statement st;
    private DefaultTableModel modelo; 

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

   
   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido_paterno() {
        return apellido_paterno;
    }

    public void setApellido_paterno(String apellido_paterno) {
        this.apellido_paterno = apellido_paterno;
    }

    public String getApellido_materno() {
        return apellido_materno;
    }

    public void setApellido_materno(String apellido_materno) {
        this.apellido_materno = apellido_materno;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
      public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
    
    
   public String cod_nuevo_alumno()
    {
        String cod_nuevo="";
       
        try{
             xcon = Conexion.Conectar();
           
            String consulta_insertar = "{ ? = CALL FN_generar_codigo() }";
            
             

                CallableStatement resiviendo_la_consulta = xcon.prepareCall(consulta_insertar);
                resiviendo_la_consulta.registerOutParameter(1,java.sql.Types.VARCHAR);
              
                resiviendo_la_consulta.execute();
                
                cod_nuevo=resiviendo_la_consulta.getString(1);
        }
        
        catch(SQLException ex)
        {
            System.out.println(" ERROR cod "+ex.getMessage());
        }
        
        return cod_nuevo;
    }
    
       public void VerAlumno_enTabla(JTable table)
    {
         try{
            xcon = Conexion.Conectar();
            String[] Titulos={"MATRICULA","NOMBRE","APELLIDO PATERNO","APELLIDO MATERNO","EDAD","SEXO"};
             System.out.println("NORMAL");
            String sql = "SELECT MATRICULA,NOMBRE,APELLIDO_PATERNO,APELLIDO_MATERNO,EDAD,SEXO FROM ALUMNO ";
                   
            
            modelo=new DefaultTableModel(null,Titulos);
            st = xcon.createStatement();
            ResultSet rs = st.executeQuery(sql);
            String[] fila=new String[7];
            while (rs.next()){
                fila[0]=rs.getString("MATRICULA");
                fila[1]=rs.getString("NOMBRE");
                fila[2]=rs.getString("APELLIDO_PATERNO");
                fila[3]=rs.getString("APELLIDO_MATERNO");
                fila[4]=rs.getString("EDAD");
                fila[5]=rs.getString("SEXO");
                modelo.addRow(fila);
            }
            table.setModel(modelo);
            

        }catch(SQLException ex){
             System.out.println("ERROR "+ex.getMessage());
            
        } 
    }
       
    public int insertarAlumno(JTable tabla){
      
        
             int resultado_consulta=0;
      try{
              xcon = Conexion.Conectar();
              String consulta_modificar="CALL PS_insertar_alumno(?,?,?,?,?,?,?)";
                            
              FileInputStream contenedor_image=null;
                           
              PreparedStatement preparacion_de_consulta=xcon.prepareStatement (consulta_modificar);
                            
              preparacion_de_consulta.setString(1,matricula);
              preparacion_de_consulta.setString(2,nombre);
              preparacion_de_consulta.setString(3,apellido_paterno);
              preparacion_de_consulta.setString(4,apellido_materno);
              preparacion_de_consulta.setString(5,edad);
              preparacion_de_consulta.setString(6,sexo);
                
              File objeto_archivo_image=new File(foto);
  
          try {
                  contenedor_image=new FileInputStream(objeto_archivo_image);
                  preparacion_de_consulta.setBinaryStream(7,contenedor_image,(int)objeto_archivo_image.length());
                           
                           resultado_consulta=preparacion_de_consulta.executeUpdate();
                           if(resultado_consulta>0){
                                System.out.println("SE INSERTO CON EXITO");
                           }
              
              } catch (FileNotFoundException ex) {
                   System.out.println("ERROR "+ex);     
                      }
                            
                        }catch(SQLException ex)
                        {
                            System.out.println("ERROR");
                        }
      return resultado_consulta;
                            
    }
   
    public int modificaAlumno(){
        int resultado_consulta=0;
      try{
              xcon = Conexion.Conectar();
              String consulta_modificar="CALL PS_actualizar_alumno(?,?,?,?,?,?,?)";
                            
              FileInputStream contenedor_image=null;
                           
              PreparedStatement preparacion_de_consulta=xcon.prepareStatement (consulta_modificar);
                            
              preparacion_de_consulta.setString(1,matricula);
              preparacion_de_consulta.setString(2,nombre);
              preparacion_de_consulta.setString(3,apellido_paterno);
              preparacion_de_consulta.setString(4,apellido_materno);
              preparacion_de_consulta.setString(5,edad);
              preparacion_de_consulta.setString(6,sexo);
               if(foto.equals(""))
               {
                  preparacion_de_consulta.setString (7,null);
               }else{
              File objeto_archivo_image=new File(foto);
  
          try {
                  contenedor_image=new FileInputStream(objeto_archivo_image);
                  preparacion_de_consulta.setBinaryStream(7,contenedor_image,(int)objeto_archivo_image.length());
                           
                       
              
              } catch (FileNotFoundException ex) {
                   System.out.println("ERROR "+ex);     
                      }
               }
                              resultado_consulta=preparacion_de_consulta.executeUpdate();
                           if(resultado_consulta>0){
                                System.out.println("SE ACTUALIZO CON EXITO");
                           }  
                        }catch(SQLException ex)
                        {
                            System.out.println("ERROR "+ex);
                        }
      return resultado_consulta;
                            
    }         
                        
                    
    
    
    public int eliminaAlumno(JTable tabla){
        int respuesta=0;
        try{
           
            xcon = Conexion.Conectar();
            String consulta_actualizar = "CALL PS_eliminar_alumno(?)";
             PreparedStatement preparando_la_consulta = xcon.prepareStatement(consulta_actualizar);
            preparando_la_consulta.setString(1,matricula);
            
            respuesta = preparando_la_consulta.executeUpdate();

            if(respuesta == 1){
                System.out.println("ELIMINADO CON EXITO");
                VerAlumno_enTabla(tabla);
                
            }
        }catch(SQLException ex){
            System.out.println("ERROR "+ex.getMessage());
        }
        return respuesta;
    }
    
       public Object[] BuscarAlumno_enTabla(JTable table)
    {
        Object[] datos_busqueda=new Object[6];
         try{
             
            xcon = Conexion.Conectar();
            
            String[] Titulos={"MATRICULA","NOMBRE","APELLIDO PATERNO","APELLIDO MATERNO","EDAD","SEXO"};
            
            String consulta_buscar = "CALL PS_buscar_alumno(?) ";
             
            PreparedStatement preparando_la_consulta = xcon.prepareStatement(consulta_buscar);
            preparando_la_consulta.setString(1,matricula);
            modelo=new DefaultTableModel(null,Titulos);
             ResultSet rs =  preparando_la_consulta .executeQuery();
             
            String[] fila=new String[7];
            while (rs.next()){
                fila[0]=rs.getString("MATRICULA");
                fila[1]=rs.getString("NOMBRE");
                fila[2]=rs.getString("APELLIDO_PATERNO");
                fila[3]=rs.getString("APELLIDO_MATERNO");
                fila[4]=rs.getString("EDAD");
                fila[5]=rs.getString("SEXO");
                
                datos_busqueda[5]=rs.getBlob("FOTO");
;                modelo.addRow(fila);
            }
            
            for(int i=0;i<5;i++)
            {
                datos_busqueda[i]=fila[i+1];
            }
            
            
            
            table.setModel(modelo);
            

        }catch(SQLException ex){
             System.out.println("ERROR "+ex.getMessage());
            
        } 
         return datos_busqueda;
    }
    
      public int ingreso_login(String username,String password){
         try (Connection connection = Conexion.Conectar()) {
            String callProcedure = "{call SP_Ingreso_Login(?, ?, ?)}";
            CallableStatement callableStatement = connection.prepareCall(callProcedure);
            callableStatement.setString(1, username);
            callableStatement.setString(2, password);
            callableStatement.registerOutParameter(3, java.sql.Types.INTEGER); 
            callableStatement.execute();

            int valid = callableStatement.getInt(3); 

            if (valid == 1) {
                return 1;
               
            } else {
                return 0;
             
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        }
    }
       
}
