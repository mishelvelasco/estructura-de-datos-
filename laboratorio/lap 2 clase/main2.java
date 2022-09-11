package campeonato;

import java.util.Scanner;

public class main2 {
    public static void main(String[]args){
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese datos del jugador");
        String nombre1,apellido1,ci1 ;int edad1;
        System.out.println("Ingrese nombre del jugador: ");
        nombre1=leer.next();
        System.out.println("Ingrese apellido del jugador: ");
        apellido1=leer.next();
        System.out.println(" ingrese CI del jugador: ");
        ci1=leer.next();
        System.out.println(" ingrese lain edad del jugador: ");
        edad1=leer.nextInt();
        //jugador jug1 = new jugador(nombre1,apellido1,ci1,edad1);
        //jug1.mostrarJugador();
        jugador jug1 = new jugador();
        jug1.setNombre(nombre1);
        jug1.setApellidos(apellido1);
        jug1.setCi(ci1);
        jug1.setEdad(edad1);
        jug1.mostrarJugador();

        String nombreCompleto2, apellido2 , ci2;
        int edad2;

        System.out.print("Ingrese nombre del jugador 2: ");
        nombreCompleto2= leer.next();
        System.out.print("Ingrese apellido del jugador 2: ");
        apellido2= leer.next();
        System.out.print("Ingrese CI del jugador 2: ");
        ci2= leer.next();
        System.out.print("Ingrese la edad del jugador 2: ");
        edad2= leer.nextInt();

        jugador jug2=new jugador ();
        jug2.setNombre(nombreCompleto2);
        jug2.setApellidos(apellido2);
        jug2.setCi(ci2);
        jug2.setEdad(edad2);
        jug2.mostrarJugador();
    }
}
