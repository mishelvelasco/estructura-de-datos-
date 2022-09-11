package campeonato;

public class EQUIPO {
    private String nombreEquipo;
    private String categoria;
    private jugador[]jugadores;
     public EQUIPO(String nombreEquipo, String categoria, jugador[]jugadores){
         this.nombreEquipo=nombreEquipo;
         this.categoria=categoria;
         this.jugadores=jugadores;
     }
     public EQUIPO(){}
    public String getNombreEquipo() {
        return this.nombreEquipo;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public jugador[] getJugadores() {
        return this.jugadores;
    }

    public void setNombreEquipo(String nuevoNombreEquipo) {
        this.nombreEquipo = nuevoNombreEquipo;
    }

    public void setCategoria(String nuevaCategoria) {
        this.categoria = nuevaCategoria;
    }

    public void setJugadores(jugador[] nuevosJugadores) {
        this.jugadores = nuevosJugadores;
    }
    public void  mostrarEquipo(){
         System.out.println("\nMostrar datos del equipo");
         System.out.println("nombre del equipo: " + this.getNombreEquipo());
         System.out.println("categoria del equipo: " + this.getCategoria());
      for(int i =0; i<this.getJugadores().length; i++ ){
          this.getJugadores()
               [i].mostrarJugador();
      }
    }
}
