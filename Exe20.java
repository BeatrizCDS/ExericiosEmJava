//import java.util.Scanner;
import java.util.Arrays;
public class Exe20 {

	public static void main(String[] args) {
		//Scanner ler=new Scanner (System.in);
		
		int a[]= {7,5,1,3,2,8,10,4,6,9}; 
		int b[]=new int [10];
		int c[]=new int [10];
		int i=0;
		
		Arrays.sort(a);
		 System.out.println("Em ordem crescente");
	      for (i = 0; i <a.length; i++) {
	    	  a[i]=a[i];
	    	  b[i]=a[i];
	    	 
	          System.out.println(b[i]+"");
	      }
	      
	      System.out.println("Em ordem decrescente");
	     for (i =a.length-1; i >=0; i--) {
	    	 a[i]=a[i];
	    	  c[i]=a[i];
	    	 
	          System.out.println(c[i]+"");
	     }	     
	}
}