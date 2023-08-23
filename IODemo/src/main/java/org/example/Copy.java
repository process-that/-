package org.example;

import java.io.*;
import java.io.InputStream;

//文件复制
public class Copy {
    public static void main(String[] args) throws Exception {
        //复制照片
        InputStream is = new FileInputStream("C:\\Users\\hp\\Pictures\\Screenshots\\demo.png");
         //创建一个字节输出流管道与目标文件接通
        OutputStream os = new FileOutputStream("F:/idea/demo.png");
        //创建一个字节数组，负责转移字节数据
        byte[] buffer = new byte[1024];//1KB
        //从字节输入流读取数据写入到输出流
        int len;//记住每次读取了多少字节
        while ((len=is.read(buffer))!=-1){
            os.write(buffer,0,len);
        }
        os.close();
        is.close();
        System.out.println("复制完成");
    }
}
