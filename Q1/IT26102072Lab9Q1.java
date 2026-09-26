import java.util.Scanner;
public class IT26102072Lab9Q1
{
    public static void main(String[] args)
    {
        double number,Square,SquareRoot;
		
        Scanner input = new Scanner(System.in);
		
        System.out.print("Enter a number :  ");
		
        number = input.nextInt();
		
        Square = number * number;
		SquareRoot = Math.sqrt(number);
		
		System.out.println("The square of" +number+"is : "+Square);
		System.out.println("The square Root of" +number+"is : "+SquareRoot);
        input.close();
    }
}