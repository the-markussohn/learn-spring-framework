package lt.markussohn.services.impl;

import lt.markussohn.services.MessageOfTheDayService;

public class MessageOfTheDayServiceImpl implements MessageOfTheDayService {

    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String getTodaysMessage() {
        return this.message;
    }
}
