package lt.markussohn.sample.config;

import lt.markussohn.sample.domain.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author the-markussohn
 *         2018-06-26.
 */
@Configuration
public class AppConfig {

    @Bean
    public Game game() {
        return new BasketballGame(cavs(), gsw());
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
