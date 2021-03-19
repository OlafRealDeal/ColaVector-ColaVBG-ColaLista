package Negocio;

/**
 *
 * @author Olaf
 */
public class ColaLMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ColaLista L=new ColaLista();
       L.Encolar(1);
       L.Encolar(3);
       L.Encolar(5);
       L.Encolar(7);
        System.out.println(L);
        L.Decolar();
        L.Decolar();
        System.out.println(L);
        L.Get();
        System.out.println(L);
    }
    
}
