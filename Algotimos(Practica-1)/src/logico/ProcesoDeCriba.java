package logico;

import java.util.ArrayList;

public class ProcesoDeCriba 
{
	private int num;
	private ArrayList<Integer> criba;
	
	public ProcesoDeCriba( int num, ArrayList<Integer> criba )
	{
		this.num = num;
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
			
			if ( primos( ind ) )
			{
				System.out.println("Primo: " +ind );
				continue;
			}
			else if ( factorizable( ind ) )
			{
				 System.out.println("Número factorizable: " +ind );
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
			
			if ( primos( ind ) )
			{
				System.out.println("Primo: " +ind );
			}
			else if ( factorizable( ind ) )
			{
				numero.add( ind );
				 System.out.println("Número Factorizable: " +ind );
			}
			else
			{
				 System.out.println("No es factorizable: " +ind );
			}
		}
		
		return numero;
		
	}
	
	public boolean primos ( int num )
	{
		if ( num <= 1 )
		{
			return false;
		}
		
		for ( int ind = 2; ind * ind <= num; ind++ )
		{
			if ( num % ind == 0 )
			{
				return false;
			}
		}
		
		return true;
		
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
