package structural.decorator;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStream;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FileDataSource implements DataSource {

  private String fileName;

  public FileDataSource(String fileName) {
    this.fileName = fileName;
  }

  @Override
  public void writeData(String data) {
    log.info("Writing data to file: {}", this.fileName);
    File file = new File(this.fileName);
    try (OutputStream fos = new FileOutputStream(file)) {
      fos.write(data.getBytes(), 0, data.length());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Override
  public String readData() {
    char[] buffer = null;
    log.info("Reading data from file: " + this.fileName);
    File file = new File(this.fileName);
    try (FileReader reader = new FileReader(file)) {
      buffer = new char[(int) file.length()];
      reader.read(buffer);
    } catch (Exception e) {
      e.printStackTrace();
    }
    return new String(buffer);
  }
}
