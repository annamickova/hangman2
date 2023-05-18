import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

       Display display = new Display();
        System.out.println(display.start());
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        Game game = new Game(number);
        game.play();


    }
}