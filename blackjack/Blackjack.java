package blackjack;

import java.util.*;

import static blackjack.BlackjackPlayerState.STICK;
import static blackjack.BlackjackPlayerState.getState;

public class Blackjack {

    private static final int CARDS_PER_PLAYER = 2;
    private static final int NUMBER_OF_PLAYER = 3;

    private List<Player> players;
    private Deck deck;

    public Blackjack() {
        this(NUMBER_OF_PLAYER);
    }

    public Blackjack(int numberOfPlayers) {
        players = new ArrayList<Player>();

        for(int i=0; i<numberOfPlayers; i++){
            players.add(new Player(String.valueOf(i)));
        }

        this.deck = new Deck();

    }

    /**
     *
     * @return winner of the game
     */
    public Player play() {

        deal();
        int round = 1;
        System.out.println("Round 1:"+players);
        Player winner = playTillWin(players, deck);
        while(winner == null){
            round++;
            System.out.println("Round:"+round+":"+players);

            winner = playTillWin(players, deck);
        }

        return winner;
    }

    public Player playTillWin(List<Player> players, Deck deck) {

        if(players.size()==1) {
            Player winner = players.get(0);
            System.out.println("Only one player left in the game. Winner is "+winner);
            return winner;
        }

        if(allStick(players) || deck.getCards().isEmpty()) {
            Player winner = closestTo21ButNotOver21(players);
            return winner;
        }

        for(Player player: players) {
            BlackjackPlayerState state = getState(player.total());
            switch (state) {
                case HIT:
                    System.out.println("Player "+player.name()+" "+state);
                    player.pickCard(deck.take());
                    break;
                case BUST:
                    ArrayList<Player> remainingPlayers = new ArrayList<Player>(players);
                    remainingPlayers.remove(player);
                    System.out.println("Player "+player.name()+" went "+state);

                    this.players = remainingPlayers;
                    break;
                case WIN:
                    System.out.println("Player "+player.name()+" "+state);
                    return player;
                default:
                    //stick
                    System.out.println("Player "+player.name()+" "+state);
            }


        }
        return null;
    }

    private boolean allStick(List<Player> players) {
        for(Player player: players) {
            if(getState(player.total()) != STICK){
                return false;
            }
        }
        return true;
    }

    public Player closestTo21ButNotOver21(List<Player> players) {
        List<Player> playersToCheck = new ArrayList<Player>();

        for (Player player: players){
            int total = player.total();
            if(total < 21 && total >= 17){
                playersToCheck.add(player);
            }
        }

        Collections.sort(playersToCheck, new Comparator<Player>() {
            @Override
            public int compare(Player p1, Player p2) {
                return (21 - p1.total()) - (21-p2.total());
            }
        });
        return playersToCheck.get(0);
    }

    public void deal() {
        deck.shuffle();

        for(Player player: players){
            for(int j=0; j<CARDS_PER_PLAYER; j++) {
                player.pickCard(deck.take());
            }
        }

    }

    public List<Player> players() {
        return players;
    }

    public Deck deck() {
        return deck;
    }
}
