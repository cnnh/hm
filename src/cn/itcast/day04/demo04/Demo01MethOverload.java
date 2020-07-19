package cn.itcast.day04.demo04;
/*
方法的重载（Overload）：多个方法的名称一样，但是参数列表不一样
只需要记住一个方法名称，就可以实现类似的多个功能
1.参数个数不同
2.参数类型不同
3.参数的多类型 顺序不同
方法重载与下类因素无关
1.与参数名称无关
2.与方法的返回值 类型无关
 */
public class Demo01MethOverload {
    public static void main(String[] args) {
        System.out.println(sum(22,44));
        System.out.println(sum(22,44,55));
        System.out.println(sum(22,44,55,3));
    }
    public  static  int sum(int a, int b){
        System.out.println("这里是2个");
        return a+b;
    }    public  static  int sum(int a, int b,int c){
        System.out.println("这里是3个");
        return a+b+c;
    }    public  static  int sum(int a, int b,int c,int d){
        System.out.println("这里是4个");
        return a+b+c+d;
    }
}
