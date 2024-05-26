public class Vehiculo {

    private String marca;
    private String modelo;
    private int año;
    private int kilometraje;

    //constructor
    public Vehiculo(String marca, String modelo, int año, int kilometraje){
     this.marca = marca;
     this.modelo = modelo;
     this.año = año;
     this.kilometraje = kilometraje;
    }

    //Getter setter
    public String getmarca(){
        return marca;
    }
  
    public void setmarca(String marca){
        this.marca = marca;
    }

    public String getmodelo(){
        return modelo;
    }

    public void setmodelo(String modelo){
        this.modelo = modelo;
    }
    
    public int getaño(){
        return año;
    }
    
    public void setaño(int año){
        this.año = año;
    }
    
    public int getkilometraje(){
        return kilometraje;
    }
    
    public void setkilometraje(int kilometraje){

        this.kilometraje = kilometraje;
    }

    //Mostrar info del vehiculo 
    public void mostrarInfo(){
        System.out.println("Marca"+ marca);
        System.out.println("Modelo"+modelo);
        System.out.println("Año"+año);
        System.out.println("Kilometraje"+kilometraje);
    }   
    public void realizarMantenimiento() {}
    
}

