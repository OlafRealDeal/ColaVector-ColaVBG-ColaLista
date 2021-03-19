package Negocio;
/**
 *
 * @author Olaf
 */
public class ColaVBG {
        VectorBitGen Q;
        int frente,atras,Nbit;
    public ColaVBG(int cant, int Nbits ){
        Q = new VectorBitGen(cant, Nbits);
         frente = 0;
         atras = 0;
         Nbit = Nbits;
    }
    public boolean Vacia(){
        return (frente == 0);
    }
    public boolean Llena(){
        return (atras+1 % Q.dim == frente); 
    }
    public void Encolar(int ele){
        if(Vacia()){
           frente = 1;
           atras =1;
           Q.Insertar(ele, atras);
        }else{
            if(Llena()){
                System.out.println("Error Cola Llena");
                
            }else{
                atras = atras+1 %Q.dim;
                Q.Insertar(ele, atras);
            }
        }
    }
    public int Decolar(){
        int x = Q.Sacar(frente);
     if (frente == atras){
         frente = 0;
         atras = 0;        
     }else{
         frente = frente + 1 % Q.dim;        
     }
     return x;
    }
    public int Get(){
        return Q.Sacar(frente);
    }

    @Override
    public String toString() {
        String s = "";
        for (int i=1; i<=atras; i++){
            s = s + Q.Sacar(i) + "\n";
        }
        return s;
    }

   
    
}
