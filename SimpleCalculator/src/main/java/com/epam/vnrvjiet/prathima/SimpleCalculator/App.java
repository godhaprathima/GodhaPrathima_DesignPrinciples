package com.epam.vnrvjiet.prathima.SimpleCalculator;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("Simple Caluculator");
        Scanner sc=new Scanner(System.in);
        MathOperations m=new MathOperations();
        
        
        while(true)
        {
        	System.out.println("Enter a Math Operator");
        char c = sc.next().charAt(0);
        
        
        try {
        	
        System.out.println("Enter 1st Input Number");
        double N1=sc.nextDouble();
        System.out.println("Enter 2st Input Number");
    	double N2=sc.nextDouble();
        
    	double result=0;
    	
        switch(c)
        {
        case '+': result= m.Addition(N1,N2);
        	System.out.println("Result:"+result);
        	break;
        case '-':result=m.Substraction(N1,N2);
        	System.out.println("Result:"+result);
        	break;
        case '*':result=m.Multiplication(N1, N2);
        	System.out.println("Result:"+result);
        	break;
        case '/':result=m.Division(N1, N2);
        	if(result!=-1)
        	System.out.println("Result:"+result);
        	break;
        default: System.out.println("Invalid Operator");
        }
        }
        
        
        catch (InputMismatchException ex)
        {
        	System.out.println("Please enter valid input number");
        }
        }
    }
}
