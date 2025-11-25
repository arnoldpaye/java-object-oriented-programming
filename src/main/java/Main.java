import java.util.ArrayList;
import java.util.Random;

public class Main {
  public static void addRandomNumber(ArrayList<Integer> list) {
    int originalSize = list.size();
    Random random = new Random();
    while (originalSize + 1 != list.size()) {
      int n = random.nextInt(1000);
      list.add(n);
    }
  }

  public static void main(String[] args) {
    OddArrayList oddArrayList = new OddArrayList(7);
    oddArrayList.add(1);
    oddArrayList.add(2);
    addRandomNumber(oddArrayList);
    System.out.println(oddArrayList.size());
    System.out.println(oddArrayList);

    ArrayList<Integer> arrayList = new ArrayList<>();
    arrayList.add(1);
    arrayList.add(2);
    addRandomNumber(arrayList);
    System.out.println(arrayList.size());
    System.out.println(arrayList);
  }
}
