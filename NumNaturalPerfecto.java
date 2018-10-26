import java.util.Scanner;
public class NumNaturalPerfecto{
	public static void main(String[]args){
		Scanner kb = new Scanner(System.in);
		int num = 0;
		int count = 0;
		int sum = 0;

		System.out.println("Dame un número");
		num = kb.nextInt();

		for(count=1;count<=num;count++){
			if(num%count==0){
				sum = sum + count;
			}
		}
		if((sum/2)==num){
			System.out.println("Es un número natural perfecto");
		}
		else{
			System.out.println("No es un número natural perfecto");
		}
	}
}