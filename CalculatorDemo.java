import java.util.Scanner;

public class ArithmeticDemo {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n1,n2;
		int ans=1, c=0;
		char choice;
		
		do
		{
			System.out.println("a. Addition\tb. Substraction\tc. Multiplication\td. Division\te. Exit");
			System.out.println("Enter your choice : ");
			choice = s.next().charAt(0);
			
			switch(choice)
			{
			case 'a':
				System.out.println("Enter any two numbers : ");
				n1 = s.nextInt();
				n2 = s.nextInt();
				c = n1+n2;
				System.out.println(n1+" + "+n2+" = "+c);
				break;
				
			case 'b':
				System.out.println("Enter any two numbers : ");
				n1 = s.nextInt();
				n2 = s.nextInt();
				if(n1>n2)
				{
				c = n1-n2;
				}
				else
				{
				c = n2-n1;
				}
				System.out.println(n1+" - "+n2+" = "+c); 
				break;
				
			case 'c':
				System.out.println("Enter any two numbers : ");
				n1 = s.nextInt();
				n2 = s.nextInt();
				c = n1*n2;
				System.out.println(n1+" * "+n2+" = "+c);
				break;
						
			case 'd':
				System.out.println("Enter any two numbers : ");
				n1 = s.nextInt();
				n2 = s.nextInt();
				if(n2==0)
				{
					System.out.println("Denominator should not be zero");
				}
				else
				{
					c = n1/n2;
					System.out.println(n1+" / "+n2+" = "+c);
				}
				break;
				
			case 'e':
				System.exit(0);
				break;
				
			default:
				System.out.println("WRONG CHOICE!!!");
			}
			System.out.println("Do you want to continue(1/0)?");
			ans = s.nextInt();
		}while(ans!=0);
		
	}

}


/*
 * do-while:
 * 
 * init;
 * 
 * do { //stmts; inc/dec; }while(condition);
 * 
 * switch case:
 * 
 * switch(choice) { case value: stmts; break;
 * 
 * case value: stmts:
 * 
 * ...
 * 
 * default: //code }
 */