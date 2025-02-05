//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("new score is " + calculateScore("Tim", 500));
        System.out.println("new score is " + calculateScore(10));
//       int newScore = calculateScore("tim", 4000);
//       System.out.println(newScore);
//
//       calculateScore(75);
//       calculateScore();
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

//    public static int calculateScore(int score) {
//        System.out.println("Unnameded player scored " + score + " points");
//        return score * 1000;
//    }
    public static int calculateScore(int score) {
        return calculateScore("Anomoyous" ,score);
    }

    public static int calculateScore() {
        System.out.println("Unnameded player no  scored  points");
        return 0;
    }


}