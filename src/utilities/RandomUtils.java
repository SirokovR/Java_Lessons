package utilities;

import java.util.Random;

public class RandomUtils {
    private RandomUtils(){
        throw new RuntimeException();
    }

    public static int getRandomFromRange(int from, int to){
        return (int)(Math.random()*(to-from)+from);
    }
}
