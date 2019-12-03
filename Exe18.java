import java.util.Scanner;
public class Exe18 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int[] a = new int [10];
		int[] b = new int [a.length];
		
		for (int i=0; i<a.length;i++){
			System.out.println("Digite um número que ocupe a "+(i+1)+"° posição");
			a[i]= ler.nextInt();
			
			b[i]=(a [i]%2==0) ? 1 : 0;	
		}
		System.out.println("Vetor A ");
		for (int i = 0; i<a.length; i++) {
			
			System.out.println(a[i] + "");
		}
		
		System.out.println("Vetor B ");
		for (int i = 0; i<b.length; i++) {
			
			System.out.println(b[i] + "");
		}
	}
}