
package ej14_array;

import java.util.Random;
import java.util.Scanner;

public class Ej14_array {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random generador=new Random();
        
        int[] datos={4,-7,12,0,8-9,24};
        int posicion,opcion;
        
        posicion=generador.nextInt(datos.length);
        
        do{
            System.out.println("Posicion: "+posicion);
            System.out.println("Valor: "+datos[posicion]);
            System.out.println("1.Izquierda\n2.Derecha\n3.Salir");
            opcion=teclado.nextInt();
            switch(opcion){
                case 1:
                    if(posicion==0){
                        posicion=datos.length-1;
                    }else{
                    posicion--;
                    }
                    break;
                case 2:
                    if(posicion==datos.length-1){
                        posicion=0;
                    }else{
                    posicion++;
                    }
                    break;
                case 3:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("error");
            }
        }while(opcion!=3);
    }
    
}
