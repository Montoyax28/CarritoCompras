import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Carrito carrito = new Carrito();

         int opcion = 0;

        do {
            System.out.println("Opciones:");
            System.out.println("1. Mostrar productos");
            System.out.println("2. Agregar producto al carrito");
            System.out.println("3. Total de la compra");
            System.out.println("4. Aplicar descuento");
            System.out.println("5. Vaciar carrito");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    carrito.getProducts();
                    break;
                case 2:
                    System.out.println("-------------------Digite el producto-------------");
                    System.out.println("Nombre");
                    sc.nextLine();
                    String nombre = sc.nextLine();
                    System.out.println("Precio");
                    float precio = sc.nextFloat();
                    System.out.println("Cantidad");
                    int cantidad = sc.nextInt();
                    carrito.addProduct(nombre, precio,cantidad);
                    break;
                case 3:
                    carrito.calculateProduct(true);
                    break;
                case 4:
                    float suma = carrito.calculateProduct(false);
                    carrito.offerProduct(suma);
                    break;
                case 5:
                    carrito.clearCart();
                    break;
            }

        } while(opcion != 6);


    }
}