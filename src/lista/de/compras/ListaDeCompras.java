package lista.de.compras;

import java.util.Scanner;

public class ListaDeCompras {

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
            }
        }
        System.out.println("La lista de compras es:");
        System.out.println(lista[0].getNombre()+ " " + lista[0].getCantidad() + "(" + lista[0].calcularTotal(lista[0].getCantidad(), lista[0].getPrecio())+")");
        System.out.println(lista[1].getNombre()+ " " + lista[1].getCantidad() + "(" + lista[1].calcularTotal(lista[1].getCantidad(), lista[1].getPrecio())+")");
        System.out.println("El costo total es de: " + (lista[0].calcularTotal(lista[0].getCantidad(), lista[0].getPrecio()) + lista[1].calcularTotal(lista[1].getCantidad(), lista[1].getPrecio())));
    }
}
