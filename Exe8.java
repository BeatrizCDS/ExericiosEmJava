import java.util.Scanner;
public class Exe8 {

	public static void main(String[] args) {
		Scanner ler=new Scanner (System.in);
		
		int i=0,a[];
		a=new int[10];
		
		for(i=0; i<10; i++) {
			System.out.println("Digite 10 números");
			a[i]=ler.nextInt();
		
		}
		for(i=0; i<10; i++){
			
			if(a[i]%2==0) {
				
				System.out.println("O número "+a[i]+" é par");
			}
		}
	}
}
