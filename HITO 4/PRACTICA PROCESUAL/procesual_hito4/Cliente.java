package procesual_hito4;
public class Cliente {

    private String Nombres;
    private String Apellidos;
    private int Edad;
    private String pais;
    private String Genero;
    private String tipo;

    public Cliente(String Nombres, String Apellidos, int Edad, String pais, String Genero,String tipo) {
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Edad = Edad;
        this.pais = pais;
        this.Genero = Genero;
        this.tipo=tipo;
    }

    public String getNombres() {
        return Nombres;
    }
    public String getApellidos() {
        return Apellidos;
    }
    public int getEdad() {
        return Edad;
    }
    public String getDireccion() {
        return pais;
    }
    public String getGenero() {
        return Genero;
    }

    public String getPais() {
        return pais;
    }

    public String getTipo() {
        return tipo;
    }
    public void setNombres(String nombres) {
        Nombres = nombres;
    }
    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }
    public void setEdad(int edad) {
        Edad = edad;
    }
    public void setDireccion(String direccion) {
        pais= direccion;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void mostrarCliente() {
        System.out.println("\nMostrando datos del jugador");
        System.out.println("Nombre: " + this.getNombres());
        System.out.println("Apellidos: " + this.getApellidos());
        System.out.println("Edad: " + this.getEdad());
        System.out.println("Direccion: " + this.getDireccion());
        System.out.println("Genero: " + this.getGenero());
        System.out.println("tipo: " + this.getTipo());

        System.out.println("\n");
    }
}
