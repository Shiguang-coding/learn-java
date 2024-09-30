package com.shiguang.classicinterface;

public class Test01_Comparable {
    public static void main(String[] args) {
        //创建一个数组
        Student01[] students = new Student01[3];
        Student01 s1 = new Student01("张三", 100);
        Student01 s2 = new Student01("李四", 60);
        Student01 s3 = new Student01("王五", 80);
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (int j = 0; j<students.length-1;j++){
            for (int i = 0;i<students.length-1-j;i++){
                //如果students[i]比students[i+1]大,就排序换位置
                if (students[i].compareTo(students[i+1])>0){
                    Student01 temp = students[i];
                    students[i] = students[i+1];
                    students[i+1] = temp;
                }
            }
        }

        //遍历
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }
}
