import java.util.Scanner;
public class AñoBisiesto{
	public static void main(String[]args){
		Scanner kb = new Scanner(System.in);
		int a = 0;

		System.out.println("Dame el año");
		a = kb.nextInt();

		if((a%4==0)&&(a%100!=0)){
			System.out.println("El año es bisiesto");
		}
		else{
			System.out.println("El año NO es bisiesto");
		}
	}
}

//no entre 100, si entre 4, si entre 400