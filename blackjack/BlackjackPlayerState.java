package blackjack;

public enum BlackjackPlayerState {

    HIT, STICK, BUST, WIN;

    public static BlackjackPlayerState getState(int total) {
        if(total < 17) {
            return HIT;
        } else if(total >=17 && total <21)  {
            return STICK;
        } else if(total > 21) {
            return BUST;
        } else {
            return WIN;
        }
    }

}
