//Print Table of the Given Number
import java.util.Scanner;
class Table{
	public static void main(String args[]){
	Scanner k=new Scanner(System.in);
	int n,i;
	System.out.println("Enter Any Number : ");
	n=k.nextInt();  
	for(i=1;i<=10;i++){  
	System.out.println(""+n*i);
	
	}
}
