package ioFile;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * @title: pl1111w
 * @description:
 * @author: Kris
 * @date 2021/11/28 20:53
 */
public class FilesTest {

    public static void main(String[] args) throws IOException {
        File file = new File("hello.txt");
        System.out.println(file.getName());
        File file1 = new File("F:\\codes\\base","hello/Package");
        System.out.println(file1.getPath());
        File file2 = new File(file1,"hello.txt");
        System.out.println(file2.getAbsolutePath());

        if(file.exists()){
            System.out.println("file is exist");
        }else {
            file.createNewFile();
            System.out.println(file.getName());
            System.out.println(file.length());
            System.out.println(new Date(file.lastModified()));
            System.out.println(file.canWrite());
        }

        boolean mkdir = file1.mkdir();
        boolean mkdirs = file1.mkdirs();
        if(!mkdir){
            System.out.println("创建失败");
        }
        else if(mkdirs){
            System.out.println("创建成功："+mkdirs);
        }

        System.out.println("父级目录："+ file2.getParent());

    }
}

