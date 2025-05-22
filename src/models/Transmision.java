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
    // Getters (LECTURA)
    public String getTipo() {
        return tipo;
    }
    public String getMarchas() {
        return marchas;
    }
    public String getTraccion() {
        return traccion;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public String getAño() {
        return año;
    }
    // Setters (ESCRITURA)
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setMarchas(String marchas) {
        this.marchas = marchas;
    }
    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setAño(String año) {
        this.año = año;
    }

}
