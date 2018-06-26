package lt.markussohn.sample.config;

import lt.markussohn.sample.domain.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import javax.sql.DataSource;

/**
 * @author the-markussohn
 *         2018-06-26.
 */
@Configuration
@Import(StructureConfig.class)
public class AppConfig {

    @Bean
    public Game game(DataSource dataSource) {
        BasketballGame basketballGame = new BasketballGame(cavs(), gsw());
        basketballGame.setDataSource(dataSource);
        return basketballGame;
    }

    @Bean
    public Team cavs() {
        return new Cavaliers();
    }

    @Bean
    public Team gsw() {
        return new Warriors();
    }
}
