package com.shiguang.classicinterface;

public class Test02_Comparator {
    public static void main(String[] args) {
        //创建一个数组
        Student02[] students = new Student02[3];
        Student02 s1 = new Student02("张三", 100);
        Student02 s2 = new Student02("李四", 60);
        Student02 s3 = new Student02("王五", 80);
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        Student02 student = new Student02();

        for (int j = 0; j<students.length-1;j++){
            for (int i = 0;i<students.length-1-j;i++){
                //如果students[i]比students[i+1]大,就排序换位置
                if (student.compare(students[i],students[i+1])>0){
                    Student02 temp = students[i];
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
