package com.shiguang.c_upload;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws Exception {
        //1.创建Socket对象
        Socket socket = new Socket("127.0.0.1", 6666);
        //2.创建FileInputStream,用于读取本地上的图片
//        FileInputStream fis = new FileInputStream("E:\\Idea\\io\\24.jpg");
//        FileInputStream fis = new FileInputStream("D:\\Workspace\\gitee\\learn-java\\module23\\doc\\img\\1621343384438.png");

        String projectPath = System.getProperty("user.dir");

        final String separator = File.separator;
        String path = projectPath + separator + "module23" + separator +
                "doc" + separator + "img" + separator + "1621343384438.png";

        FileInputStream fis = new FileInputStream(path);


        //3.调用getOutputStream,用于将读取过来的图片写给服务端
        OutputStream os = socket.getOutputStream();
        //4.边读边写
        byte[] bytes = new byte[1024];
        int len;
        while ((len = fis.read(bytes)) != -1) {
            os.write(bytes, 0, len);
        }

        //给服务端写一个结束标记
        socket.shutdownOutput();
        System.out.println("======以下代码是读取响应的结果======");

        //5.调用getInputStream,读取响应结果
        InputStream is = socket.getInputStream();
        byte[] bytes1 = new byte[1024];
        int len1 = is.read(bytes1);
        System.out.println(new String(bytes1, 0, len1));

        //6.关流
        is.close();
        os.close();
        fis.close();
        socket.close();
    }
}