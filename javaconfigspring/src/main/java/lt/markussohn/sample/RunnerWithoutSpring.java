package lt.markussohn.sample;

import lt.markussohn.sample.domain.BasketballGame;
import lt.markussohn.sample.domain.Cavaliers;
import lt.markussohn.sample.domain.Team;
import lt.markussohn.sample.domain.Warriors;

/**
 * @author the-markussohn
 *         2018-06-26.
 */
public class RunnerWithoutSpring {
    public static void main(String[] args) {
        Team cavs = new Cavaliers();
        Team gsw = new Warriors();
        BasketballGame bGame = new BasketballGame(cavs, gsw);
        bGame.play();
    }
}
