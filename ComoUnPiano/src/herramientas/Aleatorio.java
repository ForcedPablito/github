
package herramientas;
import java.util.Random;
public class Aleatorio {
     Random rnd = new Random();
     private int r;
    public int NumAleatorio(int a, int b){
        r=rnd.nextInt(b-a+1)+1;
        
    return r;
    } 
    }

