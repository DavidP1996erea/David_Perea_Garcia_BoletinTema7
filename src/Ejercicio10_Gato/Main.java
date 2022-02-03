package Ejercicio10_Gato;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        Gato gato1 = new Gato();
        Gato gato2 = new Gato();



        System.out.println("Introduce el nombre del primer gato");
        gato1.setNombre(sc.nextLine());
        System.out.println("Introduce el nombre del segundo gato");
        gato2.setNombre(sc.nextLine());
        System.out.println("Introduce la edad del primer gato");
        gato1.setEdad(sc.nextInt());
        System.out.println("Introduce la edad del segundo gato");
        gato2.setEdad(sc.nextInt());



        if(gato1.compareTo(gato2)==0){

            System.out.println("Ambos gatos tienen la misma edad");
        }else if(gato1.compareTo(gato2)>0){

            System.out.println("El primer gato es mayor");
        }else{

            System.out.println("El segundo gato es mayor");
        }


        gato1.compareToNombre(gato2);


    }
}
