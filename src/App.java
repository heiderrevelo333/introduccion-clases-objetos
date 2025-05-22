import models.*;


public class App {
    public static void main(String[] args) throws Exception {
        Car miCar = new Car();
        
        // USAMOS SETTERS PARA INICIALIZAR LOS ATRIBUTOS
        miCar.setMake("Toyota");
        miCar.setModel("Corolla");
        miCar.setYear(2020);
        // USAMOS LOS CONSTRUCTORES PARA INICIALIZAR LOS ATRIBUTOS
        System.out.println("Make: " + miCar.getMake());
        System.out.println("Model: " + miCar.getModel());   
        System.out.println("Year: " + miCar.getYear());

        Car familyCar = new Car();
        // USAMOS SETTERS PARA INICIALIZAR LOS ATRIBUTOS
        familyCar.setMake("Honda");
        familyCar.setModel("Civic");
        familyCar.setYear(2021);
        // USAMOS LOS CONSTRUCTORES PARA INICIALIZAR LOS ATRIBUTOS
        System.out.println("Make: " + familyCar.getMake());
        System.out.println("Model: " + familyCar.getModel());
        System.out.println("Year: " + familyCar.getYear());
        System.out.println("-------------------------------------------------------");

        Car soyCar = new Car();
        // USAMOS SETTERS PARA INICIALIZAR LOS ATRIBUTOS
        soyCar.setMake("Chevrolet");
        soyCar.setModel("Sonic");
        soyCar.setYear(2019);
        // USAMOS LOS CONSTRUCTORES PARA INICIALIZAR LOS ATRIBUTOS
        System.out.println("Make: " + soyCar.getMake());
        System.out.println("Model: " + soyCar.getModel());
        System.out.println("Year: " + soyCar.getYear());
        System.out.println("-------------------------------------------------------");

        Car rayoCar = new Car();
        // USAMOS SETTERS PARA INICIALIZAR LOS ATRIBUTOS
        rayoCar.setMake("Ford");
        rayoCar.setModel("Mustang");
        rayoCar.setYear(2022);
        // USAMOS LOS CONSTRUCTORES PARA INICIALIZAR LOS ATRIBUTOS
        System.out.println("Make: " + rayoCar.getMake());
        System.out.println("Model: " + rayoCar.getModel());
        System.out.println("Year: " + rayoCar.getYear());
        System.out.println("-------------------------------------------------------");

        // -------------------------------------------------------//

        Chasis miChasis = new Chasis();

        // USAMOS SETTERS PARA INICIALIZAR LOS ATRIBUTOS
        miChasis.setDimenciones("2.5m x 1.5m x 1.2m");
        miChasis.setPeso("1500kg");
        miChasis.setMaterial("Acero");
        miChasis.setMarca("Toyota");
        miChasis.setModelo("Corolla");
        miChasis.setAño("2020");
        // USAMOS LOS CONSTRUCTORES PARA INICIALIZAR LOS ATRIBUTOS
        System.out.println("Dimensiones: " + miChasis.getDimenciones());
        System.out.println("Peso: " + miChasis.getPeso());
        System.out.println("Material: " + miChasis.getMaterial());
        System.out.println("Marca: " + miChasis.getMarca());
        System.out.println("Modelo: " + miChasis.getModelo());
        System.out.println("Año: " + miChasis.getAño());
        System.out.println("-------------------------------------------------------");

        Chasis familyChasis = new Chasis();
        // USAMOS SETTERS PARA INICIALIZAR LOS ATRIBUTOS
        familyChasis.setDimenciones("2.5m x 1.5m x 1.2m");
        familyChasis.setPeso("1500kg");
        familyChasis.setMaterial("Acero");
        familyChasis.setMarca("Honda");
        familyChasis.setModelo("Civic");
        familyChasis.setAño("2021");
        // USAMOS LOS CONSTRUCTORES PARA INICIALIZAR LOS ATRIBUTOS
        System.out.println("Dimensiones: " + familyChasis.getDimenciones());
        System.out.println("Peso: " + familyChasis.getPeso());
        System.out.println("Material: " + familyChasis.getMaterial());
        System.out.println("Marca: " + familyChasis.getMarca());
        System.out.println("Modelo: " + familyChasis.getModelo());
        System.out.println("Año: " + familyChasis.getAño());
        System.out.println("-------------------------------------------------------");
        

        Chasis soyChasis = new Chasis();
        // USAMOS SETTERS PARA INICIALIZAR LOS ATRIBUTOS
        soyChasis.setDimenciones("2.5m x 1.5m x 1.2m");
        soyChasis.setPeso("1500kg");
        soyChasis.setMaterial("Acero");
        soyChasis.setMarca("Chevrolet");
        soyChasis.setModelo("Sonic");
        soyChasis.setAño("2019");
        // USAMOS LOS CONSTRUCTORES PARA INICIALIZAR LOS ATRIBUTOS
        System.out.println("Dimensiones: " + soyChasis.getDimenciones());
        System.out.println("Peso: " + soyChasis.getPeso());
        System.out.println("Material: " + soyChasis.getMaterial());
        System.out.println("Marca: " + soyChasis.getMarca());
        System.out.println("Modelo: " + soyChasis.getModelo());
        System.out.println("Año: " + soyChasis.getAño());
        System.out.println("-------------------------------------------------------");

        Chasis rayoChasis = new Chasis();
        // USAMOS SETTERS PARA INICIALIZAR LOS ATRIBUTOS
        rayoChasis.setDimenciones("2.5m x 1.5m x 1.2m");
        rayoChasis.setPeso("1500kg");
        rayoChasis.setMaterial("Acero");
        rayoChasis.setMarca("Ford");
        rayoChasis.setModelo("Mustang");
        rayoChasis.setAño("2022");
        // USAMOS LOS CONSTRUCTORES PARA INICIALIZAR LOS ATRIBUTOS
        System.out.println("Dimensiones: " + rayoChasis.getDimenciones());
        System.out.println("Peso: " + rayoChasis.getPeso());
        System.out.println("Material: " + rayoChasis.getMaterial());
        System.out.println("Marca: " + rayoChasis.getMarca());
        System.out.println("Modelo: " + rayoChasis.getModelo());
        System.out.println("Año: " + rayoChasis.getAño());
        System.out.println("-------------------------------------------------------");

        // -------------------------------------------------------//

        Mantenimiento miMantenimiento = new Mantenimiento();
        // USAMOS SETTERS PARA INICIALIZAR LOS ATRIBUTOS
        miMantenimiento.setTipoMantenimiento("Cambio de aceite");
        miMantenimiento.setFecha("2024-05-20");
        miMantenimiento.setKilometraje("15000");
        miMantenimiento.setCosto("500");
        // USAMOS LOS CONSTRUCTORES PARA INICIALIZAR LOS ATRIBUTOS
        System.out.println("Tipo de mantenimiento: " + miMantenimiento.getTipoMantenimiento());
        System.out.println("Fecha de mantenimiento: " + miMantenimiento.getFecha());
        System.out.println("Kilometraje: " + miMantenimiento.getKilometraje());
        System.out.println("Costo: " + miMantenimiento.getCosto());
        System.out.println("-------------------------------------------------------");

        Mantenimiento familyMantenimiento = new Mantenimiento();
        // USAMOS SETTERS PARA INICIALIZAR LOS ATRIBUTOS
        familyMantenimiento.setTipoMantenimiento("Cambio de frenos");
        familyMantenimiento.setFecha("2024-06-15");
        familyMantenimiento.setKilometraje("20000");
        familyMantenimiento.setCosto("800");
        // USAMOS LOS CONSTRUCTORES PARA INICIALIZAR LOS ATRIBUTOS
        System.out.println("Tipo de mantenimiento: " + familyMantenimiento.getTipoMantenimiento());
        System.out.println("Fecha de mantenimiento: " + familyMantenimiento.getFecha());
        System.out.println("Kilometraje: " + familyMantenimiento.getKilometraje());
        System.out.println("Costo: " + familyMantenimiento.getCosto());
        System.out.println("-------------------------------------------------------");

        Mantenimiento soyMantenimiento = new Mantenimiento();
        // USAMOS SETTERS PARA INICIALIZAR LOS ATRIBUTOS
        soyMantenimiento.setTipoMantenimiento("Cambio de llantas");
        soyMantenimiento.setFecha("2024-07-10");
        soyMantenimiento.setKilometraje("25000");
        soyMantenimiento.setCosto("1200");
        // USAMOS LOS CONSTRUCTORES PARA INICIALIZAR LOS ATRIBUTOS
        System.out.println("Tipo de mantenimiento: " + soyMantenimiento.getTipoMantenimiento());
        System.out.println("Fecha de mantenimiento: " + soyMantenimiento.getFecha());
        System.out.println("Kilometraje: " + soyMantenimiento.getKilometraje());
        System.out.println("Costo: " + soyMantenimiento.getCosto());
        System.out.println("-------------------------------------------------------");

        Mantenimiento rayoMantenimiento = new Mantenimiento();
        // USAMOS SETTERS PARA INICIALIZAR LOS ATRIBUTOS
        rayoMantenimiento.setTipoMantenimiento("Revisión general");
        rayoMantenimiento.setFecha("2024-08-05");
        rayoMantenimiento.setKilometraje("30000");
        rayoMantenimiento.setCosto("1500");
        // USAMOS LOS CONSTRUCTORES PARA INICIALIZAR LOS ATRIBUTOS
        System.out.println("Tipo de mantenimiento: " + rayoMantenimiento.getTipoMantenimiento());
        System.out.println("Fecha de mantenimiento: " + rayoMantenimiento.getFecha());
        System.out.println("Kilometraje: " + rayoMantenimiento.getKilometraje());
        System.out.println("Costo: " + rayoMantenimiento.getCosto());
        System.out.println("-------------------------------------------------------");

        // -------------------------------------------------------//

        Motor miMotor = new Motor();
        // USAMOS SETTERS PARA INICIALIZAR LOS ATRIBUTOS
        miMotor.setTipo("Gasolina");
        miMotor.setPotencia("150 HP");
        miMotor.setCilindrada("2000 cc");
        miMotor.setMarca("Toyota");
        miMotor.setModelo("Corolla");
        // USAMOS LOS CONSTRUCTORES PARA INICIALIZAR LOS ATRIBUTOS
        System.out.println("Tipo: " + miMotor.getTipo());
        System.out.println("Potencia: " + miMotor.getPotencia());
        System.out.println("Cilindrada: " + miMotor.getCilindrada());
        System.out.println("Marca: " + miMotor.getMarca());
        System.out.println("Modelo: " + miMotor.getModelo());
        System.out.println("-------------------------------------------------------");

        Motor familyMotor = new Motor();
        // USAMOS SETTERS PARA INICIALIZAR LOS ATRIBUTOS
        familyMotor.setTipo("Gasolina");
        familyMotor.setPotencia("180 HP");
        familyMotor.setCilindrada("2200 cc");
        familyMotor.setMarca("Honda");
        familyMotor.setModelo("Civic");
        // USAMOS LOS CONSTRUCTORES PARA INICIALIZAR LOS ATRIBUTOS
        System.out.println("Tipo: " + familyMotor.getTipo());
        System.out.println("Potencia: " + familyMotor.getPotencia());
        System.out.println("Cilindrada: " + familyMotor.getCilindrada());
        System.out.println("Marca: " + familyMotor.getMarca());
        System.out.println("Modelo: " + familyMotor.getModelo());
        System.out.println("-------------------------------------------------------");

        Motor soyMotor = new Motor();
        // USAMOS SETTERS PARA INICIALIZAR LOS ATRIBUTOS
        soyMotor.setTipo("Gasolina");
        soyMotor.setPotencia("120 HP");
        soyMotor.setCilindrada("1600 cc");
        soyMotor.setMarca("Chevrolet");
        soyMotor.setModelo("Sonic");
        // USAMOS LOS CONSTRUCTORES PARA INICIALIZAR LOS ATRIBUTOS
        System.out.println("Tipo: " + soyMotor.getTipo());
        System.out.println("Potencia: " + soyMotor.getPotencia());
        System.out.println("Cilindrada: " + soyMotor.getCilindrada());
        System.out.println("Marca: " + soyMotor.getMarca());
        System.out.println("Modelo: " + soyMotor.getModelo());
        System.out.println("-------------------------------------------------------");
        
        Motor rayoMotor = new Motor();
        // USAMOS SETTERS PARA INICIALIZAR LOS ATRIBUTOS
        rayoMotor.setTipo("Gasolina");
        rayoMotor.setPotencia("300 HP");
        rayoMotor.setCilindrada("5000 cc");
        rayoMotor.setMarca("Ford");
        rayoMotor.setModelo("Mustang");
        // USAMOS LOS CONSTRUCTORES PARA INICIALIZAR LOS ATRIBUTOS
        System.out.println("Tipo: " + rayoMotor.getTipo());
        System.out.println("Potencia: " + rayoMotor.getPotencia());
        System.out.println("Cilindrada: " + rayoMotor.getCilindrada());
        System.out.println("Marca: " + rayoMotor.getMarca());
        System.out.println("Modelo: " + rayoMotor.getModelo());
        System.out.println("-------------------------------------------------------");


        // -------------------------------------------------------//

        Neumatico miNeumatico = new Neumatico();
        // USAMOS SETTERS PARA INICIALIZAR LOS ATRIBUTOS
        miNeumatico.setMarca("Michelin");
        miNeumatico.setModelo("Primacy 4");
        miNeumatico.setTamaño("205/55 R16");
        miNeumatico.setPeso("10kg");
        // USAMOS LOS CONSTRUCTORES PARA INICIALIZAR LOS ATRIBUTOS  
        System.out.println("Marca: " + miNeumatico.getMarca()); 
        System.out.println("Modelo: " + miNeumatico.getModelo());
        System.out.println("Tamaño: " + miNeumatico.getTamaño());
        System.out.println("Peso: " + miNeumatico.getPeso());
        System.out.println("-------------------------------------------------------");

        Neumatico familyNeumatico = new Neumatico();
        // USAMOS SETTERS PARA INICIALIZAR LOS ATRIBUTOS
        familyNeumatico.setMarca("Bridgestone");
        familyNeumatico.setModelo("Dueler H/L 400");
        familyNeumatico.setTamaño("225/65 R17");
        familyNeumatico.setPeso("12kg");
        // USAMOS LOS CONSTRUCTORES PARA INICIALIZAR LOS ATRIBUTOS
        System.out.println("Marca: " + familyNeumatico.getMarca());
        System.out.println("Modelo: " + familyNeumatico.getModelo());
        System.out.println("Tamaño: " + familyNeumatico.getTamaño());
        System.out.println("Peso: " + familyNeumatico.getPeso());
        System.out.println("-------------------------------------------------------");

        Neumatico soyNeumatico = new Neumatico();
        // USAMOS SETTERS PARA INICIALIZAR LOS ATRIBUTOS
        soyNeumatico.setMarca("Goodyear");
        soyNeumatico.setModelo("Eagle F1");
        soyNeumatico.setTamaño("195/65 R15");
        soyNeumatico.setPeso("9kg");
        // USAMOS LOS CONSTRUCTORES PARA INICIALIZAR LOS ATRIBUTOS
        System.out.println("Marca: " + soyNeumatico.getMarca());
        System.out.println("Modelo: " + soyNeumatico.getModelo());
        System.out.println("Tamaño: " + soyNeumatico.getTamaño());
        System.out.println("Peso: " + soyNeumatico.getPeso());
        System.out.println("-------------------------------------------------------");

        Neumatico rayoNeumatico = new Neumatico();
        // USAMOS SETTERS PARA INICIALIZAR LOS ATRIBUTOS
        rayoNeumatico.setMarca("Pirelli");
        rayoNeumatico.setModelo("P-Zero");
        rayoNeumatico.setTamaño("245/45 R18");
        rayoNeumatico.setPeso("11kg");
        // USAMOS LOS CONSTRUCTORES PARA INICIALIZAR LOS ATRIBUTOS
        System.out.println("Marca: " + rayoNeumatico.getMarca());
        System.out.println("Modelo: " + rayoNeumatico.getModelo());
        System.out.println("Tamaño: " + rayoNeumatico.getTamaño());
        System.out.println("Peso: " + rayoNeumatico.getPeso());
        System.out.println("-------------------------------------------------------");

        // -------------------------------------------------------//

        RegistroVehicular miRegistro = new RegistroVehicular();
        // USAMOS SETTERS PARA INICIALIZAR LOS ATRIBUTOS
        miRegistro.setPropietario("Juan Perez");
        miRegistro.setMatricula("ABC123");
        miRegistro.setMarca("Toyota");
        miRegistro.setModelo("Corolla");
        miRegistro.setFecharegistro("2024-01-01");
        // USAMOS LOS CONSTRUCTORES PARA INICIALIZAR LOS ATRIBUTOS
        System.out.println("Propietario: " + miRegistro.getPropietario());
        System.out.println("Placa: " + miRegistro.getMatricula());
        System.out.println("Marca: " + miRegistro.getMarca());
        System.out.println("Modelo: " + miRegistro.getModelo());
        System.out.println("Fecha de registro: " + miRegistro.getFecharegistro());  
        System.out.println("-------------------------------------------------------");

        RegistroVehicular familyRegistro = new RegistroVehicular();
        // USAMOS SETTERS PARA INICIALIZAR LOS ATRIBUTOS
        familyRegistro.setPropietario("Maria Lopez");
        familyRegistro.setMatricula("XYZ789");
        familyRegistro.setMarca("Honda");
        familyRegistro.setModelo("Civic");
        familyRegistro.setFecharegistro("2024-02-15");
        // USAMOS LOS CONSTRUCTORES PARA INICIALIZAR LOS ATRIBUTOS
        System.out.println("Propietario: " + familyRegistro.getPropietario());
        System.out.println("Placa: " + familyRegistro.getMatricula());
        System.out.println("Marca: " + familyRegistro.getMarca());
        System.out.println("Modelo: " + familyRegistro.getModelo());
        System.out.println("Fecha de registro: " + familyRegistro.getFecharegistro());
        System.out.println("-------------------------------------------------------");
        
        RegistroVehicular soyRegistro = new RegistroVehicular();
        // USAMOS SETTERS PARA INICIALIZAR LOS ATRIBUTOS
        soyRegistro.setPropietario("Carlos Garcia");
        soyRegistro.setMatricula("LMN456");
        soyRegistro.setMarca("Chevrolet");
        soyRegistro.setModelo("Sonic");
        soyRegistro.setFecharegistro("2024-03-10");
        // USAMOS LOS CONSTRUCTORES PARA INICIALIZAR LOS ATRIBUTOS
        System.out.println("Propietario: " + soyRegistro.getPropietario());
        System.out.println("Placa: " + soyRegistro.getMatricula());
        System.out.println("Marca: " + soyRegistro.getMarca());
        System.out.println("Modelo: " + soyRegistro.getModelo());
        System.out.println("Fecha de registro: " + soyRegistro.getFecharegistro());
        System.out.println("-------------------------------------------------------");

        RegistroVehicular rayoRegistro = new RegistroVehicular();
        // USAMOS SETTERS PARA INICIALIZAR LOS ATRIBUTOS
        rayoRegistro.setPropietario("Ana Torres");
        rayoRegistro.setMatricula("QRS321");
        rayoRegistro.setMarca("Ford");
        rayoRegistro.setModelo("Mustang");
        rayoRegistro.setFecharegistro("2024-04-20");
        // USAMOS LOS CONSTRUCTORES PARA INICIALIZAR LOS ATRIBUTOS
        System.out.println("Propietario: " + rayoRegistro.getPropietario());
        System.out.println("Placa: " + rayoRegistro.getMatricula());
        System.out.println("Marca: " + rayoRegistro.getMarca());
        System.out.println("Modelo: " + rayoRegistro.getModelo());
        System.out.println("Fecha de registro: " + rayoRegistro.getFecharegistro());
        System.out.println("-------------------------------------------------------");

        // -------------------------------------------------------//

        Sensor miSensor = new Sensor();
        // USAMOS SETTERS PARA INICIALIZAR LOS ATRIBUTOS
        miSensor.setVelocidad(null);
        miSensor.setTemperatura(null);
        miSensor.setPresion(null);
        miSensor.setNivelCombustible(null);
        miSensor.setEstadoMotor(null);
        miSensor.setEstadoNeumaticos(null);
        // USAMOS LOS CONSTRUCTORES PARA INICIALIZAR LOS ATRIBUTOS
        System.out.println("Velocidad: " + miSensor.getVelocidad());
        System.out.println("Temperatura: " + miSensor.getTemperatura());
        System.out.println("Presión: " + miSensor.getPresion());
        System.out.println("Nivel de combustible: " + miSensor.getNivelCombustible());
        System.out.println("Estado del motor: " + miSensor.getEstadoMotor());
        System.out.println("Estado de los neumáticos: " + miSensor.getEstadoNeumaticos());
        System.out.println("-------------------------------------------------------");

        Sensor familySensor = new Sensor();
        // USAMOS SETTERS PARA INICIALIZAR LOS ATRIBUTOS
        familySensor.setVelocidad(null);
        familySensor.setTemperatura(null);
        familySensor.setPresion(null);
        familySensor.setNivelCombustible(null); 
        familySensor.setEstadoMotor(null);
        familySensor.setEstadoNeumaticos(null);
        // USAMOS LOS CONSTRUCTORES PARA INICIALIZAR LOS ATRIBUTOS
        System.out.println("Velocidad: " + familySensor.getVelocidad());
        System.out.println("Temperatura: " + familySensor.getTemperatura());
        System.out.println("Presión: " + familySensor.getPresion());
        System.out.println("Nivel de combustible: " + familySensor.getNivelCombustible());
        System.out.println("Estado del motor: " + familySensor.getEstadoMotor());
        System.out.println("Estado de los neumáticos: " + familySensor.getEstadoNeumaticos());
        System.out.println("-------------------------------------------------------");

        Sensor soySensor = new Sensor();
        // USAMOS SETTERS PARA INICIALIZAR LOS ATRIBUTOS
        soySensor.setVelocidad(null);
        soySensor.setTemperatura(null);
        soySensor.setPresion(null);
        soySensor.setNivelCombustible(null);
        soySensor.setEstadoMotor(null);
        soySensor.setEstadoNeumaticos(null);
        // USAMOS LOS CONSTRUCTORES PARA INICIALIZAR LOS ATRIBUTOS
        System.out.println("Velocidad: " + soySensor.getVelocidad());
        System.out.println("Temperatura: " + soySensor.getTemperatura());
        System.out.println("Presión: " + soySensor.getPresion());
        System.out.println("Nivel de combustible: " + soySensor.getNivelCombustible());
        System.out.println("Estado del motor: " + soySensor.getEstadoMotor());
        System.out.println("Estado de los neumáticos: " + soySensor.getEstadoNeumaticos());
        System.out.println("-------------------------------------------------------");

        Sensor rayoSensor = new Sensor();
        // USAMOS SETTERS PARA INICIALIZAR LOS ATRIBUTOS
        rayoSensor.setVelocidad(null);
        rayoSensor.setTemperatura(null);
        rayoSensor.setPresion(null);
        rayoSensor.setNivelCombustible(null);
        rayoSensor.setEstadoMotor(null);
        rayoSensor.setEstadoNeumaticos(null);
        // USAMOS LOS CONSTRUCTORES PARA INICIALIZAR LOS ATRIBUTOS
        System.out.println("Velocidad: " + rayoSensor.getVelocidad());
        System.out.println("Temperatura: " + rayoSensor.getTemperatura());
        System.out.println("Presión: " + rayoSensor.getPresion());
        System.out.println("Nivel de combustible: " + rayoSensor.getNivelCombustible());
        System.out.println("Estado del motor: " + rayoSensor.getEstadoMotor());
        System.out.println("Estado de los neumáticos: " + rayoSensor.getEstadoNeumaticos());
        System.out.println("-------------------------------------------------------");

        // -------------------------------------------------------//

        SistemaElectrico miSistemaElectrico = new SistemaElectrico();
        // USAMOS SETTERS PARA INICIALIZAR LOS ATRIBUTOS
        miSistemaElectrico.setBateria("2");
        miSistemaElectrico.setLuces("LED");
        miSistemaElectrico.setSensores("4");
        miSistemaElectrico.setAlternador("1");
        // USAMOS LOS CONSTRUCTORES PARA INICIALIZAR LOS ATRIBUTOS
        System.out.println("Batería: " + miSistemaElectrico.getBateria());
        System.out.println("Luces: " + miSistemaElectrico.getLuces());
        System.out.println("Sensores: " + miSistemaElectrico.getSensores());
        System.out.println("Alternador: " + miSistemaElectrico.getAlternador());
        System.out.println("-------------------------------------------------------");


        SistemaElectrico familySistemaElectrico = new SistemaElectrico();
        // USAMOS SETTERS PARA INICIALIZAR LOS ATRIBUTOS
        familySistemaElectrico.setBateria("2");
        familySistemaElectrico.setLuces("LED");
        familySistemaElectrico.setSensores("4");
        familySistemaElectrico.setAlternador("1");
        // USAMOS LOS CONSTRUCTORES PARA INICIALIZAR LOS ATRIBUTOS
        System.out.println("Batería: " + familySistemaElectrico.getBateria());
        System.out.println("Luces: " + familySistemaElectrico.getLuces());
        System.out.println("Sensores: " + familySistemaElectrico.getSensores());
        System.out.println("Alternador: " + familySistemaElectrico.getAlternador());
        System.out.println("-------------------------------------------------------");

        SistemaElectrico soySistemaElectrico = new SistemaElectrico();
        // USAMOS SETTERS PARA INICIALIZAR LOS ATRIBUTOS
        soySistemaElectrico.setBateria("2");
        soySistemaElectrico.setLuces("LED");
        soySistemaElectrico.setSensores("4");
        soySistemaElectrico.setAlternador("1");
        // USAMOS LOS CONSTRUCTORES PARA INICIALIZAR LOS ATRIBUTOS
        System.out.println("Batería: " + soySistemaElectrico.getBateria());
        System.out.println("Luces: " + soySistemaElectrico.getLuces());
        System.out.println("Sensores: " + soySistemaElectrico.getSensores());
        System.out.println("Alternador: " + soySistemaElectrico.getAlternador());
        System.out.println("-------------------------------------------------------");

        SistemaElectrico rayoSistemaElectrico = new SistemaElectrico();
        // USAMOS SETTERS PARA INICIALIZAR LOS ATRIBUTOS
        rayoSistemaElectrico.setBateria("2");
        rayoSistemaElectrico.setLuces("LED");
        rayoSistemaElectrico.setSensores("4");
        rayoSistemaElectrico.setAlternador("1");
        // USAMOS LOS CONSTRUCTORES PARA INICIALIZAR LOS ATRIBUTOS
        System.out.println("Batería: " + rayoSistemaElectrico.getBateria());
        System.out.println("Luces: " + rayoSistemaElectrico.getLuces());
        System.out.println("Sensores: " + rayoSistemaElectrico.getSensores());
        System.out.println("Alternador: " + rayoSistemaElectrico.getAlternador());
        System.out.println("-------------------------------------------------------");

        // -------------------------------------------------------//

        SistemaFrenos miSistemaFrenos = new SistemaFrenos();
        // USAMOS SETTERS PARA INICIALIZAR LOS ATRIBUTOS
        miSistemaFrenos.setTipo("Discos");
        miSistemaFrenos.setDicos("4");
        miSistemaFrenos.setABS("Si");
        miSistemaFrenos.setTambor("No");
        miSistemaFrenos.setEstado("Bueno");
        // USAMOS LOS CONSTRUCTORES PARA INICIALIZAR LOS ATRIBUTOS
        System.out.println("Tipo: " + miSistemaFrenos.getTipo());
        System.out.println("Discos: " + miSistemaFrenos.getDicos());
        System.out.println("ABS: " + miSistemaFrenos.getABS());
        System.out.println("Tambor: " + miSistemaFrenos.getTambor());
        System.out.println("Estado: " + miSistemaFrenos.getEstado());
        System.out.println("-------------------------------------------------------");

        SistemaFrenos familySistemaFrenos = new SistemaFrenos();
        // USAMOS SETTERS PARA INICIALIZAR LOS ATRIBUTOS
        familySistemaFrenos.setTipo("Discos");
        familySistemaFrenos.setDicos("4");
        familySistemaFrenos.setABS("Si");
        familySistemaFrenos.setTambor("No");
        familySistemaFrenos.setEstado("Bueno");
        // USAMOS LOS CONSTRUCTORES PARA INICIALIZAR LOS ATRIBUTOS
        System.out.println("Tipo: " + familySistemaFrenos.getTipo());
        System.out.println("Discos: " + familySistemaFrenos.getDicos());
        System.out.println("ABS: " + familySistemaFrenos.getABS());
        System.out.println("Tambor: " + familySistemaFrenos.getTambor());
        System.out.println("Estado: " + familySistemaFrenos.getEstado());
        System.out.println("-------------------------------------------------------");

        SistemaFrenos soySistemaFrenos = new SistemaFrenos();
        // USAMOS SETTERS PARA INICIALIZAR LOS ATRIBUTOS
        soySistemaFrenos.setTipo("Discos");
        soySistemaFrenos.setDicos("4");
        soySistemaFrenos.setABS("Si");
        soySistemaFrenos.setTambor("No");
        soySistemaFrenos.setEstado("Bueno");
        // USAMOS LOS CONSTRUCTORES PARA INICIALIZAR LOS ATRIBUTOS
        System.out.println("Tipo: " + soySistemaFrenos.getTipo());
        System.out.println("Discos: " + soySistemaFrenos.getDicos());
        System.out.println("ABS: " + soySistemaFrenos.getABS());
        System.out.println("Tambor: " + soySistemaFrenos.getTambor());
        System.out.println("Estado: " + soySistemaFrenos.getEstado());
        System.out.println("-------------------------------------------------------");

        SistemaFrenos rayoSistemaFrenos = new SistemaFrenos();
        // USAMOS SETTERS PARA INICIALIZAR LOS ATRIBUTOS
        rayoSistemaFrenos.setTipo("Discos");
        rayoSistemaFrenos.setDicos("4");
        rayoSistemaFrenos.setABS("Si");
        rayoSistemaFrenos.setTambor("No");
        rayoSistemaFrenos.setEstado("Bueno");
        // USAMOS LOS CONSTRUCTORES PARA INICIALIZAR LOS ATRIBUTOS
        System.out.println("Tipo: " + rayoSistemaFrenos.getTipo());
        System.out.println("Discos: " + rayoSistemaFrenos.getDicos());
        System.out.println("ABS: " + rayoSistemaFrenos.getABS());
        System.out.println("Tambor: " + rayoSistemaFrenos.getTambor());
        System.out.println("Estado: " + rayoSistemaFrenos.getEstado());
        System.out.println("-------------------------------------------------------");

        // -------------------------------------------------------//

    Transmision miTransmision = new Transmision();
        // USAMOS SETTERS PARA INICIALIZAR LOS ATRIBUTOS
        miTransmision.setTipo("Manual");
        miTransmision.setMarchas("6");
        miTransmision.setTraccion("Toyota");
        miTransmision.setMarca("Toyota");
        miTransmision.setModelo("Corolla");
        miTransmision.setAño("2020");
        // USAMOS LOS CONSTRUCTORES PARA INICIALIZAR LOS ATRIBUTOS
        System.out.println("Tipo: " + miTransmision.getTipo());
        System.out.println("Número de marchas: " + miTransmision.getMarchas());
        System.out.println("Tracción: " + miTransmision.getTraccion());
        System.out.println("Marca: " + miTransmision.getMarca());
        System.out.println("Modelo: " + miTransmision.getModelo());
        System.out.println("Año: " + miTransmision.getAño());
        System.out.println("-------------------------------------------------------");

        Transmision familyTransmision = new Transmision();
        // USAMOS SETTERS PARA INICIALIZAR LOS ATRIBUTOS
        familyTransmision.setTipo("Automática");
        familyTransmision.setMarchas("8");
        familyTransmision.setTraccion("Honda");
        familyTransmision.setMarca("Honda");
        familyTransmision.setModelo("Civic");
        familyTransmision.setAño("2021");
        // USAMOS LOS CONSTRUCTORES PARA INICIALIZAR LOS ATRIBUTOS
        System.out.println("Tipo: " + familyTransmision.getTipo());
        System.out.println("Número de marchas: " + familyTransmision.getMarchas());
        System.out.println("Tracción: " + familyTransmision.getTraccion());
        System.out.println("Marca: " + familyTransmision.getMarca());
        System.out.println("Modelo: " + familyTransmision.getModelo());
        System.out.println("Año: " + familyTransmision.getAño());
        System.out.println("-------------------------------------------------------");

        Transmision soyTransmision = new Transmision();
        // USAMOS SETTERS PARA INICIALIZAR LOS ATRIBUTOS
        soyTransmision.setTipo("Manual");
        soyTransmision.setMarchas("5"); 
        soyTransmision.setTraccion("Chevrolet");
        soyTransmision.setMarca("Chevrolet");
        soyTransmision.setModelo("Sonic");
        soyTransmision.setAño("2019");
        // USAMOS LOS CONSTRUCTORES PARA INICIALIZAR LOS ATRIBUTOS
        System.out.println("Tipo: " + soyTransmision.getTipo());
        System.out.println("Número de marchas: " + soyTransmision.getMarchas());
        System.out.println("Tracción: " + soyTransmision.getTraccion());
        System.out.println("Marca: " + soyTransmision.getMarca());
        System.out.println("Modelo: " + soyTransmision.getModelo());
        System.out.println("Año: " + soyTransmision.getAño());
        System.out.println("-------------------------------------------------------");


        Transmision rayoTransmision = new Transmision();
        // USAMOS SETTERS PARA INICIALIZAR LOS ATRIBUTOS
        rayoTransmision.setTipo("Automática");
        rayoTransmision.setMarchas("7");
        rayoTransmision.setTraccion("Ford");
        rayoTransmision.setMarca("Ford");
        rayoTransmision.setModelo("Mustang");
        rayoTransmision.setAño("2022");
        // USAMOS LOS CONSTRUCTORES PARA INICIALIZAR LOS ATRIBUTOS
        System.out.println("Tipo: " + rayoTransmision.getTipo());
        System.out.println("Número de marchas: " + rayoTransmision.getMarchas());
        System.out.println("Tracción: " + rayoTransmision.getTraccion());
        System.out.println("Marca: " + rayoTransmision.getMarca());
        System.out.println("Modelo: " + rayoTransmision.getModelo());
        System.out.println("Año: " + rayoTransmision.getAño());
        System.out.println("-------------------------------------------------------");
        
        // -------------------------------------------------------//
        Vehiculo miVehiculo = new Vehiculo();
        // USAMOS SETTERS PARA INICIALIZAR LOS ATRIBUTOS
        miVehiculo.setIdentificacion(null);
        miVehiculo.setMarca("Toyota");
        miVehiculo.setModelo("Corolla");
        miVehiculo.setMatricula(null);
        miVehiculo.setColor(null);
        miVehiculo.setPropietario(null);
        // USAMOS LOS CONSTRUCTORES PARA INICIALIZAR LOS ATRIBUTOS
        System.out.println("Identificación: " + miVehiculo.getIdentificacion());
        System.out.println("Marca: " + miVehiculo.getMarca());
        System.out.println("Modelo: " + miVehiculo.getModelo());    
        System.out.println("Placa: " + miVehiculo.getMatricula());
        System.out.println("Color: " + miVehiculo.getColor());
        System.out.println("Propietario: " + miVehiculo.getPropietario());
        System.out.println("-------------------------------------------------------");

        Vehiculo familyVehiculo = new Vehiculo();
        // USAMOS SETTERS PARA INICIALIZAR LOS ATRIBUTOS
        familyVehiculo.setIdentificacion(null);
        familyVehiculo.setMarca("Honda");
        familyVehiculo.setModelo("Civic");
        familyVehiculo.setMatricula(null);
        familyVehiculo.setColor(null);
        familyVehiculo.setPropietario(null);
        // USAMOS LOS CONSTRUCTORES PARA INICIALIZAR LOS ATRIBUTOS
        System.out.println("Identificación: " + familyVehiculo.getIdentificacion());
        System.out.println("Marca: " + familyVehiculo.getMarca());
        System.out.println("Modelo: " + familyVehiculo.getModelo());
        System.out.println("Placa: " + familyVehiculo.getMatricula());
        System.out.println("Color: " + familyVehiculo.getColor());
        System.out.println("Propietario: " + familyVehiculo.getPropietario());
        System.out.println("-------------------------------------------------------");

        Vehiculo soyVehiculo = new Vehiculo();
        // USAMOS SETTERS PARA INICIALIZAR LOS ATRIBUTOS
        soyVehiculo.setIdentificacion(null);
        soyVehiculo.setMarca("Chevrolet");
        soyVehiculo.setModelo("Sonic");
        soyVehiculo.setMatricula(null);
        soyVehiculo.setColor(null);
        soyVehiculo.setPropietario(null);
        // USAMOS LOS CONSTRUCTORES PARA INICIALIZAR LOS ATRIBUTOS
        System.out.println("Identificación: " + soyVehiculo.getIdentificacion());
        System.out.println("Marca: " + soyVehiculo.getMarca());
        System.out.println("Modelo: " + soyVehiculo.getModelo());
        System.out.println("Placa: " + soyVehiculo.getMatricula());
        System.out.println("Color: " + soyVehiculo.getColor());
        System.out.println("Propietario: " + soyVehiculo.getPropietario());
        System.out.println("-------------------------------------------------------");

        Vehiculo rayoVehiculo = new Vehiculo();
        // USAMOS SETTERS PARA INICIALIZAR LOS ATRIBUTOS
        rayoVehiculo.setIdentificacion(null);
        rayoVehiculo.setMarca("Ford");
        rayoVehiculo.setModelo("Mustang");
        rayoVehiculo.setMatricula(null);
        rayoVehiculo.setColor(null);
        rayoVehiculo.setPropietario(null);
        // USAMOS LOS CONSTRUCTORES PARA INICIALIZAR LOS ATRIBUTOS
        System.out.println("Identificación: " + rayoVehiculo.getIdentificacion());
        System.out.println("Marca: " + rayoVehiculo.getMarca());
        System.out.println("Modelo: " + rayoVehiculo.getModelo());
        System.out.println("Placa: " + rayoVehiculo.getMatricula());
        System.out.println("Color: " + rayoVehiculo.getColor());
        System.out.println("Propietario: " + rayoVehiculo.getPropietario());
        System.out.println("-------------------------------------------------------");

        // -------------------------------------------------------//



















        
        


    }
}
