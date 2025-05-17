package models;

public class Chasis {
    private String dimenciones;
    private String peso;
    private String material;
    private String marca;
    private String modelo;
    private String año;

    public Chasis() {} // Constructor por defecto

    // Constructor
    public Chasis(String dimenciones, String peso, String material, String marca, String modelo, String año) {
        this.dimenciones = dimenciones;
        this.peso = peso;
        this.material = material;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }
    // Métodos
    public void displayInfo() {
        System.out.println("Información del chasis:");
        System.out.println("Dimensiones: " + dimenciones);
        System.out.println("Peso: " + peso);
        System.out.println("Material: " + material);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
    }

}
