import java.util.ArrayList;
import java.util.Random;

public class PuzzleJava {
    Random randMachine = new Random();
    public ArrayList<Integer> getTenRolls(){
        ArrayList<Integer> randomRolls = new ArrayList<Integer>();
        int[] rolls = randMachine.ints(10, 1, 20).toArray();
        for (int oneRoll : rolls){
            randomRolls.add(oneRoll);
        }
        return randomRolls;
    }

    public char getRandomLetter(){
        char[] letters = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        char randomLetter = letters[randMachine.nextInt(26)];
        return randomLetter;
    }

    public String generatePassword(){
        String password = "";
        for (int i = 0; i < 8; i++){
            password = password + getRandomLetter();
        }
        return password;
    }

    public ArrayList<String> getNewPasswordSet(int length){
        ArrayList<String> passwordSet = new ArrayList<String>();
        for (int i = 0; i < length; i++){
            passwordSet.add(generatePassword());
        }
        return passwordSet;
    }
}