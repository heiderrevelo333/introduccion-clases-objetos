package models;

public class RegistroVehicular {
    private String matricula;
    private String propietario;
    private String marca;
    private String modelo;
    private String fecharegistro;

    public RegistroVehicular() {} // Constructor por defecto

    // Constructor
    public RegistroVehicular(String matricula, String propietario, String marca, String modelo, String fecharegistro) {
        this.matricula = matricula;
        this.propietario = propietario;
        this.marca = marca;
        this.modelo = modelo;
        this.fecharegistro = fecharegistro;
    }
    // Métodos
    public void displayInfo() {
        System.out.println("Información del registro vehicular:");
        System.out.println("Matrícula: " + matricula);
        System.out.println("Propietario: " + propietario);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Fecha de registro: " + fecharegistro);
    }
}
