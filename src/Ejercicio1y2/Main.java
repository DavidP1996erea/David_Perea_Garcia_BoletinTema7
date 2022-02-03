package Ejercicio1y2;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner sc = new Scanner(System.in);

        String matricula;
        Marcas marca;


        Vehiculo coche1 = new Vehiculo();


        System.out.println("Introduzca la matricula");
        matricula=sc.nextLine();

        try {

            System.out.println("Introduzca la marca");
            marca = Marcas.valueOf(sc.next().toUpperCase(Locale.ROOT));
            coche1.setMarcaVehiculoStrig(marca);

        }catch (IllegalArgumentException e){

            System.out.println("La marca no está registrada en nuestra base de datos.");


        }


        coche1.setMatricula(matricula);

    if(coche1.getMarcaVehiculo()!=null) {
        System.out.println("La matricula es " + coche1.getMatricula());
        System.out.println("La marca es " + coche1.getMarcaVehiculo());
    }else {
        System.out.println("Datos incorrectos.");
    }


    }
}