public class Productos{
    private String nombre = "";
    private float precio = 0;
    private int cantidad = 0;

    public Productos(String nombre, float precio, int cantidad){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre='" + nombre + '\'' + ", precio=" + precio + ", cantidad=" + cantidad + '}' ;
    }

    public float subtotal(){
        return this.precio * this.cantidad;
    }


}