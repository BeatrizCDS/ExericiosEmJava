import java.util.Scanner;
public class Exe17 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int[] a = new int [10];
		
		for (int i=0; i<a.length;i++){
			System.out.println("Digite um número para a "+(i+1)+"°" +" posição:");
			a[i]= ler.nextInt();
		}
		boolean palindromo = true;
		for (int i=0; i<a.length; i++) {
			 
			if (a[i] != a [a.length - 1 - i]) {
				palindromo = false ;
				break;	
			}	
		}
		for (int i = 0; i<a.length; i++) {
			
		}
		System.out.println();
		
		if (palindromo) {
			System.out.println("É um palindromo");
		} else {
			System.out.println("Não é um palindromo");
		}
	}
} 
