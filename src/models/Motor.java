package models;

public class Motor {
    private String tipo;
    private String potencia;
    private String cilindrada;
    private String marca;
    private String modelo;

    public Motor() {} // Constructor por defecto

    // Constructor
    public Motor(String tipo, String potencia, String cilindrada, String marca, String modelo) {
        this.tipo = tipo;
        this.potencia = potencia;
        this.cilindrada = cilindrada;
        this.marca = marca;
        this.modelo = modelo;
    }
    // Métodos
    public void displayInfo() {
        System.out.println("Información del motor:");
        System.out.println("Tipo: " + tipo);
        System.out.println("Potencia: " + potencia);
        System.out.println("Cilindrada: " + cilindrada);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }

}
