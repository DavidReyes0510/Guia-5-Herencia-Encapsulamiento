public class Camion extends VehiculoCarga{
    private int numejes;

    //constructor
    public Camion(String marca, String modelo, int año, int kilometraje, int capacidadCarga, int numejes) {
        super(marca, modelo, año, kilometraje, capacidadCarga);
        this.numejes = numejes;
    }
    //getters y setters
    public int getNumejes() {
        return numejes;
    }
    public void setNumejes(int numejes) {
        this.numejes = numejes;
    }
    //Sobreescribir
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Número de ejes: " +numejes);
    }
    //Mantenimiento/costo 
    @Override
    public void realizarMantenimiento() {
        System.out.println("Realizando mantenimiento básico del camión: revisión de sistema de frenos, suspensiones y ejes.");
    }

    public double calcularCostoMantenimiento(double costoPorKm, int kmRecorridos) {
        return costoPorKm * kmRecorridos;
    }
}

