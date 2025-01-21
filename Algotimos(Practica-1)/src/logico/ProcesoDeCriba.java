package logico;

import java.util.ArrayList;

public class ProcesoDeCriba 
{
	private int num;
	private ArrayList<Integer> criba;
	
	public ProcesoDeCriba( int num, ArrayList<Integer> criba )
	{
		this.num = 2;
		this.criba = new ArrayList<>();
	}
	
	public ArrayList<Integer> contadorDeDos ()
	{
		if ( num <= 2 )
		{
			return new ArrayList<>();
		}
		
		for ( int ind = 2; ind <= num; ind++ )
		{
			criba.add( ind );
			
			//Los múltiplos nos dan los primos.
			
			if ( ind > 2 && ind % 2 == 0 )
			{
				System.out.print("Primo: " +ind );
				continue;
			}
			
			if ( factorizable( ind ) )
			{
				System.out.print("Número factorizable: " +ind );
			}
		}
		
		return criba;
		
	}
	
	public ArrayList<Integer> contadorGeneral ( int limite )
	{
		
		ArrayList<Integer> numero = new ArrayList<>();
		
		if ( limite <= 2 )
		{
			return numero;
		}
		
		for ( int ind = 2; ind <= limite; ind++ )
		{
			
			if ( ind > 2 && ind % 2 == 0 )
			{
				System.out.print("Primo: " +ind );
				continue;
			}
			
			if ( factorizable( ind ) )
			{
				numero.add( ind );
				System.out.print("Número Factorizable: " +ind );
			}
			else
			{
				System.out.print("No es factorizable: " +ind );
			}
		}
		
		return numero;
		
	}
	
	public boolean factorizable ( int num )
	{
		for ( int ind = 1; ind * ind <= num; ind++ )
		{
			if ( ind * ind == num )
			{
				return true;
			}
		}
		
		return false;
		
	}
}
