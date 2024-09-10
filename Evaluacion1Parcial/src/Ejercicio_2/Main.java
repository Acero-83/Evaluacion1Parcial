package Ejercicio_2;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int numerocarros = 0;
        String marca1;
        String modelo1;
        double precio1;
        Scanner sc = new Scanner(System.in);
        Scanner ab = new Scanner(System.in);
        System.out.println("Ingrese el numero de vehiculos");
        numerocarros = sc.nextInt();
        Vehiculo[] vehiculos = new Vehiculo[numerocarros];
        for (int i = 0; i < numerocarros; i++) {
            System.out.println("Ingrese la marca del vehiculo " + (i + 1) + ":");
            marca1 = ab.nextLine();
            System.out.println("Ingrese el modelo del vehiculo " + (i + 1) + ":");
            modelo1 = ab.nextLine();
            System.out.println("Ingrese el precio del vehiculo  " + (i + 1) + ":");
            precio1 = sc.nextDouble();
            vehiculos[i] = new Vehiculo(marca1, modelo1, precio1);
        }
        for (int i = 0; i < numerocarros; i++) {
            if (vehiculos[i].getPrecio() > 0) {
                vehiculos[i].mostrarDetalles();
                System.out.println("");
            }
            for (int j = 0; j < numerocarros; j++) {
                if (vehiculos[j].getPrecio() > 2500 & vehiculos[j].getPrecio() < 4000) {
                    System.out.println("Este vehiculo esta entre los 2500 a 4000$");
                    vehiculos[j].mostrarDetalles();
                    System.out.println("");
                }
            }

        }
    }
}

