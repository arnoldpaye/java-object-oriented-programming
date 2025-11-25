import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    OddArrayList oddArrayList = new OddArrayList(1, 2, 3, 4, 5, 6, 7, 9, -13);

    System.out.println(oddArrayList);

    ArrayList<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(7);
    list.add(9);
    list.add(-13);
    System.out.println(list);
  }
}
