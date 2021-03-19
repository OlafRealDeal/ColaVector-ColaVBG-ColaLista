package Negocio;

/**
 *
 * @author Olaf
 */
public class Nodo {

    int dato;
    Nodo enlace;

    public Nodo() {
        enlace = null;
    }

    public Nodo(int Dato, Nodo enlace) {
        this.dato = Dato;
        this.enlace = enlace;
    }

    public void setDato(int Dato) {
        this.dato = Dato;
    }

    public void setEnlace(Nodo Enlace) {
        this.enlace = Enlace;
    }
public int getDato(){
    return(dato);
}
public Nodo getEnlace(){
    return (enlace);
}

    @Override
    public String toString() {
       String S="";
      S=S+dato;
        return (S);
    }

}
