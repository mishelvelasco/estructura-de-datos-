package campeonato;

public class jugador {
    private String nombre;
    private String apellidos;
    private String ci;
    private int edad;
    public jugador (String nombre,String apellidos,String ci, int edad){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.ci=ci;
        this.edad=edad;
    }
    //determinar que esta empezando de cero los parametros
    public jugador()
    {
        this.nombre="";
        this.apellidos="";
        this.ci="";
        this.edad=0;
    }
    public String getNombre() {
        return this.nombre;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public String getCi() {
        return this.ci;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    public void setApellidos(String nuevoApellidos) {
        this.apellidos = nuevoApellidos;
    }

    public void setCi(String nuevoCi) {
        this.ci = nuevoCi;
    }

    public void setEdad(int nuevaEdad) {
        this.edad = nuevaEdad;
    }
    public void mostrarJugador(){
        System.out.println("\nMostrando datos del jugador");
        System.out.println("nombre del jugador: " + this.getNombre());
        System.out.println("apellidio del jugador: " + this.getApellidos());
        System.out.println("CI del jugador: " + this.getCi());
        System.out.println("edad del jugador: " + this.getEdad());
    }
}
