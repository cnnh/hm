package cn.itcast.day04.demo02;
/*
  有参数：小括号里有参数
  无参数：小括号里无参数
 */
public class Demo03MethodParam {
    public static void main(String[] args) {
        meth01(78,67);
        System.out.println("============");
        metho2();
    }


    public  static  void meth01(int a,int b){
        int result = a * b;
        System.out.println("结果是"+result);
    }
    public static void metho2() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World!!"+i);
        }
    }
}
