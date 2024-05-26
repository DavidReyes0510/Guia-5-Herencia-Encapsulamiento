public class App {
    public static void main(String[] args) throws Exception {

        //Creando instancias para cada vehiculo...
        Auto auto = new Auto(" Koenigsegg", " Agera RS",  2015,  20000,  2,  "Gasolina");

        Camion camion = new Camion(" Volvo"," FH" , 2019, 100000, 30000, 4);


        //Info de los vehiculos + mantenimiento + costo de mantenimiento
        System.out.println("Información del Hypercar:");
        auto.mostrarInfo();
        auto.realizarMantenimiento();
        System.out.println("Costo de mantenimiento del Hypercar: "+"$"+ auto.calcularCostoMantenimiento(0.8, 20000));

        System.out.println("\nInformación del Camion:");
        camion.mostrarInfo();
        camion.realizarMantenimiento();
        System.out.println("Costo de mantenimiento del Camion: "+ "$" + camion.calcularCostoMantenimiento(0.5, 10000));

    }

}





    

