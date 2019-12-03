import java.util.Scanner;
public class Exe6 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int c = 0;
		int a[] = new int [20];
		int b[] = new int [a.length];
		
		for (int i=0; i<a.length; i++) {
			System.out.println("Digite o "+(i+1)+" número:");
			a [i]= in.nextInt();
		}
		
		for (int i=0; i<a.length; i++) {
			if (a[i]%2==0) {
				b[c]= a[i];
				c++;
		}
	}
		for (int i=0; i<a.length; i++) {
			if (a[i]%2 !=0) {
				b[c]= a[i];
				c++;
		}
	}
		System.out.println("Primeiro vetor, VETOR A ");
		for (int i = 0; i<a.length; i++) {
			System.out.println(a[i] + "");
		}
		
		System.out.println("Segundo vetor, VETOR B ");
		for (int i = 0; i<b.length; i++) {
			System.out.println(b[i] + "");
		}
		System.out.println();
		
	

}
}