package org.generation.livecoding6;

import java.util.Scanner;

public class Livecoding6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//Crea el scanner
		int[] n = new int[20];// se arregla el array
		for (int i = 0; i < 20; i++) { //Se arregla el for
		      n[i] =  (int) (Math.random()*100); //se arrelga el numero
		      System.out.println(n[i] + " ");// 
		    }
		    
		    System.out.println("¿Qué números quiere resaltar?");
		    System.out.println("1 – los múltiplos de 5 \n2 – los múltiplos de 7 ");
		    int opcion = sc.nextInt();// se arrerglan las opciones
		    int multiplo = (opcion == 1) ? 5 : 7 ;
		    
		    for(int numero : n) {
		    	if(numero%multiplo == 0) {
		    		System.out.println(numero + " es multiplo de: " + multiplo);// se agrega condicion
		    	}
                  sc.close();//cerrar el scanner
		    }
		   
	}

	}

