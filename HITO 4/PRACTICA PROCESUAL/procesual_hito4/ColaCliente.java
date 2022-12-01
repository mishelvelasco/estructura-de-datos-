package procesual_hito4;

public class ColaCliente {
    private int max;
    private int fin;
    private int ini;
    private Cliente [] clientes;

    public ColaCliente (int max) {
        this.max = max;
        this.clientes = new Cliente[this.max + 1];
        this.ini = 0;
        this.fin = 0;
    }

    public boolean esVacia() {
        if (this.ini == 0 & this.fin == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean esLlena() {
        if (this.fin == this.max) {
            return true;
        } else {
            return false;
        }
    }

    public int nroElem() {
        return fin - ini;
    }

    public void adicionar(Cliente nuevoCliente) {
        if (!esLlena()) {
            fin++;
            clientes[fin] = nuevoCliente;
        } else {
            System.out.println("Cola de numeros llena");
        }
    }
    public Cliente eliminar() {
        Cliente elementoEliminado = null;
        if (!esVacia()) {
            this.ini++;
            elementoEliminado = this.clientes[ini];
            if (ini == fin) {
                ini = 0;
                fin = 0;
            }
            return elementoEliminado;
        } else {
            System.out.println("Cola de numeros vacia");
        }
        return elementoEliminado;
    }
    public void mostrar () {
        Cliente elem = null;
        if (esVacia())
            System.out.println("Pila Vacia");
        else {
            System.out.println("\nDatos de la Pila de clientes");
            ColaCliente aux = new ColaCliente(this.max);
            while (!esVacia()) {
                elem = this.eliminar();
                aux.adicionar (elem);
                elem.mostrarCliente();
            }
            vaciar(aux);
        }

    }
    public void vaciar (ColaCliente pila) {
        while (!pila.esVacia())
            adicionar(pila.eliminar());
    }
}
