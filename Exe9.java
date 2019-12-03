import java.util.Scanner;
public class Exe9 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		
		int[] a = new int [10];
		for (int i=0; i<a.length;i++){
			System.out.println("Digite um número para a "+(i+1)+"°" +" posição:");
			a [i]=ler.nextInt();
		}
		for (int i=0; i<a.length;i++){
			System.out.println("Analisando o número"+a[i]);
			
			for (int j = 2; j<a[i]; j++) {
				if (a[i] % j==0) {
					System.out.println(j+" é par");
				}
		}
			System.out.println("");
	}

}
}