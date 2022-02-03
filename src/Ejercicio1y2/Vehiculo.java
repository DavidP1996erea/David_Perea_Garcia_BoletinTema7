package Ejercicio1y2;

enum Marcas{

    BMW, MERCEDES, AVENSIS, TOYOTA, SEAT, NISSAN, AUDI;

}

public class Vehiculo {

    private String Matricula;
    private Marcas MarcaVehiculo;

    public Vehiculo(){

    }

    public Vehiculo(String Matricula, Marcas MarcaVehiculo){

        this.Matricula=Matricula;
        this.MarcaVehiculo=MarcaVehiculo;

    }



    public Marcas getMarcaVehiculo(){

        return MarcaVehiculo;

    }

    public void setMarcaVehiculo(Marcas marcaVehiculo){

        MarcaVehiculo=marcaVehiculo;


    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String matricula) {
        Matricula = matricula;
    }

    public Marcas getMarcaVehiculoString() {
        return MarcaVehiculo;
    }

    public void setMarcaVehiculoStrig(Marcas marcaVehiculo) {
        MarcaVehiculo = marcaVehiculo;
    }
}