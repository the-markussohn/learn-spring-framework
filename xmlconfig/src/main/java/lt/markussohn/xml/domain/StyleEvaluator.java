package lt.markussohn.xml.domain;

/**
 * @author the-markussohn
 *         2018-06-26.
 */
public class StyleEvaluator implements Evaluator {

    private Sock rightSock;
    private Sock leftSock;

    public StyleEvaluator() {
    }

    public StyleEvaluator(Sock rightSock, Sock leftSock) {
        this.rightSock = rightSock;
        this.leftSock = leftSock;
    }

    public Sock getRightSock() {
        return rightSock;
    }

    public void setRightSock(Sock rightSock) {
        this.rightSock = rightSock;
    }

    public Sock getLeftSock() {
        return leftSock;
    }

    public void setLeftSock(Sock leftSock) {
        this.leftSock = leftSock;
    }

    @Override
    public void evaluate() {
        String rightSockColor = rightSock.getColor();
        System.out.println("RightSock is " + rightSockColor);
        String leftSockColor = leftSock.getColor();
        System.out.println("LeftSock is " + leftSockColor);
        if (areSocksMatched(rightSockColor, leftSockColor))
            System.out.println("Wonderful, your socks are matching!");
        else
            System.out.println("You got style!");
    }

    private boolean areSocksMatched(String rightSock, String leftSock) {
        return rightSock.equals(leftSock);
    }
}
