package models;

public class Mantenimiento {
    private String tipoMantenimiento;
    private String fecha;
    private String kilometraje;
    private String costo;

    public Mantenimiento() {} // Constructor por defecto

    // Constructor
    public Mantenimiento(String tipoMantenimiento, String fecha, String kilometraje, String costo) {
        this.tipoMantenimiento = tipoMantenimiento;
        this.fecha = fecha;
        this.kilometraje = kilometraje;
        this.costo = costo;
    }

    // Métodos
    public void displayInfo() {
        System.out.println("Información del mantenimiento:");
        System.out.println("Tipo de mantenimiento: " + tipoMantenimiento);
        System.out.println("Fecha: " + fecha);
        System.out.println("Kilometraje: " + kilometraje);
        System.out.println("Costo: " + costo);
    }

}
