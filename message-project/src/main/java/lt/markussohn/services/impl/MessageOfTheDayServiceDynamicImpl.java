package lt.markussohn.services.impl;

import lt.markussohn.services.MessageOfTheDayService;

import java.time.LocalDate;

/**
 * @author markussohn
 *         2018-09-19.
 */
public class MessageOfTheDayServiceDynamicImpl implements MessageOfTheDayService {

    private String message = "Hello, %s!";

    @Override
    public String getTodaysMessage() {
        LocalDate now = LocalDate.now();
        return String.format(message, now.getDayOfWeek());
    }
}
