package testsepam;

import java.util.Scanner;
import java.io.IOException;

public class HelloStrangers {
    public static void main(String[] args)throws IOException {
		 
	    	Scanner scan= new Scanner(System.in);
	    	int amount = scan.nextInt();
	   
	    	try {
	    		if(amount<0)throw new Exception (); {
	    			
	    		}
	    	}
	    	catch(Exception ex){
	    		System.out.println("Seriously? Why so negative?");
	    	}
	    	try {
	    		if(amount==0)throw new Exception (); {
	    			
	    		}
	    	}
	    	catch(Exception ex){
	    		System.out.println("Oh, it looks like there is no one here");
	    	}
	    		String array [] = new String[amount];
	    		Scanner scan2 = new Scanner(System.in);
	    		for(int i =0; i<amount; i++){
	    			array [i] = scan2.nextLine();
	    		}
	    		for(int i =0; i<amount; i++){
	    			System.out.println("Hello, "+array[i]);
	    		}
	    }
}













