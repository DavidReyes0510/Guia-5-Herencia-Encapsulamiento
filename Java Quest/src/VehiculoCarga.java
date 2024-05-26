public class VehiculoCarga extends Vehiculo {
    private int capacidadCarga;

    //Constructor 
    public VehiculoCarga(String marca, String modelo, int año, int kilometraje, int capacidadCarga) {
        super(marca, modelo, año, kilometraje);
        this.capacidadCarga = capacidadCarga;
    }

    //Getters y Setters
    public int getCapacidadCarga() {
        return capacidadCarga;
    }
    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }   

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Capacidad de carga: " +capacidadCarga+ "kg");
    }

}
