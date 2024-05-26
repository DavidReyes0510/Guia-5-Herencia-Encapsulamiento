public class VehiculoPasajeros extends Vehiculo {
    private int numpasajeros;

    public VehiculoPasajeros(String marca, String modelo, int año, int kilometraje, int numpasajeros) {
        super(marca, modelo, año, kilometraje);
        this.numpasajeros = numpasajeros;
    }
    //Getter Setter
    public int getnumpasajeros() {
        return numpasajeros;
    }

    public void setnumpasajeros(int numpasajeros) {
        this.numpasajeros = numpasajeros;
    }
    //Sobreescribir el metodo mostrarinfo()
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Numero de pasajeros: " + numpasajeros);
    }
    

}
