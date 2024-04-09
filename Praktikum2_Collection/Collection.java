import java.util.ArrayList;
import java.util.ArrayDeque;

public class Collection {
    public static void main(String[] args) {
        // Contoh penggunaan ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Semangka");
        arrayList.add("Melon");
        arrayList.add("Mangga");

        System.out.println("Isi ArrayList:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }

        // Contoh penggunaan ArrayDeque
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.add(5);
        arrayDeque.add(10);
        arrayDeque.add(25);

        System.out.println("\nIsi ArrayDeque:");
        for (int number : arrayDeque) {
            System.out.println(number);
        }
    }
}
