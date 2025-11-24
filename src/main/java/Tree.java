import java.awt.Color;

public class Tree {
  // class attribute
  protected static Color TRUNK_COLOR = new Color(102, 51, 0);

  // attributes
  private double heightFt;
  private double trunkDiameterInches;
  private TreeType treeType;

  // constructor
  public Tree(double heightFt, double trunkDiameterInches, TreeType treeType) {
    this.heightFt = heightFt;
    this.trunkDiameterInches = trunkDiameterInches;
    this.treeType = treeType;
  }

  // behaviors
  public void grow() {
    this.heightFt = this.heightFt + 10;
    this.trunkDiameterInches = this.trunkDiameterInches + 1;
  }

  // class behavior
  static void announceTree() {
    System.out.println("Look out for that " + TRUNK_COLOR + " tree!");
  }

  public void announceTallTree() {
    if (this.heightFt > 100) {
      System.out.println("That's a tall " + this.treeType + " tree!");
    }
  }
}
