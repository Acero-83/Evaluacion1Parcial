package Ejercicio_2;

public class Vehiculo {
    private String marca;
    private String modelos;
    private double precio;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelos, double precio) {
        this.marca = marca;
        this.modelos = modelos;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void mostrarDetalles (){
        System.out.println("La marca del auto es: "+marca);
        System.out.println("El modelo del auto es: "+modelos);
        System.out.println("El precio del auto es: "+precio);
    }

}
