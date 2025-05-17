import models.Car;
import models.Vehiculo;
import models.Motor;
import models.Transmision;
import models.Chasis;
import models.Neumatico;
import models.SistemaElectrico;
import models.SistemaFrenos;
import models.RegistroVehicular;
import models.Mantenimiento;
import models.Sensor;

public class App {
    public static void main(String[] args) throws Exception {
        Car miCar = new Car("Toyota", "Corolla", 2020);
        Car familyCar = new Car("Ford", "Explorer", 2021);

        Vehiculo miVehiculo = new Vehiculo("123ABC", "Toyota", "Corolla", "XYZ123", "Rojo", "Juan Perez");

        Motor miMotor = new Motor("Gasolina", "150 HP", "2000 cc", "Toyota", "2ZR-FE");

        Transmision miTransmision = new Transmision("Automática", "6", "4x2", "Toyota", "CVT", "2020");

        Chasis miChasis = new Chasis("4.5m x 1.8m", "1500 kg", "Acero", "Toyota", "Corolla", "2020");

        Neumatico miNeumatico = new Neumatico("Michelin", "Primacy", "205/55R16", "10 kg");

        SistemaElectrico miSistemaElectrico = new SistemaElectrico("Batería de 12V", "LED", "Sensores de estacionamiento", "Alternador de 120A");

        SistemaFrenos miSistemaFrenos = new SistemaFrenos("Discos", "Delanteros y traseros", "Sí", "No", "Nuevo");

        RegistroVehicular miRegistroVehicular = new RegistroVehicular("ABC123", "Juan Perez", "Toyota", "Corolla", "2020-01-01");

        Mantenimiento miMantenimiento = new Mantenimiento("Cambio de aceite", "2023-01-01", "10000 km", "$50");

        Sensor miSensor = new Sensor("Sensor de temperatura", "Temperatura del motor", "Celsius", "Toyota", "Corolla", "2020");

        System.out.println("Hello, World!");

        miCar.displayInfo();
        familyCar.displayInfo();
        miVehiculo.displayInfo();
        miMotor.displayInfo();
        miTransmision.displayInfo();
        miChasis.displayInfo();
        miNeumatico.displayInfo();
        miSistemaElectrico.displayInfo();
        miSistemaFrenos.displayInfo();
        miRegistroVehicular.displayInfo();
        miMantenimiento.displayInfo();
        miSensor.displayInfo(); 
        
    }
}
