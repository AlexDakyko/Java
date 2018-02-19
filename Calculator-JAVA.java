
import java.util.Scanner;

public class Calculator {
	
	

	public static void main(String[] args) {
		System.out.print("Введите любое число: ");
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int number1 = scan.nextInt();
		System.out.println(number1);
		System.out.print("Введите любое другое число: ");
		int number2 = scan.nextInt();
		System.out.println(number2);
		System.out.print("Выберите действие: +,-,/ или *");
		String mathAction = scan.next();
		System.out.print(mathAction);
		
		int sum = number1 + number2;
		int sub = number1 - number2;
		int mult = number1 * number2;
		int div = number1 / number2;
		
		switch (mathAction) {
		case "+":
		System.out.println(sum);
			return;
		case "-":
			System.out.print(sub);
			return;
		case "*":
			System.out.print(mult);
			return;
		default:
			System.out.print(div);

		
			return;
		}
		
	