package testsepam;
import java.util.Scanner;

public class PizzaSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		PizzaSplit nod = new PizzaSplit();
        System.out.println(a/nod.GCD(a , b));
        
    }

    public int GCD(int a, int b) {
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }

        return a;
    }

	}


