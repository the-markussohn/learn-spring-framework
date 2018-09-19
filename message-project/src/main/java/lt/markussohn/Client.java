package lt.markussohn;

import lt.markussohn.services.MessageOfTheDayService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("application.xml");
        MessageOfTheDayService helloWorld = container.getBean("messageService", MessageOfTheDayService.class);
        System.out.println(helloWorld.getTodaysMessage());
        MessageOfTheDayService dynamicHelloWorld = container.getBean("dynamicMessageService", MessageOfTheDayService.class);
        System.out.println(dynamicHelloWorld.getTodaysMessage());
        container.close();
    }
}
