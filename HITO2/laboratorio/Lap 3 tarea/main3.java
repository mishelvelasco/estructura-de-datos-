package campeonato;

import java.util.Scanner;

public class main3 {
    public static void main(String[] args) {
        System.out.println("main3");

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese Datos del Jugador y del equipo");
        String nombreCompleto, apellido, ci;
        int edad;
        String nombreEquipo, categoria;
        EQUIPO[] equipos = new EQUIPO[2];
        for (int j = 0; j < 2; j = j + 1) {
            System.out.println("Ingrese el nombre del equipo " + (j + 1) + ": ");
            nombreEquipo = leer.next();
            System.out.println("Ingrese la categoria del equipo " + (j + 1) + ": ");
            categoria = leer.next();
            jugador[] jugadores = new jugador[1];
            for (int i = 0; i < 1; i++) {

                System.out.print("Ingrese nombre del jugador: " + (i + 1) + ": ");
                nombreCompleto = leer.next();
                System.out.print("Ingrese apellido del jugador: " + (i + 1) + ": ");
                apellido = leer.next();
                System.out.print("Ingrese CI del jugador: " + (i + 1) + ": ");
                ci = leer.next();
                System.out.print("Ingrese la edad del jugador: " + (i + 1) + ": ");
                edad = leer.nextInt();

                jugador jug = new jugador();
                jug.setNombre(nombreCompleto);
                jug.setApellidos(apellido);
                jug.setCi(ci);
                jug.setEdad(edad);
                //jug.mostrarJugador();
                jugadores[i] = jug;
            }
            EQUIPO Eq = new EQUIPO();
            Eq.setNombreEquipo(nombreEquipo);
            Eq.setCategoria(categoria);
            Eq.setJugadores(jugadores);
            //
            equipos[j] = Eq;
        }
        CAMPEONATO Camp1 = new CAMPEONATO("UNIFRANZITOS", equipos);
        Camp1.mostrarCampeonato();

    }
}
