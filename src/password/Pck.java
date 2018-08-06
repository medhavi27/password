package password;

import java.util.Random;

public class Pck {
	 public static void main(String[] args)
	    {
	        //trying to mess with the password generator- nothing fancy
	        int length = 10;
	        System.out.println(pwd(length));
	    }
	 
	    //generating it
	    static char[] pwd(int len)
	    {
	        System.out.println("Thanks for generating a safe password: ");
	        System.out.print("Use: ");
	 
	        String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	        String lower_case = "abcdefghijklmnopqrstuvwxyz";
	        String numbers = "0123456789";
	                String symbols = "!@#$%^&*_=+-/.?<>)";
	 
	 
	        String values = upper_case + lower_case +
	                        numbers + symbols;
	 
	        // Using random method
	        Random usinggen = new Random();
	 
	        char[] password = new char[len];
	 
	        for (int i = 0; i < len; i++)
	        {
	            
	            password[i] =
	              values.charAt(usinggen.nextInt(values.length()));
	 
	        }
	        return password;
	    }
	}

