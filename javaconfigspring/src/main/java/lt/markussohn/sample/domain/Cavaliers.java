package lt.markussohn.sample.domain;

import org.springframework.stereotype.Component;

/**
 * @author the-markussohn
 *         2018-06-26.
 */
@Component
public class Cavaliers implements Team {
    @Override
    public String getName() {
        return "Cleveland Cavaliers";
    }
}
