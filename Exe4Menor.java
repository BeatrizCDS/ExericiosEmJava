import java.util.Scanner;
public class Exe4Menor {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int valor, maior=0, menor=10000, i, a[];
		a=new int [3];
		
		for(i=0; i<=2; i++){
			System.out.println("Digite 3 n�meros");
			a[i]=ler.nextInt();
			
			if(a[i]>maior) {
				maior=a[i];
			}
			if(a[i]<menor) {
				menor=a[i];
			}
		}
		
		System.out.println("O maior valor �: "+maior);
		System.out.println("O menor valor �: "+menor);
	}
}
