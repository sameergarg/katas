package blackjack;

public class PlayGame {

    public static void main(String[] args) {
        Blackjack blackjack = new Blackjack(3);
        Player winner = blackjack.play();
        System.out.println("Winner: "+winner);
    }
}
