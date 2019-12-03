import java.util.Scanner;
public class Exe19 {

	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	
	int a[] = new int [10];
	int b[] = new int [a.length];
	int c[] = new int [a.length];
			
	for (int i=0; i<a.length;i++){
		System.out.println("Digite 10 número");
		a[i]= ler.nextInt();
	}
	for (int i=0; i<b.length;i++){
		System.out.println("Digite 10 número");
		b[i]= ler.nextInt();
			
		if (a[i]==b[i]) {
		c[i] = 0;
					
		}else if(a[i]>b[i]) {
			c[i] = 1;
					
			}else {
			c[i] = -1;
			}
		}
		System.out.println("Vetor A ");
		for (int i = 0; i<a.length; i++) {
		System.out.println(a[i] + "");
		}
			
		System.out.println("Vetor B ");
		for (int i = 0; i<b.length; i++) {
		System.out.println(b[i] + "");
		}
			
		System.out.println("Vetor C ");
		for (int i = 0; i<c.length; i++) {
			System.out.println(c[i] + "");
		}
	}
}
