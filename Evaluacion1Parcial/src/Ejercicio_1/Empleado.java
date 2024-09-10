package Ejercicio_1;

public class Empleado {
    private String nombre;
    private int edad;
    private double salario;
    double porcentaje=(salario*(10/100));

    public Empleado() {
    }

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void aplicarDescuento() {
        if (salario < 3000) {
            System.out.println(nombre+" ha recibido un aumento. nuevo salario es: "+(salario+(salario*0.1)));
        } else {
            System.out.println(nombre+" no califica para el aumento");
        }
    }
}
