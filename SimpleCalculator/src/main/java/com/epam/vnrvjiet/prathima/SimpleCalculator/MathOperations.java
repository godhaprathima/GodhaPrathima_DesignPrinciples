package com.epam.vnrvjiet.prathima.SimpleCalculator;

public class MathOperations{
	double result;
	public double Addition(double N1,double N2)
	{
		result=N1+N2;
		return result;
	}
	
	public double Substraction(double N1,double N2)
	{
		result=N1-N2;
		return result;
	}
	
	public double Multiplication(double N1,double N2)
	{
		result=N1*N2;
		return result;
	}
	
	public double Division(double N1,double N2)
	{
		try
		{
			result=N1/N2;
			return result;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Can't Divide by zero ");
			return -1;
		}
	}
}

