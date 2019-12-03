import java.util.Scanner;
public class Exe11 {

	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		
		int i=0, b, a[];
		a=new int []{1,2,3,4,5,6,7,8,9,10};		
		
		for (i=0; i<10; i++) {
		System.out.println("Digite um número para saber se está armazenado");
		b=ler.nextInt();
		
			if(b !=a[i]) {
				System.out.println("O número "+b+"não está armazenado em nenhuma posição");
			}else if (b==a[i]) {
				System.out.println("O número "+a[i]+" está armazenado na "+(i)+" º posição");
			}
		}
	}
}
