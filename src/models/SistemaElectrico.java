package models;

public class SistemaElectrico {
    private String bateria;
    private String luces;
    private String sensores;
    private String alternador;

    public SistemaElectrico() {} // Constructor por defecto

    // Constructor
    public SistemaElectrico(String bateria, String luces, String sensores, String alternador) {
        this.bateria = bateria;
        this.luces = luces;
        this.sensores = sensores;
        this.alternador = alternador;
    }
    // Métodos
    public void displayInfo() {
        System.out.println("Información del sistema eléctrico:");
        System.out.println("Batería: " + bateria);
        System.out.println("Luces: " + luces);
        System.out.println("Sensores: " + sensores);
        System.out.println("Alternador: " + alternador);
    }

}
