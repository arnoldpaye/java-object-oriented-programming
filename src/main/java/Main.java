import java.util.ArrayList;
import java.util.Random;

public class Main {
  public static void addRandomNumber(ArrayList<Integer> list) {
    int originalSize = list.size();
    Random random = new Random();
    while (originalSize + 1 != list.size()) {
      int n = random.nextInt(1000);

      if (list instanceof ConditionArrayList conditionArrayList) {
        while (!conditionArrayList.isEligible(n)) {
          n = random.nextInt(1000);
        }
      }

      list.add(n);
    }
  }

  public static void main(String[] args) {
    ConditionArrayList oddList = new ConditionArrayList(n -> Math.abs(n) % 2 == 1);
    oddList.add(1);
    oddList.add(2);
    addRandomNumber(oddList);
    System.out.println(oddList);

    ArrayList<Integer> eventList = new ConditionArrayList(n -> Math.abs(n) % 2 == 0);
    eventList.add(1);
    eventList.add(2);
    addRandomNumber(eventList);
    System.out.println(eventList);
  }
}
