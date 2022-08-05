//Print Table of the Given Number
import java.util.Scanner;
class Fact{
	public static void main(String args[]){
	Scanner k=new Scanner(System.in);
	int n,i,fact=1;
	System.out.println("Enter Any Number : ");
	n=k.nextInt();  
	for(i=1;i<=n;i++){  
	fact=fact*i;
	}
	System.out.println("Factorial is : "+fact);
	
	}
}
