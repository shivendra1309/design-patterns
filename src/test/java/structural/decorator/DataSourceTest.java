package structural.decorator;

import static org.junit.Assert.*;

public class DataSourceTest {
    @org.junit.Test
    public void testDecorator() throws Exception {
        DataSourceDecorator source = new CompressionDecorator(new EncryptionDecorator(new FileDataSource("test.txt")));
        source.writeData("Hello World");
        DataSourceDecorator source2 = new EncryptionDecorator(new CompressionDecorator(new FileDataSource("test.txt")));
        source2.writeData("Hello World");
        assertEquals(source.readData(), source2.readData());
    }

}
