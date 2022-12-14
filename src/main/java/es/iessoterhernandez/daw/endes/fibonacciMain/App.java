package es.iessoterhernandez.daw.endes.fibonacciMain;

import java.util.Scanner;

import es.iessoterhernandez.daw.endes.fibonacci.*;

public class App 
{
    public static void main( String[] args )
    {
       
    	Scanner sx = new Scanner(System.in);
    	
    	int numero;
    	
    	do {
    		System.out.println("Introduce un numero mayor que 1");
    		numero = sx.nextInt();
    		
    	}while(numero<=1);
    	
    	fibonacci f = new fibonacci(numero);
    	
    	f.calcularFibonacci();
    	
    	sx.close();
    	
    }
}
