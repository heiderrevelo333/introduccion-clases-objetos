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
    // Getters (LECTURA)
    public String getDimenciones() {
        return dimenciones;
    }
    public String getPeso() {
        return peso;
    }
    public String getMaterial() {
        return material;
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
    public void setDimenciones(String dimenciones) {
        this.dimenciones = dimenciones;
    }
    public void setPeso(String peso) {
        this.peso = peso;
    }
    public void setMaterial(String material) {
        this.material = material;
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
