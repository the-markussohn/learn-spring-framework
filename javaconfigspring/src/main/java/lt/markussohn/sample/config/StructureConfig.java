package lt.markussohn.sample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * @author the-markussohn
 *         2018-06-26.
 */
@Configuration
public class StructureConfig {
    @Bean
    public DataSource dataSource() {
        return new DriverManagerDataSource();
    }
}
