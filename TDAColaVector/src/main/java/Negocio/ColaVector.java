package Negocio;

/**
 *
 * @author Olaf
 */
public class ColaVector {
    int Q[];
    int frente;
    int atras;
    public ColaVector(int cant){
        Q = new int[cant];
        frente = -1;
        atras  = -1;
    }
    public boolean Vacia(){
        return (frente == -1);
    }
    public boolean Llena(){
        return (atras+1 % Q.length == frente);   
    }
    public void Encolar(int ele){
        if (Vacia()){
            frente = 0;
            atras  = 0;
            Q[atras]=ele;
        }else{
            if(Llena()){
                System.out.println("ERROR, Cola Llena");  
                System.exit(1);
            }else{
                atras = atras+1 % Q.length;
                Q[atras]=ele;
            }
        }
    }
    public int Decolar(){
        int x = Q[frente];
        if (frente == atras){
            frente = -1;
            atras  = -1;
        }else{           
            //frente = frente+1 % Q.length; 
            frente = frente +1 % Q.length;                      
        }       
        return x;                   
    }
    public int Get(){
        return (Q[frente]); 
    }

    @Override
    public String toString() {
      String s= "";   
      for (int i=0; i<=atras; i++){
         s = s + Q[i] + "\n";
      }         
          return s;
      
    }
    
    
}
