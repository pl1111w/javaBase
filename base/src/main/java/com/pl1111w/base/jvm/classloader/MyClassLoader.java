package jvm.classloader;

import jdk.swing.interop.SwingInterOpUtils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @title: pl1111w
 * @description:
 * @author: Kris
 * @date 2023/7/23 18:16
 */
public class MyClassLoader {

    public static void main(String[] args) throws ClassNotFoundException {
        CustomerClassLoader classLoader = new CustomerClassLoader();
        Class<?> test = classLoader.loadClass("Player");
        Class<?> test2 = classLoader.loadClass("Player");
        System.out.println(test.getClassLoader());
        System.out.println(test == test2);
    }


}

class CustomerClassLoader extends ClassLoader {
    @Override
    protected Class<?> findClass(String name) {
        String path = "F:\\maven_repository\\" + name + ".class";
        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            Files.copy(Paths.get(path), outputStream);

            byte[] bytes = outputStream.toByteArray();
            return defineClass(name, bytes, 0, bytes.length);
        } catch (ClassFormatError | IOException classFormatError) {
            classFormatError.printStackTrace();
        }
        return null;
    }
}
