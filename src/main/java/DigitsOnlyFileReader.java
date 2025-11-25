public class DigitsOnlyFileReader extends AbstractFileReader {
  protected DigitsOnlyFileReader(String filePath) {
    super(filePath);
  }

  @Override
  protected String parseLine(String line) {
    return line.replaceAll("[^0-9]", "");
  }
}
