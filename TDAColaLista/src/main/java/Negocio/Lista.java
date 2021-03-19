package Negocio;

/**
 *
 * @author Olaf
 */
public class Lista {

    Nodo L;
    int cant;

    public Lista() {
        this.L = null;
        this.cant = 0;
    }

    public boolean Vacia() {

        return (L == null);
    }

    public void Insertar(int ele) {
        if (Vacia()) { //CASO BASE
            Nodo P = new Nodo();
            P.setDato(ele);
            L = P;
            cant++;
        } else { //CASO GENERAL
            Nodo aux = L;
            Nodo ant = null;
            while ((aux != null) && (aux.getDato() <= ele)) {
                ant = aux;
                aux = aux.getEnlace();
            }
            if (ant == null) { //INSERTA EN LA CABEZA
                Nodo P = new Nodo();
                P.setDato(ele);
                P.setEnlace(L);
                L = P;
                cant++;
            } else { //INSERTA EN EL CUERPO
                if (ant.getDato() != ele) {
                    Nodo P = new Nodo();
                    P.setDato(ele);
                    ant.setEnlace(P);
                    P.setEnlace(aux);
                    cant++;
                }

            }
        }

    }

    public void Eliminar(int ele) {
        if (Vacia()) {
            System.out.println("Error lista Vacia");
            System.exit(1);
        } else {
            Nodo aux = L;
            Nodo ant = null;
            while ((aux != null) && (aux.getDato() != ele)) {
                ant = aux;
                aux = aux.getEnlace();
            }
            if (ant == null) { //ELIMINA LA CABEZA             
                L = L.getEnlace();
                cant--;
            } else { //ELIMINA EL CUERPO
                if (aux != null) {
                    ant.setEnlace(aux.getEnlace());
                    cant--;
                }

            }

        }

    }

    public int Sacar(int pos) {
        Nodo aux = L;
        for (int i = 1; i < pos; i++) {
            aux = aux.getEnlace();
        }
        return aux.getDato();
    }

    @Override
    public String toString() {
        String s = " L = < ";
        Nodo aux = L;
        while (aux != null) {
            s = s + aux.getDato() + " , ";
            aux = aux.getEnlace();
        }
        s = s + " > ";
        return (s);
    }

}
