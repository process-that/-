package org.example;

import java.io.FileOutputStream;
import java.io.IOException;



public class InputStream {
    public static void main(String[] args) {
        String filePath = "F:/test.txt";
        String content = "松下问童子，言师采药去。\n只在此山中，云深不知处。";

        try {
            // 创建FileOutputStream对象，如果文件不存在则先创建
            FileOutputStream outputStream = new FileOutputStream(filePath, true);

            // 将内容转换为字节数组
            byte[] data = content.getBytes();

            // 写入数据到文件
            outputStream.write(data);

            // 关闭流
            outputStream.close();

            System.out.println("内容已成功写入文件。");
        } catch (IOException e) {
            System.out.println("写入文件时发生错误：" + e.getMessage());
        }
    }
}