import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public abstract class AbstractFileReader {
  private final Path filePath;

  protected AbstractFileReader(String filePath) {
    this.filePath = Path.of(filePath);
  }

  public String getPath() {
    return filePath.toString();
  }

  public List<String> readFile() throws IOException {
    try (var lines = Files.lines(filePath)) {
      return lines.map(this::parseLine).toList();
    }
  }

  protected abstract String parseLine(String line);
}
