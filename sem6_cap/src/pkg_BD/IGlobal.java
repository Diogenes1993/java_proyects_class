
package pkg_BD;

import javax.swing.table.DefaultTableModel;

public interface IGlobal<T> {
    boolean Agregar(T obj);
    boolean Actualizar(T obj);
    boolean Eliminar(int codigo);
    DefaultTableModel Mostrar_Registro();
}
