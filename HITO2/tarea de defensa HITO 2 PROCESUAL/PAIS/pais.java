package PAIS;
public class pais {
    private String nombrePais;
    private int noDepartamentos;
    private Departamento[] departamentos;

    public pais(String nombrePais,int noDepartamentos, Departamento[] departamentos) {
        this.nombrePais = nombrePais;
        this.noDepartamentos = noDepartamentos;
        this.departamentos = departamentos;
    }

    public String getNombrePais() {
        return this.nombrePais;
    }
    public Departamento[] getDepartamentos() {
        return this.departamentos;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    public void setDepartamentos(Departamento[] departamentos) {
        this.departamentos = departamentos;
    }
    public void mostrarPais() {
        System.out.println("\nMOSTRANDO DATOS DEL PAIS");
        System.out.println("Nombre Pais: " + this.getNombrePais());
        for (int i = 0; i < this.noDepartamentos; i++) {
            this.getDepartamentos()[i].mostrarDepartamento();
        }
    }
}
