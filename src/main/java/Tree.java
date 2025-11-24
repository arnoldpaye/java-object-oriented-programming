public class Tree {
  // attributes
  double heightFt;
  double trunkDiameterInches;
  TreeType treeType;

  // behaviors
  void grow() {
    this.heightFt = this.heightFt + 10;
    this.trunkDiameterInches = this.trunkDiameterInches + 1;
  }
}
