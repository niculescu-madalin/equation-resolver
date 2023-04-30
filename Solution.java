package equation;

public class Solution {
	private double root1, root2;
	private int noRoots;
	private String errorMessage;
	
	public void show() {
		if(noRoots == 1) {
			System.out.println("Solutia are o singura solutie " + root1);
		}
		if(noRoots == 2) {
			System.out.println("Solutia are doua solutii " + root1 + " si " + root2);
		}
		else {
			System.out.println(errorMessage);
		}
		
	}
	
	public void setNoRoots(int noRoots) {
		this.noRoots = noRoots;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	public void setRoots(double root1, double root2) {
		this.root1 = root1;
		this.root2 = root2;
	}
	
	public void setRoots(double root) {
		this.root1 = root;
	}
	
}
