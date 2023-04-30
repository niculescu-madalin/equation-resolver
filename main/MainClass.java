package main;
import equation.*;

public class MainClass {

	public static void main(String[] args) {
		// EquationParameters equationParameters = new EquationParameters(1, -5, -14);
		EquationParameters equationParameters = new EquationParameters();
		equationParameters.readFromConsole();
		Equation equation = new Equation(equationParameters);
		Solution solution = equation.solve();
		solution.show();
	}
}
