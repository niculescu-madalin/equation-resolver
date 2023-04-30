package equation;
import java.util.Scanner;

public class EquationParameters {
	private double a, b, c;
	
	public EquationParameters(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public EquationParameters(){
		this.a = 0;
		this.b = 0;
		this.c = 0;
	}
	public void readFromConsole() {
		try(Scanner input = new Scanner(System.in);) {
			System.out.println("Termeni ecuatiei sunt:");
			System.out.print("a = ");
			a =  input.nextDouble();
			System.out.print("b = ");
			b =  input.nextDouble();
			System.out.print("c = ");
			c =  input.nextDouble();
		}
	}
	
	public double getA() {
		return a;
	}
	public double getB() {
		return b;
	}
	public double getC() {
		return c;
	}
}
