import java.util.Scanner;
public class Exe9 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		
		int[] a = new int [10];
		for (int i=0; i<a.length;i++){
			System.out.println("Digite um n�mero para a "+(i+1)+"�" +" posi��o:");
			a [i]=ler.nextInt();
		}
		for (int i=0; i<a.length;i++){
			System.out.println("Analisando o n�mero"+a[i]);
			
			for (int j = 2; j<a[i]; j++) {
				if (a[i] % j==0) {
					System.out.println(j+" � par");
				}
		}
			System.out.println("");
	}

}
}