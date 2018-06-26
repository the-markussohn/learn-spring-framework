package lt.markussohn.xml.domain;

import lt.markussohn.xml.utils.ColorPicker;

/**
 * @author the-markussohn
 *         2018-06-26.
 */
public class RightSock implements Sock {
    @Override
    public String getColor() {
        return ColorPicker.randomColor();
    }
}
