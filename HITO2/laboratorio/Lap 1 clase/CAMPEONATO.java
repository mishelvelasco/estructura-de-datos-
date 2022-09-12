package campeonato;

public class CAMPEONATO {
    private String nombreCampeonato;
    private EQUIPO[]equipos;
    public CAMPEONATO(String nombreCampeonato,EQUIPO[]equipos){
        this.nombreCampeonato=nombreCampeonato;
        this.equipos=equipos;
    }

    public String getNombreCampeonato() {
        return this.nombreCampeonato;
    }

    public EQUIPO[] getEquipos() {
        return this.equipos;
    }

    public void setNombreCampeonato(String nuevoCampeonato) {
        this.nombreCampeonato = nuevoCampeonato;
    }

    public void setEquipos(EQUIPO[] nuevoEquipos) {
        this.equipos = nuevoEquipos;
    }
    public void mostrarCampeonato(){
        System.out.println("\nmostrando datos del campeonato");
        System.out.println("nombre del campeonato: " + this.getNombreCampeonato());
        for(int i =0; i<this.getEquipos().length; i++ ){
            this.getEquipos()
                    [i].mostrarEquipo();
        }
    }
}
