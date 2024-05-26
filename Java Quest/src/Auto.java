
public class Auto extends VehiculoPasajeros{
    private String tipocombustible;

    public Auto(String marca, String modelo, int año, int kilometraje, int numpasajeros, String tipocombustible) {
        super(marca, modelo, año, kilometraje, numpasajeros);
        this.tipocombustible = tipocombustible;
    }

    public String gettipocombustible(){
        return tipocombustible;

    }


    //Mostrarinfo
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Tipo de combustible: "+tipocombustible);
    }

    // Mantenimiento/costo
    @Override
    public void realizarMantenimiento() {
        System.out.println("Realizando mantenimiento básico del vehículo, chequeo de asientos y revisión del motor.");
    }

    public double calcularCostoMantenimiento(double costoPorKm, int kmRecorridos) {
        return costoPorKm * kmRecorridos;
    }
}

    

