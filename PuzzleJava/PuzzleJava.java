// You will need to import the Random library from java.util
import java.util.ArrayList;
import java.util.Random;
class PuzzleJava{
    public ArrayList<Integer> getTenRolls(){
        Random randMachine = new Random();
        ArrayList<Integer> rolls = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            rolls.add(randMachine.nextInt(20));
        }

        return rolls; 
    }
   
    public char getRandomLetter(){
        Random randMachine = new Random();
        char[] arr={'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 
    'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        return arr[randMachine.nextInt(arr.length)];
    }

    public String generateRandomPassword() {
        String password= new String();
        for (int i=0; i <8;i++){
            password += getRandomLetter();
        }
        return password; 
}
    public String[] getNewPasswordSet(int length){
        String[] newPass = new String[length];
        for (int i = 0; i < length; i++) {
            newPass[i] = generateRandomPassword();
            
        }
        return newPass;
    }

}


