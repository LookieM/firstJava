import java.util.Arrays;

public class Table {
    public static void main(String[] args) {
        //int [] table = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        //int [] table = {1, 2, 4, 3, 5, 6, 7, 8, 9, 10};
        int [] table = {8, 3, 1, 2, 4, 6, 9, 7, 10, 5};
        int temp;
        int counter = 0;
        boolean isSorted = true;

        System.out.println("Before: ");
        System.out.println(Arrays.toString(table));

        for (int i = 0; i < (table.length - 1) && isSorted; i++ ) {
            isSorted = false;
            counter++;
            for (int j = 0 ; j < (table.length - 1 - i); j++ ) {
                counter++;
                if (table[j] > table[j+1]) {
                    temp = table[j];
                    table[j] = table[j + 1];
                    table[j + 1] = temp;
                    counter++;
                    isSorted = true;
                }
            }
        }

        System.out.println("After: ");
        System.out.println(Arrays.toString(table));
        System.out.println("Counter: " + counter);
    }
}
