package testsepam;

import java.util.Scanner;

public class FindMaxInSeq {
    public static int max() {
		return max();
    	
    }

     
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a =0;
		int count=0;
		while(a!=0){
			a = scan.nextInt();
			count++;
		}
		int[] massive = new int[count];
		for(int i =0; i<massive.length;i++){
			massive[i]=scan.nextInt(count);
		}
		
		int max =massive[0];
		for(int i =0; i<massive.length;i++){
			if(max>massive[count]){
				max = massive[count];
			}
		}
		System.out.println(max);
	}
}
