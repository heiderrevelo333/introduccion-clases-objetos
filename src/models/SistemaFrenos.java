package models;

public class SistemaFrenos {
    private String tipo;
    private String dicos;
    private String ABS;
    private String tambor;
    private String estado;

    public SistemaFrenos() {} // Constructor por defecto

    // Constructor
    public SistemaFrenos(String tipo, String dicos, String ABS, String tambor, String estado) {
        this.tipo = tipo;
        this.dicos = dicos;
        this.ABS = ABS;
        this.tambor = tambor;
        this.estado = estado;
    }
    // Métodos
    public void displayInfo() {
        System.out.println("Información del sistema de frenos:");
        System.out.println("Tipo: " + tipo);
        System.out.println("Discos: " + dicos);
        System.out.println("ABS: " + ABS);
        System.out.println("Tambor: " + tambor);
        System.out.println("Estado: " + estado);
    }

}
