package logico;

import java.util.ArrayList;

public class Main 
{
	public static void main ( String[] args )
	{
		
		int numeroLimite = 20;
        ArrayList<Integer> listaInicial = new ArrayList<>();
        ProcesoDeCriba criba = new ProcesoDeCriba(numeroLimite, listaInicial);

        long inicio = System.nanoTime();
        System.out.println("Resultados de contadorDeDos:");
        ArrayList<Integer> resultadoDos = criba.contadorDeDos();
        System.out.println("Lista generada por contadorDeDos: " + resultadoDos);
        
        long fin = System.nanoTime();
        System.out.print("Tiempo ejecutado por contadorDeDos: " + ( fin - inicio ) + " nanosegundos. " );

        inicio = System.nanoTime();
        System.out.println("\nResultados de contadorGeneral:");
        ArrayList<Integer> resultadoGeneral = criba.contadorGeneral(numeroLimite);
        System.out.println("Lista generada por contadorGeneral: " + resultadoGeneral);
        fin = System.nanoTime();
        
        System.out.print("Tiempo ejecutado por contador general: " + ( fin - inicio ) + " nanosegundos." );
        
	}
}
