package pkg_entidades;


public class Categoria {
   private int id;
   private String nombre;
   private byte[] imagen;

    public Categoria() {
    }

    public Categoria(int id, String nombre, byte[] imagen) {
        this.id = id;
        this.nombre = nombre;
        this.imagen = imagen;
    }

    public Categoria(String nombre, byte[] imagen) {
        this.nombre = nombre;
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

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }
   
   
   
}
