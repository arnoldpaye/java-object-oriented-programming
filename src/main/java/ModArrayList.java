import java.util.ArrayList;

public class ModArrayList<E> extends ArrayList<E> {

  public E getUsingMod(int index) {
    /* if (index >= 0 && index < super.size()) {
      return super.get(index);
    }
    int normalizedIndex = index < 0 ? index * -1 : index;

    return super.get(normalizedIndex % super.size()); */

    int validIndex = Math.abs(index) % super.size();
    return super.get(validIndex);
  }
}
