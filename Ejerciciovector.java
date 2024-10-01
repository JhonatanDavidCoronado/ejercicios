/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciovector;

import java.util.Scanner;

/**
 *
 * @author Personal
 */
public class Ejerciciovector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        //variable tipo vector 
        float[]alturas;
        alturas = new float [5];
        //lectura y guadar alturas 
        for(int i=0;i<5;i++){
            System.out.println("ingrese la altura de la persona");
            alturas[i]=sc.nextFloat();
        }
         //calcular promedio
         float suma=0, promedio=0;
         for(int j=0;j<5;j++){
             suma=suma+alturas[j];
         }
         System.out.println("la suma total:"+suma);
         
         promedio=suma/5;
         System.out.println("promedio de alturas " +promedio );
         //contar los mayores y menores 
         int may,men;
         may=0;
         men=0;
         for(int j=0;j<5;j++){
             if (alturas[j]>promedio){
                 may++;
             }else if (alturas [j]<promedio){
                 men++;
             }
         }
         System.out.println("la cantidad de mayor del promedio en :"+may );
         System.out.println("la cantidad menor  de el promedio es"+men);
        }
}
