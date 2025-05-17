package models;

public class Transmision {
    private String tipo;
    private String marchas;
    private String traccion;
    private String marca;
    private String modelo;
    private String año;

    public Transmision() {} // Constructor por defecto

    // Constructor
    public Transmision(String tipo, String marchas, String traccion, String marca, String modelo, String año) {
        this.tipo = tipo;
        this.marchas = marchas;
        this.traccion = traccion;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }
    // Métodos
    public void displayInfo() {
        System.out.println("Información de la transmisión:");
        System.out.println("Tipo: " + tipo);
        System.out.println("Marchas: " + marchas);
        System.out.println("Tracción: " + traccion);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
    }

}
