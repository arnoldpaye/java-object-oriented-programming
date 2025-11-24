public class Tree {
  // attributes
  double heightFt;
  double trunkDiameterInches;
  TreeType treeType;

  // constructor
  public Tree(double heightFt, double trunkDiameterInches, TreeType treeType) {
    this.heightFt = heightFt;
    this.trunkDiameterInches = trunkDiameterInches;
    this.treeType = treeType;
  }

  // behaviors
  void grow() {
    this.heightFt = this.heightFt + 10;
    this.trunkDiameterInches = this.trunkDiameterInches + 1;
  }

  void announceTallTree() {
    if (this.heightFt > 100) {
      System.out.println("That's a tall " + this.treeType + " tree!");
    }
  }
}
