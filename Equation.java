package equation;

public class Equation {
	private EquationParameters ep;
	
	public Equation(EquationParameters ep){
		this.ep = ep;
	}
	public Solution solve() {
		Solution sol = new Solution();
	
		if(ep.getA() == 0) {
			if(ep.getB() == 0) {
				if(ep.getC() == 0) {
					sol.setErrorMessage("Ecuatia are o infinitate de solutii.");
					sol.setNoRoots(0);
				} else {
					sol.setErrorMessage("Ecuatia nu are nicio solutie.");
					sol.setNoRoots(0);
				}	
			} else {
				sol.setRoots(- ep.getC()/ ep.getB());
				sol.setNoRoots(1);
			}
				
		} else {
			double delta = ep.getB() * ep.getB() - 4 * ep.getA() * ep.getC();
			if (delta > 0) {
				// root1 = (- ep.getB() + Math.sqrt(delta)) / (2 * ep.getA());
				// root2 = (- ep.getB() - Math.sqrt(delta)) / (2 * ep.getA());
				sol.setRoots((- ep.getB() + Math.sqrt(delta)) / (2 * ep.getA()), (- ep.getB() - Math.sqrt(delta)) / (2 * ep.getA()) );
				sol.setNoRoots(2);
			} else if (delta == 0) {
				sol.setRoots(- ep.getB() / (2 * ep.getA()));
				sol.setNoRoots(1);
			} else {
				sol.setErrorMessage("Ecuatia nu are solutie reala");
				sol.setNoRoots(0);
			}
		}
		return sol;
	}

}