
package pkg_Controlador;

import java.util.List;
import java.util.Map;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import pkg_Modelo.Modelo_Orders;
import pkg_Vista.Vista_Orders;


public class Controlador_Orders {
 
     public Controlador_Orders(Modelo_Orders modelo, Vista_Orders vista) {
         modelo.Mostrar();
         
         this.modelo = modelo;
        this.vista = vista;
    }
    
    private Modelo_Orders modelo;
     Vista_Orders vista = new Vista_Orders();

    public Controlador_Orders() {
    }

    public void mostrarAlumnosEnConsola(JTable table) {
        List<Map<String, Object>> alumnos = modelo.Mostrar();
        table.setModel(vista.mostrarAlumnosConNombresColumna(alumnos));
    }
    
    public DefaultTableModel mostrarAlumnos() {
        return vista.mostrar();
    }
    
}
