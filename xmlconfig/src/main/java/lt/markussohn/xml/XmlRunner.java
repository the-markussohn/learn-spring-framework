package lt.markussohn.xml;

import lt.markussohn.xml.domain.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author the-markussohn
 *         2018-06-26.
 */
public class XmlRunner {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        Evaluator evaluator = ctx.getBean("evaluator", StyleEvaluator.class);
        evaluator.evaluate();

        for (String name :
                ctx.getBeanDefinitionNames()) {
            System.out.println("Bean " + name);
        }
    }
}
