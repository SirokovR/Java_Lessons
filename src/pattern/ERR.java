package pattern;

public class ERR implements Subscriber{
    @Override
    public void notifySubscriber(String event) {
        System.out.println("ERR news is transmitting. TV: Weather : " + event);
        System.out.println("ERR news is transmitting.WEB: Weather : " + event);
        System.out.println("ERR news is transmitting. RAdio: Weather : " + event);

    }
}
