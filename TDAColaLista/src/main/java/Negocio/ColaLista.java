package Negocio;


/**
 *
 * @author Olaf
 */
public class ColaLista {
      Nodo frente;
      Nodo atras;
      int cant;
    public ColaLista(){
        frente = null;
        atras = null;
        cant = 0;
    }    
    public boolean Vacia(){
        return (frente ==null);
    }
    public void Encolar(int ele){
        if(Vacia()){
           Nodo P = new Nodo(ele, null);
           frente = P;
           atras = P;
           cant++;
        }else{
             Nodo P = new Nodo(ele, null);
             atras.setEnlace(P);
             atras = P;
             cant++;
        }
    }
    public int Decolar(){
        int x = frente.getDato();
       if(frente == atras){
           frente=null;
           atras=null;
           cant = 0;
       } else{
           frente = frente.getEnlace();
           cant--;
       }
       return x;
    }
    public int Get(){
        return frente.getDato();
    }

    @Override
    public String toString() {
        String s= "";
        Nodo aux = frente;
        while (aux != null){
            s = s + aux.getDato() + "\n";
            aux = aux.getEnlace();
        }
        return s;
    }
    
}
