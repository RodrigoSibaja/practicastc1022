import java.util.Scanner;
public class A�oBisiesto{
	public static void main(String[]args){
		Scanner kb = new Scanner(System.in);
		int a = 0;

		System.out.println("Dame el a�o");
		a = kb.nextInt();

		if((a%4==0)&&(a%100!=0)){
			System.out.println("El a�o es bisiesto");
		}
		else{
			System.out.println("El a�o NO es bisiesto");
		}
	}
}

//no entre 100, si entre 4, si entre 400