package models;

public class Neumatico {
    private String marca;
    private String modelo;
    private String tamaño;
    private String peso;

    public Neumatico() {} // Constructor por defecto

    // Constructor
    public Neumatico(String marca, String modelo, String tamaño, String peso) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamaño = tamaño;
        this.peso = peso;
    }
    // Métodos
    public void displayInfo() {
        System.out.println("Información del neumático:");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Tamaño: " + tamaño);
        System.out.println("Peso: " + peso);
    }

}
