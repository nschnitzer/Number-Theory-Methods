import java.math.BigInteger;
import java.util.Arrays;

//**********************************************************************
// Nathan Schnitzer
// RSAtest.java
// 11/25/17
// This will test RSA encryption methods
//**********************************************************************

public class RSAtest 
{

	public static void main(String[] args) 
	{
		/*
		double e = (Math.pow(11.0, -1.0));
		BigInteger bN = new BigInteger("9247606623523847772698953161616455664821867183571218056970099751301682205123115716089486799837447397925308887976775994817175994945760278197527909621793469");
		BigInteger bN2 = new BigInteger("5");
		System.out.println(bN.pow(2));
		BigInteger one = new BigInteger("1");
		
		BigInteger div = one.divide(bN.pow(2));
		System.out.println(div);
		
		//Test Euclidean Algorithm
		System.out.println("Testing gcd...");
		System.out.println("gcd(330,156)");
		System.out.println(RSAMethods.gcd(330, 156));
		System.out.println();
		*/
		
		//Test Euler's Totient function(phi)
		System.out.println("Testing phi");
			System.out.println("phi = " + RSAMethods.phi(37));
		
		
		//Test isPrime method
		System.out.println("n = 37\t" + RSAMethods.isPrime(37));
		System.out.println("n = 467\t" + RSAMethods.isPrime(467));
		System.out.println("n = 210\t" + RSAMethods.isPrime(210));
		System.out.println();
		
		//Test listPrime method
		//System.out.println("Primes from 1 -> 200: " + (RSAMethods.primeList(200).toString()));
		//System.out.println();
		//System.out.println(Math.getExponent(12.0));
	}

}
