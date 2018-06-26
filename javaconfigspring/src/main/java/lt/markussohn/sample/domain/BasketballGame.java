package lt.markussohn.sample.domain;

/**
 * @author the-markussohn
 *         2018-06-26.
 */
public class BasketballGame implements Game {

    private Team homeTeam;
    private Team awayTeam;

    public BasketballGame() {
    }

    public BasketballGame(Team homeTeam, Team awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }

    @Override
    public Team getHomeTeam() {
        return homeTeam;
    }

    @Override
    public Team getAwayTeam() {
        return awayTeam;
    }

    @Override
    public void play() {
        Team winner = Math.random() > 0.5 ? getHomeTeam() : getAwayTeam();
        System.out.println(winner.getName() + " win!");
    }

    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }
}
