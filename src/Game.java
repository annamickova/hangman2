import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game extends Words{

    protected List<Character> usedChars;
    protected List<Character> leftChars;

    public Game(int number) throws Exception{
        super(number);
        this.usedChars = new ArrayList<>();
        this.leftChars = new ArrayList<>();
        String abcd = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < abcd.length(); i++) {
            this.leftChars.add(abcd.charAt(i));
        }
    }

    public Game(int number, List<Character> usedChars, List<Character> leftChars) throws Exception {
        super(number);
        this.usedChars = usedChars;
        this.leftChars = leftChars;
    }

    public List<Character> getUsedChars() {
        return usedChars;
    }
    public void setUsedChars(List<Character> usedChars) {
        this.usedChars = usedChars;
    }

    public List<Character> getLeftChars() {
        return leftChars;
    }
    public void setLeftChars(List<Character> leftChars) {
        this.leftChars = leftChars;
    }

    public void play(){
        System.out.println(selectWord());
        Scanner sc =  new Scanner(System.in);
        StringBuilder line = new StringBuilder();
        int attempts = 9;
        for (int i = 0; i < wordToGuess.length(); i++) {
            line.append("_");
        }
        answering(line, sc,attempts);


    }

    public void answering(StringBuilder line, Scanner sc, int attempts){
        while (attempts > 0 && line.toString().contains("_")){
            String answer;
            System.out.println(line);
            System.out.println("attempts: " + attempts);
            System.out.println(picture(attempts));
            System.out.println("enter letter");
            answer = sc.next();
            System.out.println(usedLetters(answer.charAt(0)));

            if (!correction(answer, line)){
                attempts--;
                System.out.println("incorrect guess");
            }
            System.out.println(result(attempts, line));
        }
    }

    public boolean correction(String answer, StringBuilder line){
        boolean correct = false;
        for (int i = 0; i < wordToGuess.length(); i++) {
            if (answer.charAt(0) == wordToGuess.charAt(i)){
                line.setCharAt(i, answer.charAt(0));
                correct = true;
            }
        }
        return correct;
    }



    public String usedLetters(char answer){
        for (int i = 0; i < leftChars.size(); i++) {
            if (answer == leftChars.get(i)){
                usedChars.add(leftChars.get(i));
                leftChars.remove(i);
            }
        }
        return "left letters: "+ leftChars+
                "\nused letters: "+ usedChars;
    }

    @Override
    public String toString() {
        return "\nGame" +
                "\nusedChars: " + usedChars +
                "\nleftChars: " + leftChars;
    }
}
