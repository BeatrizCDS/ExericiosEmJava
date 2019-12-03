import java.util.Scanner;
public class Exe2Primos {

	public static void main(String[] args) {
		Scanner ler=new Scanner (System.in);
		
		int i, b=1, div=0, soma=0;
		final int j=10;
		int a[];
		a= new int[j];
		

		for(i=0; i<10; i++) {
			System.out.println("Digite o "+(i+1)+" número");
			a[i]= ler.nextInt();
		}
		
		for(i=0; i<=10; i++) {
			div=0;
			for(b=1; i<=10; b++) {
				if(a[i]%b==0) {	
					div=div+1;
				}
			}
				if (div==2) {
					System.out.println("O número "+a[i]+" é primo");
					soma=soma+1;
				}
			
				System.out.println("Os números primos somam "+soma);
				ler.close();
		}
}
}
	

