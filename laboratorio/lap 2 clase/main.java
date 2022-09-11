package campeonato;

public class main {
    public static void main(String[] args){
        System.out.println("Programa jugador");
        jugador j1= new jugador("pepe","perez","123456lp",28);
        //j1.mostrarJugador();
        jugador j2= new jugador("jose","mamani","14567lp",25);
        //j2.mostrarJugador();
        jugador[]jugadores=new jugador[2];
        jugadores[0]=j1;
        jugadores[1]=j2;
       EQUIPO eq1=new EQUIPO("club banana","varones",jugadores);
       EQUIPO[]equipos=new EQUIPO[1];
       equipos[0]=eq1;
       //eq1.mostrarEquipo();
        CAMPEONATO cam1=new CAMPEONATO("RELAMPAGO",equipos);
        cam1.mostrarCampeonato();
    }
}
