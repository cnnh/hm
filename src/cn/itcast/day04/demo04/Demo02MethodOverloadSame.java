package cn.itcast.day04.demo04;
/*
题目要求：
比较两个数据是否对等
参数类型分别为两个byte类型，两个shor类型，两个int类型，两个long类型，并在    main方法中进行测试。
 */
public class Demo02MethodOverloadSame {
    public static void main(String[] args) {
    byte a =20;
    byte b =13;
        System.out.println(isSame(a,b));
        System.out.println(isSame((short) 20,(short) 20));
    }
    public  static  boolean isSame(byte a ,byte b){
        System.out.println("两个byte");
        boolean same;
        if(a==b){
            same=true;
        }else
        {
            same=false;
        }
        return same;

    }
    public  static  boolean isSame(short a ,short b){
        System.out.println("两个short");
        boolean same= a==b?true:false;
        return same;

    }
    public  static  boolean isSame(int a ,int b){
        System.out.println("两个int");
        return a==b;

    }
    public  static  boolean isSame(long a ,long b){
        System.out.println("两个long");
       if(a==b){
        return true;
       }else {
           return false;
       }
    }


}
