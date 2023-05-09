
import edu.princeton.cs.algs4.StdIn;

/**
 * Created by Aaron Amasi on 7.05.2023.
 */
public class Permutation {
    public static void main(String[] args) {
        int k = Integer.parseInt(args[0]);
        RandomizedQueue<String> randomizedQueue = new RandomizedQueue<>();
        while (!StdIn.isEmpty()) {
            randomizedQueue.enqueue(StdIn.readString());
        }
        for (int i = 0; i < k; i++) {
            System.out.println(randomizedQueue.dequeue());
        }
    }
}
