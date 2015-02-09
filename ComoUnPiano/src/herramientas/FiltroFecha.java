
package MetodosYCosas;

public class FiltroFecha {
 private int d;
 private int m;
 private int a;
 private String nombre;
 
    public void setDia(int dia){
     d=dia;
   }
    public int getDia(){
     return d;
   }
    public void setMes(int mes){
     m=mes;
   }
    public int getMes(){
     return m;
   }
    public void setAño(int año){
     a=año;
   }
    public int getAño(){
     return a;
   }
 
    public boolean filtro(){
     int febrer,dF=0;
     if ((a<1900||a>2100)){
         return false;
     }
     else{ 
         if ((m<1)||(m>12)) {
            return false;
        }
         else{
             if (a%4!=0){
                 febrer=28;
             }
         
         else{
             if (a%100!=0){
                 febrer=29;
             }
             else{
                 if (a%400!=0){
                     febrer=28;
                 }
                 else{
                     febrer=29;
                 }
            }
        }    
    switch (m){
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
            dF=31;
            break;
        case 4:
        case 6:
        case 9:
        case 11:
            dF=30;
            break;
        case 2:
            dF=febrer;
            }
            if((d<=0)||(d>dF)){
                return false;
            }
        }
    return true;
    }
} 
}
