package gb;

public class GronkBrady {
	String calculate(int testNum) {
		if((testNum % 3 == 0) && (testNum % 5 == 0)) {
			return "GronkBrady";
		}
		else if(testNum % 5 == 0) {
			return "Brady";
		}
		else if(testNum % 3 == 0) {
			return "Gronk";
		}
		else {
			return "No";
		}
	}
}
