package Negocio;

/**
 *
 * @author Olaf
 */
public class ColaVBGMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ColaVBG Q = new ColaVBG(6, 4);
       Q.Encolar(1);
       Q.Encolar(3);
       Q.Encolar(5);
       Q.Encolar(7);
        System.out.println(Q);
        Q.Decolar();
        System.out.println(Q);
        
               
    }
    
}
