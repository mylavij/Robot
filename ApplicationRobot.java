import java.awt.*;
import java.awt.event.InputEvent;
public class ApplicationRobot{

    public static void main(String[] args) throws Exception{
        Robot wally = new Robot();
        wally.mouseMove(10, 1050);
        wally.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        wally.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        wally.mouseMove(80, 880);
        wally.mousePress(InputEvent.BUTTON1_DOWN_MASK);
    }







}