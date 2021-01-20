
package ej13_arrays;

import java.util.Random;
import java.util.Scanner;

public class Ej13_arrays {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random generador=new Random();
        
        int[] datos={4,-7,12,0,8-9,24};
        int posicion,opcion;
        
        posicion=generador.nextInt(datos.length);
        
        do{
            System.out.println("Posicion: "+posicion);
            System.out.println("Valor: "+datos[posicion]);
            System.out.println("1.Izquierda\n2.Derecha");
            opcion=teclado.nextInt();
            switch(opcion){
                case 1:
                    posicion--;
                    break;
                case 2:
                    posicion++;
                    break;
                default:
                    System.out.println("error");
            }
        }while(posicion>=0 && posicion<datos.length);
        System.out.println("Josemi was here");
    }
    
}
