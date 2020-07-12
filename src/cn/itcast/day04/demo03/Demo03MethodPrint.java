package cn.itcast.day04.demo03;
/*
题目要求
定义一个方法，用来打印指定次数的HelloWorld
 */
public class Demo03MethodPrint {
    public static void main(String[] args) {
        ptintCount(32);
    }
    public  static  void  ptintCount(int a){
        for (int i = 0; i < a; i++) {
            System.out.println("HelloWorld"+"=="+i);
        }
    }
}
