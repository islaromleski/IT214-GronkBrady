package gb;

public class MainController {
	public static void main(String[] args) {
		
		ConsoleView aView = new ConsoleView();
		GronkBrady myGronkBrady = new GronkBrady();
		
		for(int i = 1; i <= 100; i++) {
			aView.print(i + "		" + myGronkBrady.calculate(i));
			if(i % 3 == 0) {
				aView.print("\n");
			}
		}
	}
}
