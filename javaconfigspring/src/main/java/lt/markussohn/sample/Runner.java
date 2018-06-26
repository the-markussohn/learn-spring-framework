package lt.markussohn.sample;

import lt.markussohn.sample.config.AppConfig;
import lt.markussohn.sample.domain.Game;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author the-markussohn
 *         2018-06-26.
 */
public class Runner {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        Game game = ctx.getBean("game", Game.class);
        game.play();
    }
}
