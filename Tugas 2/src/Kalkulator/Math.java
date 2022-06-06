package Kalkulator;

import java.util.Scanner;

public class Math {
	
	 private static Scanner scan = new Scanner(System.in);
	    private static String input1, input2, c, d;
	    private static char x,y;
	    private static double i,j,k;
	    
	    static String getValue1()
	    {
	        input1 = scan.nextLine();
	        return input1;
	    }
	    static String getValue2()
	    {
	        input2 = scan.nextLine();
	        return input2;
	    }

	    static char getFunc()
	    {
	        c =  scan.nextLine();
	        x = c.charAt(0);
	        return x;
	    }
	    static char getOperator()
	    {
	        d = scan.nextLine();
	        y = d.charAt(0);
	        return y;
	    }
	    static double getKurang(double j, double k)
	    {
	        i = j - k;
	        return i;
	    }
	    static double getTambah(double j, double k)
	    {
	        i = j + k;
	        return i;
	    }
	    static double getKali(double j, double k)
	    {
	        i = j * k;
	        return i;
	    }
	    static double getBagi(double j, double k) throws ArithmeticException
	    {
	        if(k == 0)
	        {
	            throw new ArithmeticException();
	        }
	        else
	        {
	            i = j/k;
	        }
	        return i;
	    }

}
