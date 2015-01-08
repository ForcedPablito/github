/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication45;
import java.util.Scanner;
/**
 *
 * @author vesprada
 */
public class JavaApplication45 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner introducir =new Scanner(System.in);
        int num, num2, opt, igualador, contador, igualador2;
        double raiz;
        opt=introducir.nextInt();
        switch (opt){
            case 1: 
                num=introducir.nextInt();
                num2=introducir.nextInt();
                num=num+num2;
                System.out.println(num);
                break;
            case 2:
                num=introducir.nextInt();
                num2=introducir.nextInt();
                num=num-num2;
                System.out.println(num);
                break;
                
            case 3:
                num=introducir.nextInt();
                num2=introducir.nextInt();
                num=num*num2;
                System.out.println(num);
                break;
            case 4:
                num=introducir.nextInt();
                num2=introducir.nextInt();
                num=num/num2;
                System.out.println(num);
                break;
            case 5: 
                raiz=introducir.nextInt();
                raiz=Math.sqrt(raiz);
                System.out.println(raiz);
                break;
            case 6:
                num=introducir.nextInt();
                num2=introducir.nextInt();
                igualador=num;
                igualador2=num2;
                do {
                num=num*igualador;
                contador++;
                } while (igualador2==contador);
                System.out.println(num);
                break;
             
        }
        
    }
    
}
