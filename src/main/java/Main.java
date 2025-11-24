public class Main {
  public static void main(String[] args) {
    ModArrayList<Integer> modList = new ModArrayList<>();
    modList.add(1);
    modList.add(56);
    modList.add(13);
    modList.add(22);
    System.out.println(modList.getUsingMod(5));
    System.out.println(modList.getUsingMod(-2));
    System.out.println(modList.getUsingMod(33));
  }
}
