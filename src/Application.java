import java.util.Random;
import java.util.stream.IntStream;

/**
 * Created by Rodrigo Chibana
 * Date: 07/09/2019
 **/
public class Application {

    public static void main(String[] args) {

        final int minRange = 50;
        final int maxRange = 1000000;

        final Tree tree = new Tree();

        final Random random = new Random();

        int data = 0;

        for(int i = 0; i < 50000; i++) {
            data = random.ints(minRange, maxRange + 1).findFirst().getAsInt();
            tree.insert(data);
        }

        tree.printInOrder();

    }

}
