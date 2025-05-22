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
    // Getters (LECTURA)
    public String getBateria() {
        return bateria;
    }
    public String getLuces() {
        return luces;
    }
    public String getSensores() {
        return sensores;
    }
    public String getAlternador() {
        return alternador;
    }
    // Setters (ESCRITURA)
    public void setBateria(String bateria) {
        this.bateria = bateria;
    }   
    public void setLuces(String luces) {
        this.luces = luces;
    }
    public void setSensores(String sensores) {
        this.sensores = sensores;
    }
    public void setAlternador(String alternador) {
        this.alternador = alternador;
    }

}
