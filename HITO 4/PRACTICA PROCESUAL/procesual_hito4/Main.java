package procesual_hito4;

public class Main {
    public static void main(String[] args) {
        Cliente cli1 = new Cliente("iris", "velasco", 20, "bolivia", "femenino", "vip");
        Cliente cli2 = new Cliente("jorge", "mamani", 30, "argentina", "masculino", "sirver");
        Cliente cli3 = new Cliente("ilia", "laura", 65, "bolivia", "femenino", "vip");
        Cliente cli4 = new Cliente("marcos", "calle", 30, "bolivia", "masculino", "sirver");
        Cliente cli5 = new Cliente("leila", "velasquez", 40, "bolivia", "femenino", "gold");
        ColaCliente cola = new ColaCliente(100);
        cola.adicionar(cli1);
        cola.adicionar(cli2);
        cola.adicionar(cli3);
        cola.adicionar(cli4);
        cola.adicionar(cli5);

        Cliente cli6 = new Cliente("lulu", "velasco", 20, "bolivia", "femenino", "vip");
        Cliente cli7 = new Cliente("saul", "mamani", 30, "argentina", "masculino", "sirver");
        Cliente cli8 = new Cliente("patito", "laura", 65, "bolivia", "femenino", "vip");
        Cliente cli9 = new Cliente("patricio", "calle", 30, "bolivia", "masculino", "sirver");
        Cliente cli10 = new Cliente("julio", "velasquez", 40, "bolivia", "femenino", "gold");
        ColaCliente cola2 = new ColaCliente(100);
        cola.adicionar(cli6);
        cola.adicionar(cli7);
        cola.adicionar(cli8);
        cola.adicionar(cli9);
        cola.adicionar(cli10);

        //cola.mostrar();
        //asignaVip(cola, "vip");
        //MoverClientesMayores(cola, 60);
        Cambiarcolaclientes(cola,cola2, "Saul");
    }

    static void asignaVip(ColaCliente cola, String NuevoTipo) {
        ColaCliente aux = new ColaCliente(10);
        Cliente valor = null;
        while (!cola.esVacia()) {
            valor = cola.eliminar();
            if (valor.getPais() == "bolivia" && valor.getTipo() == "gold") {
                valor.setTipo(NuevoTipo);
                aux.adicionar(valor);
            } else {
                aux.adicionar(valor);
            }
        }
        cola.vaciar(aux);
        cola.adicionar(valor);
        cola.mostrar();
    }
    //Determinar cuantos clientes son mayores a 60 años
    public  static  void  MoverClientesMayores ( ColaCliente  cola , int  edadMayor ) {
        ColaCliente  aux = new  ColaCliente ( 100 );
        ColaCliente  aux2 = new ColaCliente ( 100 );
        Cliente  Valorextraido = null ;
        while (! cola.esVacia ()) {
            Valorextraido = cola.eliminar ();
            if ( Valorextraido.getEdad () >= edadMayor ) {
                aux2.adicionar (Valorextraido);
            }
            aux.adicionar (Valorextraido);
        }
        cola.vaciar (aux2);
        cola.vaciar (aux);
        cola.mostrar ();
    }
    public  static  void  Cambiarcolaclientes ( ColaCliente  colaA , ColaCliente  colaB , String  Nombre ) {
        int  nroElemColaA = colaA.nroElem ();
        int  nroElemColaB = colaB.nroElem ();
        ColaCliente  aux = new ColaCliente ( 100 );
        ColaCliente  aux2 = new  ColaCliente ( 100 );
        Cliente  valorEliminado = null ;
        for ( int  i = 1 ; i <= nroElemColaA ; i ++) {
            valorEliminado = colaA.eliminar ();
            if ( valorEliminado.getNombres().equals(Nombre)) {
                colaB.adicionar ( valorEliminado );
            } else  {
                colaA.adicionar ( valorEliminado );
            }
        }
        for ( int  i = 1 ; i <= nroElemColaB ; i ++) {
            valorEliminado = colaB.eliminar ();
            if ( valorEliminado.getNombres () .equals ( Nombre )) {
                colaB.adicionar ( valorEliminado );
            } else {
                aux2.adicionar ( valorEliminado );
            }
        }
        colaA.vaciar ( aux );
        colaB.vaciar ( aux2 );
        colaA.mostrar ();
        colaB.mostrar ();
    }
}

