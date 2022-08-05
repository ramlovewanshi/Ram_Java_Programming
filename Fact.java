import java.util.Scanner;
class Fact{
	public static void main(String args[]){
	Scanner k=new Scanner(System.in);
	int n,i;
	System.out.println("Enter Any Number : ");
	n=k.nextInt();  //4
	for(i=1;i<=10;i++){  // 1 2 3 4 5 6 7 8 9 10
	System.out.println(""+n*i);
	
	}
}