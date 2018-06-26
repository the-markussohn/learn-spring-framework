package lt.markussohn.sample.config;

import lt.markussohn.sample.domain.BasketballGame;
import lt.markussohn.sample.domain.Game;
import lt.markussohn.sample.domain.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author the-markussohn
 *         2018-06-26.
 */
@Configuration
@ComponentScan(basePackages = {"lt.markussohn.sample.domain", "lt.markussohn.sample.config"})
public class AppConfig {

    private final DataSource dataSource;
    private final Team home;
    private final Team away;

    @Autowired
    public AppConfig(DataSource dataSource, @Qualifier("warriors") Team home, @Qualifier("cavaliers") Team away) {
        this.dataSource = dataSource;
        this.home = home;
        this.away = away;
    }

    @Bean
    public Game game() {
        BasketballGame basketballGame = new BasketballGame(home, away);
        basketballGame.setDataSource(dataSource);
        return basketballGame;
    }

}
