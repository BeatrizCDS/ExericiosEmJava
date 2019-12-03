import java.util.Scanner;
public class Exe7 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int a[] = new int [5];
		
		for (int i=0; i<a.length;i++){
			System.out.println("Digite um número para a "+(i+1)+"°" +" posição:");
			a [i]= ler.nextInt();
		}
		for (int i=0; i<a.length;i++){
			System.out.println("Tabuada do "+a[i]+":");
			
			for (int j = 1; j<=10; j++) {
				System.out.println(+a[i]+"x"+j+"="+(a[i]*j));
			}
	}

		System.out.println();
		
}
}