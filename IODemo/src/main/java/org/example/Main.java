package org.example;

import java.io.File;
import java.io.IOException;

//找出G盘下的WeChat.exe文件
public class Main {
    public static void main(String[] args) throws Exception {
        searchFile(new File("G:/"),"WeChat.exe");

    }

    /**
     * 在目录下搜索某个文件
     * @param dir
     * @param fileName
     */
    public static void searchFile(File dir,String fileName) throws Exception {
        //1.把非法情况拦截
        if (dir==null||!dir.exists()||dir.isFile()){
            return;
        }
        //2.dir存在且一定是目录对象
        //获取当前目录下的全部一级对象
        File[] files = dir.listFiles();
        //3.判断当前目录下是否存在一级文件对象，以及是否可以拿到一级文件对象
        if (files!=null&&files.length>0){
            //4.遍历全部一级文件对象
            for (File f:files) {
                //5.判断文件是文件还是文件夹
                if (f.isFile()){
                    //是文件，判断文件名是否是目标文件名
                    if (f.getName().equals(fileName)){
                        System.out.println(f.getAbsolutePath());
                        Runtime runtime = Runtime.getRuntime();
                        runtime.exec(f.getAbsolutePath());
                    }
                }
                else {
                    //是文件夹，继续重复这个过程(递归)
                    searchFile(f,fileName);
                }
            }
        }

    }
}
