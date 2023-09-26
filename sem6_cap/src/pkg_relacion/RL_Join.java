
package pkg_relacion;

import javax.swing.table.DefaultTableModel;
import pkg_BD.BD_Relation_Ca_Pro;

public class RL_Join {
    BD_Relation_Ca_Pro join=new BD_Relation_Ca_Pro();
     public DefaultTableModel listar()
     {
         return join.Mostrar_Registro_Join();
     }
     
      public DefaultTableModel listar_filtro(String nombre_categoria)
     {
         return join.Mostrar_Registro_Filtro_Join(nombre_categoria);
     }
}
