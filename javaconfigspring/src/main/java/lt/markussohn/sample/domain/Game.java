package lt.markussohn.sample.domain;

/**
 * @author the-markussohn
 *         2018-06-26.
 */
public interface Game {

    Team getHomeTeam();

    Team getAwayTeam();

    void play();
}
