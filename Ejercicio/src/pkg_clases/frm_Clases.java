package pkg_clases;

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;


public class frm_Clases {
    
    private ArrayList<String> candidato;
    private ArrayList<Integer> Puntos;
    
    public frm_Clases(ArrayList<String> candidato,ArrayList<Integer> Puntos)
    {
        this.candidato=candidato;
        this.Puntos=Puntos;
    }
    
      public frm_Clases()
    {
       
    }
    
    
    public Object[] llenarCandidato()
    {
       Object[] valores=new Object[2];
       int mayor=0;
        for (int i=0;i<candidato.size();i++)
        {
            if(mayor < Puntos.get(i))
            {
                mayor=Puntos.get(i);
                valores[0]=mayor;
                valores[1]=candidato.get(i);
            }
        }
        
        return valores;
    }
    
     public  byte[] getImagen(String ruta_)
  {
      File image=new File(ruta_);
      try
      {
          byte[] icono=new byte[(int) image.length()];
          InputStream input=new FileInputStream(image);
          input.read(icono);
          return icono;
      }
      catch(IOException ex)
      {
          return null;
      }
  }
     
     public   ChartPanel Grafico_Pie(DefaultPieDataset datos)
     {
         datos=new DefaultPieDataset();
             
       for (int i=0;i<candidato.size();i++){
           datos.setValue(candidato.get(i),Puntos.get(i));
       }

        JFreeChart grafico_circular=ChartFactory.createPieChart(
            "Eleccion 2023",     //Nombre Grafico
            datos,                             //Datos del Archivo
            true,                             //Leyenda Grafico
            true,                             //Herramientas
            false                             //url Grafico
        );

        ChartPanel panel=new ChartPanel(grafico_circular);
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize(new Dimension(400,200));
            
        return panel;
     }
     
     
     public DefaultTableModel llenar_table()
     {
         String[] column_name={"CANDIDATO","COSTA","SIERRA","SELVA","FOTO"};
         DefaultTableModel modelo=new DefaultTableModel(null,column_name);
         
          
         for(int i=0;i<datos.images.length;i++)
         {
             Object[] data=
             {
                 datos.postulante[i],
                  datos.votos_costa[i],
                  datos.votos_sierra[i],
                  datos.votos_selva[i],
                Manejo_Data(  datos.images[i])
             };
             
             modelo.addRow(data);
         }
         
         
         return modelo;
         
     }
     
     public ChartPanel Grafic_Barrras(DefaultCategoryDataset data)
     {
          
          
          data=new DefaultCategoryDataset();
          for (int i=0;i<datos.postulante.length;i++){
           data.setValue(Integer.parseInt(datos.votos_costa[i]), "Costa", datos.postulante[i]);
           data.setValue(Integer.parseInt(datos.votos_sierra[i]), "Sierra", datos.postulante[i]);
           data.setValue(Integer.parseInt(datos.votos_selva[i]), "Selva", datos.postulante[i]);
     }
          
          JFreeChart grafico_barras=ChartFactory.createBarChart3D(
                  "Elecciones ",     //Nombre Grafico
                  "Candidatos",        //EJE X 
                  "EcoRegion",                    //EJE Y
                  data,                             //Datos del Archivo
                  PlotOrientation.HORIZONTAL,         //Orientacion
                  true,                             //Leyenda Grafico
                  true,                             //Herramientas
                  false                             //url Grafico
          );  
          
          ChartPanel panel=new ChartPanel(grafico_barras);
          panel.setMouseWheelEnabled(true);
          panel.setPreferredSize(new Dimension(1000,980));
          
          return panel;
    
     }
     
     
public static JLabel Manejo_Data(String imagePath) {
    JLabel image_label;
    try {
        File imageFile = new File(imagePath);
        if (imageFile.exists()) {
            BufferedImage buffer_imagen = ImageIO.read(imageFile);
            ImageIcon image_icon = new ImageIcon(buffer_imagen.getScaledInstance(60, 60, 60));
            return image_label = new JLabel(image_icon);
        } else {
            return image_label = new JLabel("No Imagen");
        }
    } catch (Exception ex) {
        return image_label = new JLabel("No Imagen");
    }
}

     
     
    
}
