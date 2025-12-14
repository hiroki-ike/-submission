package kadai_028;

public class JyankenExec_Chapter28 {

	public static void main(String[] args) {
		
		Jyanken_Chapter28 jyanken = new Jyanken_Chapter28();
		String input = jyanken.getMyChoice();
		String enemy = jyanken.getRandom();
		jyanken.playGame(input,enemy);
		
	}
}
