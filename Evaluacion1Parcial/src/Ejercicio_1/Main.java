
package Ejercicio_1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    int numeroEmpleados=0;
    String nombre1;
    int edad1;
    double salario1;

        Scanner sc=new Scanner(System.in);
        Scanner ab=new Scanner(System.in);
        System.out.println("Ingrese el numero de empleados");
        numeroEmpleados= sc.nextInt();
        Empleado [] empleados = new Empleado[numeroEmpleados];
        for (int i=0; i<numeroEmpleados;i++){
            System.out.println("Ingrese el nombre del empleado "+(i+1)+":");
            nombre1=ab.nextLine();
            System.out.println("Ingrese la edad del empeado "+(i+1)+":");
            edad1= sc.nextInt();
            System.out.println("Ingrese el salario del empleado "+(i+1)+":");
            salario1=sc.nextDouble();
            empleados [i]= new Empleado (nombre1,edad1, salario1);
        }
        for (int i=0;i<numeroEmpleados;i++){
            if (empleados [i].getSalario()>0){
                empleados[i].aplicarDescuento();
            }
        }
    }
}
