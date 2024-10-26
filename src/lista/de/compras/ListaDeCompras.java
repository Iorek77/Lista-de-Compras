package lista.de.compras;

import java.util.Scanner;

public class ListaDeCompras {

    public static void showarray(compras[] x) {
        System.out.println("La lista de compras es:");
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i].getNombre() + " " + x[i].getCantidad() + " ($" + +x[i].calcularTotal(+x[i].getCantidad(), +x[i].getPrecio()) + ")");
        }
    }

    public static void arraycost(compras[] x) {
        double total = 0;
        for (int i = 0; i < x.length; i++) {
            total = total + x[i].calcularTotal(x[i].getCantidad(), x[i].getPrecio());
        }
        System.out.println("El costo total es: $" + total);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        compras leche = new compras("Leche", 1, 42);
        compras pan = new compras("Pan", 1, 50);
        compras lista[] = new compras[2];
        String item;
        int quantity;
        for (int i = 0; i < lista.length; i++) {
            System.out.println("Agregue un elemento a la lista");
            System.out.println(leche.getNombre()+ " " + leche.getPrecio());
            System.out.println(pan.getNombre()+ " " + pan.getPrecio());
            item = input.next();
            switch (item.toLowerCase()) {
                case "leche":
                    lista[i] = leche;
                    System.out.println("Cuantas?");
                    quantity = input.nextInt();
                    leche.setCantidad(quantity);
                    break;
                case "pan":
                    lista[i] = pan;
                    System.out.println("Cuantos?");
                    quantity = input.nextInt();
                    pan.setCantidad(quantity);
                    break;
                default:
                    System.out.println("Item incorrecto.");
                    i--;
            }
        }
        showarray(lista);
        arraycost(lista);
    }
  }
