package lt.markussohn.xml.utils;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * @author the-markussohn
 *         2018-06-26.
 */
public class ColorPicker {

    private static final List<String> colors = Arrays.asList("Green", "Red", "Black", "White", "Rose", "Yellow", "Blue");

    public static String randomColor() {
        Random random = new Random();
        return colors.get(random.nextInt(colors.size()));
    }
}
