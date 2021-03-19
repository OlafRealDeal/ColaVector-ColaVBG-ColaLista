package Negocio;

/**
 *
 * @author Olaf
 */
public class ColaVMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ColaVector Q = new ColaVector(10);
        Q.Encolar(1);
        Q.Encolar(3);
        Q.Encolar(5);
        Q.Encolar(7);  
        System.out.println(Q);
        Q.Decolar();
        Q.Decolar();
        Q.Decolar();
        Q.Decolar();
        Q.Decolar();
        System.out.println(Q);
       
       
        
    }
    
}
