package zaaadailystudy.study01;
import java.util.concurrent.TimeUnit;

public class TrafficLights {

    enum Light {
        RED, YELLOW, GREEN
    }

    public static void main(String[] args) throws InterruptedException {
        Light currentLight = Light.RED;

        while (true) {
            switch (currentLight) {
                case RED:
                    System.out.println("Red light is on.");
                    TimeUnit.SECONDS.sleep(5);
                    currentLight = Light.GREEN;
                    break;
                case GREEN:
                    System.out.println("Green light is on.");
                    TimeUnit.SECONDS.sleep(5);
                    currentLight = Light.YELLOW;
                    break;
                case YELLOW:
                    System.out.println("Yellow light is on.");
                    TimeUnit.SECONDS.sleep(2);
                    currentLight = Light.RED;
                    break;
            }
        }
    }
}  // infinite loop olusuyor, dikkat et.

