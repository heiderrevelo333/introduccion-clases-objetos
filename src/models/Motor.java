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
    // Getters (LECTURA)
    public String getTipo() {
        return tipo;
    }
    public String getPotencia() {
        return potencia;
    }
    public String getCilindrada() {
        return cilindrada;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    // Setters (ESCRITURA)
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }
    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

}
