import java.util.Scanner;
public class Exe3Inverso {

	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		
		int i=0,j=0;
		int a[];
		int b[];
		a=new int[10];
		b=new int[10];
		
		while(j<10) {
				System.out.println("Digite 10 números");
				a[j]=ler.nextInt();	
				j++;
		}
		
		b[0]=a[9];
		b[1]=a[8];
		b[2]=a[7];
		b[3]=a[6];
		b[4]=a[5];
		b[5]=a[4];
		b[6]=a[3];
		b[7]=a[2];
		b[8]=a[1];
		b[9]=a[0];
		
		while(i<10) {
			System.out.println(b[i]);
			i++;
		}
	}
}
