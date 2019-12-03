import java.util.Scanner;
public class Exe1Raiz {

	public static void main(String[] args) {
		Scanner ler=new Scanner (System.in); 
		
		int a[], b[], i;
		
		a= new int [10];
		b= new int [10];

		for (i=0; i<10; i++) {
			System.out.println("Digite um número");
			a[i]=ler.nextInt();
			b[i]=(int) Math.sqrt(a[i]);
			System.out.println("A "+(i+1)+"º raiz quadrada é "+(b[i]));
		}
	}
}
