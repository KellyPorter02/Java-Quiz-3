package rocks.zipcode.io.quiz3.objectorientation.enums;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {
    ROCK,
    PAPER,
    SCISSOR;

    private RockPaperScissorHandSign winner;
    private RockPaperScissorHandSign loser;

    public RockPaperScissorHandSign getWinner() {
        switch (this) {
            case ROCK:
                winner = PAPER;
                break;
            case PAPER:
                winner = SCISSOR;
                break;
            case SCISSOR:
                winner = ROCK;
        }
        return winner;
    }

    public RockPaperScissorHandSign getLoser() {
        switch (this) {
            case ROCK:
                loser = SCISSOR;
                break;
            case PAPER:
                loser = ROCK;
                break;
            case SCISSOR:
                loser = PAPER;
        }
        return loser;

    }
}
