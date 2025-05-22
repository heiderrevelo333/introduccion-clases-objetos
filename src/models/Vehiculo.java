package models;

public class Vehiculo {
    private String identificacion;
    private String marca;
    private String modelo;
    private String matricula;
    private String color;
    private String propietario;

    public Vehiculo() {} // Constructor por defecto

    // Constructor
    public Vehiculo(String identificacion, String marca, String modelo, String matricula, String color, String propietario) {
        this.identificacion = identificacion;
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula; 
        this.color = color;    
        this.propietario = propietario;
    }
    // Métodos
    public void displayInfo() {
        System.out.println("Información del vehículo:");
        System.out.println("Identificación: " + identificacion);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Color: " + color);
        System.out.println("Propietario: " + propietario);
    }
    // Getters (LECTURA)
    public String getIdentificacion() {
        return identificacion;
    }   
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public String getMatricula() {
        return matricula;
    }
    public String getColor() {
        return color;
    }
    public String getPropietario() {
        return propietario;
    }
    // Setters (ESCRITURA)
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
}