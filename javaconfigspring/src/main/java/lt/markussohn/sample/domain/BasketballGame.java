package lt.markussohn.sample.domain;

import javax.sql.DataSource;

/**
 * @author the-markussohn
 *         2018-06-26.
 */
public class BasketballGame implements Game {

    private Team homeTeam;
    private Team awayTeam;
    private DataSource dataSource;

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

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
}
