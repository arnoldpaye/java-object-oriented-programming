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

  // class behavior
  static void announceTree() {
    System.out.println("Look out for that " + TRUNK_COLOR + " tree!");
  }

  // getters
  public double getHeightFt() {
    return this.heightFt;
  }

  public double getTrunkDiameterInches() {
    return this.trunkDiameterInches;
  }

  public TreeType getTreeType() {
    return this.treeType;
  }

  // setters
  public void setTrunkDiameterInches(double trunkDiameterInches) {
    this.trunkDiameterInches = trunkDiameterInches;
  }

  // behaviors
  public void grow() {
    this.heightFt = this.heightFt + 10;
    this.trunkDiameterInches = this.trunkDiameterInches + 1;
  }

  public void announceTallTree() {
    if (this.heightFt > 100) {
      System.out.println("That's a tall " + this.treeType + " tree!");
    }
  }
}
