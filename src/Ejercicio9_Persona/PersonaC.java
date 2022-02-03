package Ejercicio9_Persona;

public class PersonaC implements Cloneable{
    private String nombre;
    private int edad;
    private String DNI;
    PesoAlturaC pesoAlturaC;


    public PersonaC(){

    }


    public PersonaC(int edad, String nombre, String dni, PesoAlturaC pesoAlturaC){
        this.edad=edad;
        this.nombre=nombre;
        this.DNI=dni;
        this.pesoAlturaC=pesoAlturaC;
    }

    protected PersonaC clone() throws CloneNotSupportedException {
        PersonaC clown = new PersonaC(edad, nombre, DNI, pesoAlturaC );
        return clown;
    }




    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public PesoAlturaC getPesoAlturaC() {
        return pesoAlturaC;
    }

    public void setPesoAlturaC(PesoAlturaC pesoAlturaC) {
        this.pesoAlturaC = pesoAlturaC;
    }
}
