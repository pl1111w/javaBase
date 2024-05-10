package reflection;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @title: pl1111w
 * @description:
 * @author: Kris
 * @date 2021/12/26 16:02
 */
public class ReadProperties {

    public static void main(String[] args) throws IOException {

        Properties properties = new Properties();

        ClassLoader loader = ReadProperties.class.getClassLoader();
        InputStream inputStream = loader.getResourceAsStream("config.properties");

        properties.load(inputStream);

        String name = properties.getProperty("name");
        System.out.println(name);
    }
}
