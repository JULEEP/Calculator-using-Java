import java.util.Scanner;
class Calculator{
	public static void main(String args[]){

	int a,b,c,ch;

	System.out.println("Enter two number");
	Scanner sc = new Scanner(System.in);

	a = sc.nextInt();
	b = sc.nextInt();
	System.out.println("Enter your choice");
	ch = sc.nextInt();


	switch(ch)
	{
	  case 1: c=a+b;
	     System.out.println("Addition of two number"+c);
	     break;

	 case 2: c = a-b;
	    System.out.println("Substraction of two number"+c);
	    break;

	  case 3: c = a*b;
	  System.out.println("Multiplication of two number"+c);
	  break;

	  case 4: c = a/b;
	  System.out.println("Division of two number"+c);
	  break;

	  case 5: c = a%b;
	  System.out.println("Modules of two number"+c);
      

      default:
      System.out.println("Invalid input");
	}

}
}