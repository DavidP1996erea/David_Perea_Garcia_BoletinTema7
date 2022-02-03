package Ejercicio10_Gato;

public class Gato implements Comparable <Gato> {

    private String nombre;
    private String color;
    private String raza;
    private int edad;

    public Gato(){

    }


    public int compareTo(Gato gato){
        int resultado;

        if(this.edad== gato.getEdad()){
            resultado=0;
        }else if(this.edad>gato.getEdad()){
            resultado=1;

        }else{
            resultado=-1;
        }

        return resultado;
    }


    public void compareToNombre(Gato gato){


        if(this.nombre.compareTo(gato.getNombre())==0){
            System.out.println("Los dos gatos tienen nombres equitativos");
        }else if(this.nombre.compareTo(gato.getNombre())>0){
            System.out.println("El primer gato tiene un nombre con más calidad léxica");

        }else{
            System.out.println("El segundo gato tiene un nombre con más calidad léxica");
        }


    }






    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
