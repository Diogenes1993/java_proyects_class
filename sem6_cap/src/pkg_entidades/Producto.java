package pkg_entidades;

public class Producto {
   private int id;
   private String nombre;
   private int id_categoria;
   private byte[] imagen;

    public Producto() {
    }

    public Producto(int id, String nombre, int id_categoria, byte[] imagen) {
        this.id = id;
        this.nombre = nombre;
        this.id_categoria = id_categoria;
        this.imagen = imagen;
    }

    public Producto(String nombre, int id_categoria, byte[] imagen) {
        this.nombre = nombre;
        this.id_categoria = id_categoria;
        this.imagen = imagen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }
   
   
}
