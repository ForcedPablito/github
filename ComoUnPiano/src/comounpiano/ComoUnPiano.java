package comounpiano;
import java.util.Scanner;

public class ComoUnPiano {
   /**
    * muestra el array
    * @param a 
    */
   public void inicializa (int a[]){
        
        int x, talla;
        talla=a.length;
        for(x=0;x<talla;x++){
            System.out.println(a[x]);
        }
   }
   /** 
    * ordena el array
    * @param a
    * @return 
    */
   public int [] ordenar (int a[]){
       int x, talla, i;
       talla=a.length;
       int [] b=new int [talla];
       for (x=1;x<talla;x++){
           for (i=0;i<talla-x;i++){
               if (a[i]>a[i+1]){
                   b[i]=a[i];
                   a[i]=a[i+1];
                   a[i+1]=b[i];
               }
           }
           
       }
       return a;
   }
   /**
    * saca el maximo del array
    * @param a
    * @return 
    */
   public int maximo (int a[]){
       int i, max=0, talla;
       talla=a.length;
       for (i=0;i<talla;i++){
           if (a[i]>max){
               max=a[i];
           }
       }
       return max;
   }
   /**
    * saca el minimo del array
    * @param a
    * @return 
    */
   public int minimo (int a[]){
       int i, min=10000000, talla;
       talla=a.length;
       for (i=0;i<talla;i++){
           if (a[i]<min){
               min=a[i];
           }
       }
       return min;
   }
   /**
    * saca la media del array
    * @param a
    * @return 
    */
   public double media (int a[]){
       double b, suma=0;
       int i, talla;
       talla=a.length;
       for (i=0;i<talla;i++){
           suma=suma+a[i];
       }
       b=suma/talla;
       return b;
   }
   /**
    * En el siguiente metodo comprobamos si son iguales
    * @param a
    * @param b
    * @return 
    */
   public boolean igual (int a[], int b[]){
    boolean c=false;
    int i, talla;
    talla=a.length;
    if (talla!=b.length){
            c=true;
            return c;
        }
    for (i=0;i< talla;i++){
        if (a[i] != b[i]){
            c=true;
            break;
        }
        
        
    }
    return c;
   }
   /**
    * dice si es palindrom o no
    * @param a
    * @return 
    */
   public boolean palidrom (int a[]){
       boolean c=true;
       int i, talla, mitad, j;
       talla=a.length;
       j=talla-1;
       mitad=talla/2;
      for (i=0;i<mitad;i++){
          
          if (a[i]!=a[j]){
              c=false;
              return c;
          }
        j--;
      }
      
      return c;
   }
   
    public static void main(String[] args) {
        Scanner introducir=new Scanner(System.in);
        ComoUnPiano data=new ComoUnPiano();
        int num, num2, cont=0, x;
        System.out.println("introduce el numero de numeros");
        num=introducir.nextInt();
        int [] hola =new int [num];
        
        
        
        
        for (x=0;x<num;x++){
            System.out.println("introduce un numero:");
            num2=introducir.nextInt();
            hola[x]=num2;    
            
        }
        System.out.println("Sin ordenar:");
        data.inicializa(hola);
        data.ordenar(hola);
        System.out.println("Ordenado:");
        data.inicializa(hola);
        System.out.println("maximo:"+data.maximo(hola));
        System.out.println("minimo:"+data.minimo(hola));
        System.out.println("media:"+data.media(hola));
         System.out.println("introduce el numero de numeros para el segundo array");
        num=introducir.nextInt();
        int [] hola2 =new int [num];
         for (x=0;x<num;x++){
            System.out.println("introduce un numero para el segundo array:");
            num2=introducir.nextInt();
            hola2[x]=num2;    
            
        }
        if (data.igual(hola, hola2)==true){
        System.out.println("no es igual");
        }else{
            System.out.println("es igual");
            }
        if (data.palidrom(hola)==false){
            System.out.println("no es palindrom");
        }else{
            System.out.println("es palindrom");
        }
    }
    
}