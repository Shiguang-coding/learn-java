package com.shiguang.c_upload;

import java.util.UUID;

public class Demo01UUID {
 public static void main(String[] args) {
     String string = UUID.randomUUID().toString();//生成一个十六进制的随机数
     System.out.println("string = " + string);
 }
}