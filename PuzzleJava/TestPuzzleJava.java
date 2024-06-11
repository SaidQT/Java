import java.util.ArrayList;
import java.util.Random;
public class TestPuzzleJava {
    
	public static void main(String[] args) {
		PuzzleJava generator = new PuzzleJava();
		ArrayList<Integer> randomRolls = generator.getTenRolls();
		System.out.println(randomRolls);
		char rand=generator.getRandomLetter();
		System.out.println(rand);
		String pass=generator.generateRandomPassword();
		System.out.println(pass);
		String[] newPass=generator.getNewPasswordSet(3);
		for (int i =0; i < newPass.length;i++){
			System.out.println(newPass[i]);
		}
    	        //..
		// Write your other test cases here.
		//..
	}
}
