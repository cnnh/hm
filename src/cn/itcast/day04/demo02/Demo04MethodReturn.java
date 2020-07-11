package cn.itcast.day04.demo02;

public class Demo04MethodReturn {
    public static void main(String[] args) {
        System.out.println("getsum方法出来的值是"+getsum(154,333));
        System.out.println("==============");
        prinsum(887,33);
    }
    public  static int getsum(int a,int b){
      int  result = a+b;
      return result;
    }
    public  static  void prinsum(int a,int b){
        int result= a+b;
        System.out.println("这里是prinsum方法输出的值"+result);
    }

}
