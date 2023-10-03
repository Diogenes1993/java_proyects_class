
package pkg_clases;

import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;


public class Image_Table extends DefaultTableCellRenderer{
    
    
      @Override
   public Component  getTableCellRendererComponent(JTable tabla,Object value,boolean isSelected,boolean hasFocus,int row,int column)
   {
       if(value instanceof JLabel)
       {
           JLabel label=(JLabel) value;
           return label;
       }
       return super.getTableCellRendererComponent(tabla,value,isSelected,hasFocus,row,column);
   } 
}
