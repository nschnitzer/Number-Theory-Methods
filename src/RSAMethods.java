//*********************************************************
// Nathan Schnitzer
// RSAMethods.java
// 11/25/17
// This will represent all methods needed to calculate and encrypt using RSA
//*********************************************************

import java.util.ArrayList;

public class RSAMethods 
{
	
	//Constructor
	public RSAMethods()
	{
		
	}
	
	//Calculate the greatest common divisor using the euclidean algorithm
	public static int gcd(int a, int b)
	{
		if (b == 0)
		{
			return a;
		}
		else if (b > a)
		{
			return gcd(b, a);
		}
		else
		{
			return gcd(b, a%b);
		}
	}
	
	//Calculates all Prime #s between 1 and n
	public static ArrayList<Integer> primeList(int n)
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i = 1; i < n; i++)
		{
			boolean isPrimeNum = true;
			for (int j = 2; j < i; j++)
			{
				if (i % j == 0)
				{
					isPrimeNum = false;
					break;
				}
			}
			
			//Add number if it is prime
			if (isPrimeNum)
				list.add(i);
		}
		
		return list;
	}
	
	//Calculate Euler's Totient Function (Phi)
	public static int phi(int n)
	{
		int result = n;
		
		//Considering all prime factors of n and multiplying result by (1 - (1/p))
		for (int p = 2; p*p <= n; p++)
		{
			//Check if n|p
			if (n%p == 0)
			{
				while (n%p == 0)
				{
					n = n/p;
				}
					result = result - (result / p);
			}
		}
		
		// If n has a prime factor greater than sqrt(n)
	    // (There can be at-most one such prime factor)
		if (n > 1)
		{
			result = result - (result / n);
		}
		
		return result;
	}
	
	//Calculate Euler's Totient Function (Also Carmichael's Function)
	// same as static int phi()
		public static int totientFunction(int n)
		{
			int result = n;
			
			//Considering all prime factors of n and multiplying result by (1 - (1/p))
			for (int p = 2; p*p <= n; p++)
			{
				//Check if n|p
				if (n%p == 0)
				{
					while (n%p == 0)
					{
						n = n/p;
					}
						result = result - (result / p);
				}
			}
			
			// If n has a prime factor greater than sqrt(n)
		    // (There can be at-most one such prime factor)
			if (n > 1)
			{
				result = result - (result / n);
			}
			
			return result;
		}
	
	//Determines if a number is prime (phi(n) = n-1)
	public static boolean isPrime(int n)
	{
		if (phi(n) == n-1)
		{
			return true;
		}
		else
			return false;
	}
	
	// utility function to find pow(x, y) under given modulo mod
    static int power(int x, int y, int mod)
    {
        if (y == 0)
            return 1;
        int temp = power(x, y / 2, mod) % mod;
        temp = (temp * temp) % mod;
        if (y % 2 == 1)
            temp = (temp*x) % mod;
        return temp;
    }
	
	//Computes the carmichael function (lambda)
	public static int lambda(int n)
	{
		if (Math.getExponent(n*1.0) > 2 || (Math.pow(2.0, Math.getExponent(n * 1.0)) == n))
				{
			return phi(n);
				}
		
		ArrayList<Integer> primesList = primeList(n);
		primesList.add(2);
		primesList.addAll(4);
		for (int i = 0; i < primesList.size(); i++)
		{
			primesList.add(primesList.get(i)*2);
		}
		
		for (int i = 0; i < primesList.size(); i++)
		{
			if (primesList.isEmpty()) //fix
				return -1;
		}
	}

}
