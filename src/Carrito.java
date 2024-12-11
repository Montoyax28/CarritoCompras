import java.util.ArrayList;

public class Carrito{
    private ArrayList<Productos> listProducts = new ArrayList<Productos>();

    public void addProduct(String nombre, float precio, int cantidad){
        listProducts.add(new Productos(nombre,precio,cantidad));
        System.out.println("-------------------Producto añadido al carrito----------------");
    }

    public void getProducts(){

        if(listProducts.size() == 0){
            System.out.println("--------------No hay productos en el carrito.-----------------");
            return;
        }

        for (int i = 0; i < listProducts.size(); i++){
            System.out.println(listProducts.get(i));
        }
    }

    public float calculateProduct(boolean mostrar){
        float suma = 0;
        for (Productos producto : listProducts) {
            suma += producto.subtotal();
        }

        if(suma > 0 && mostrar){
            System.out.println("--------------Total de la compra es: " + suma + "------------------");
        }
        return suma;
    }

    public void offerProduct(float suma){
        final float montoMinimo = 40000;
        if (suma >= montoMinimo){
            double totalDiscount = calculateOffer(suma);
            System.out.println("-----------Aplica para el descuento del 7% " + totalDiscount + "---------------------");
        } else {
            System.out.println("----------No aplica descuento, monto mínimo " + montoMinimo + "-----------------------");
        }
    }

    public void clearCart(){
        listProducts.clear();
        System.out.println("----------------Carrito actual: " + listProducts + "----------------------------");
    }

    private double calculateOffer(float suma){
        final double discount =  0.07;
        return suma - (suma * discount);
    }


}