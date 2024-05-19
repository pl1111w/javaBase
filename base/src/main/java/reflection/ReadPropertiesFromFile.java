package reflection;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @title: pl1111w
 * @description: 反射获取配置文件信息
 * @author: Kris
 * @date 2021/12/26 16:02
 */
public class ReadPropertiesFromFile {

    public static void main(String[] args) throws IOException {

        Properties properties = new Properties();

        ClassLoader loader = ReadPropertiesFromFile.class.getClassLoader();
        InputStream inputStream = loader.getResourceAsStream("reflection/config.properties");

        properties.load(inputStream);

        String name = properties.getProperty("name");
        System.out.println(name);
    }
}
