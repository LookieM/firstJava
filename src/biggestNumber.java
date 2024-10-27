import java.util.Random;

public class biggestNumber {

    public static void main(String[] args) {
        int smallest = 101;
        int biggest = 0;
        Random rand = new Random();
        for(int i = 0; i < 10; i++) {
            int nxt = rand.nextInt(100);
            if (nxt < smallest) {
                smallest = nxt;
            }
            if (nxt > biggest) {
                biggest = nxt;
            }
            System.out.print(nxt);
            System.out.print(", ");
        }
        System.out.println(" ");
        System.out.println("Biggest number is " + biggest);
        System.out.println("Smallest number is " + smallest);
    }

}
