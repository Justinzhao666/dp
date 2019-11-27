import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        InputStream in = Main.class.getClassLoader().getResource("config/application.properties");
        properties.load(in);
        System.out.println(properties.getProperty("a"));
    }
}
