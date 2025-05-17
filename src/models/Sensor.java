package models;

public class Sensor {
    private String velocidad;
    private String temperatura;
    private String presion;
    private String nivelCombustible;
    private String estadoMotor;
    private String estadoNeumaticos;


    public Sensor() {} // Constructor por defecto

    // Constructor
    public Sensor(String velocidad, String temperatura, String presion, String nivelCombustible, String estadoMotor, String estadoNeumaticos) {
        this.velocidad = velocidad;
        this.temperatura = temperatura;
        this.presion = presion;
        this.nivelCombustible = nivelCombustible;
        this.estadoMotor = estadoMotor;
        this.estadoNeumaticos = estadoNeumaticos;
    }
    // Métodos
    public void displayInfo() {
        System.out.println("Información del sensor:");
        System.out.println("Velocidad: " + velocidad);
        System.out.println("Temperatura: " + temperatura);
        System.out.println("Presión: " + presion);
        System.out.println("Nivel de combustible: " + nivelCombustible);
        System.out.println("Estado del motor: " + estadoMotor);
        System.out.println("Estado de los neumáticos: " + estadoNeumaticos);
    }

}
