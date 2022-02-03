package Ejercicio9_Persona;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        // write your code here
        Scanner sc = new Scanner(System.in);
        PesoAlturaC pesoPersona1 = new PesoAlturaC();
        PersonaC primeraPersona = new PersonaC();




        primeraPersona.setPesoAlturaC(pesoPersona1);


        System.out.println("Introduzca el nombre");
        primeraPersona.setNombre(sc.nextLine());
        System.out.println("Introduzca el dni");
        primeraPersona.setDNI(sc.nextLine());
        System.out.println("Introduzca la edad");
        primeraPersona.setEdad(sc.nextInt());
        System.out.println("Introduzca la altura");
        primeraPersona.pesoAlturaC.setAltura(sc.nextDouble());
        System.out.println("Introduzca el peso");
        primeraPersona.pesoAlturaC.setPeso(sc.nextDouble());




        PersonaC copiaPrimeraPersona = primeraPersona.clone();

        System.out.println("La altura es: " + copiaPrimeraPersona.pesoAlturaC.getAltura());
        System.out.println("El nombre es: " + copiaPrimeraPersona.getNombre());




    }
}