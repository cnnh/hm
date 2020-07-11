package cn.itcast.day04.demo02;

/**
 * 方法就是若干语句的功能集合
 * 参数：进入方法的数据
 * 返回值：从方法出来的数据
 * 定义方法的完整格式：
 * 修饰符 返回值类型 方法名称（参数类型 参数名称，…………）{
 *     方法体
 *     return 返回值；
 * }
 * 修饰符：public static
 * 返回值类型：方法最终产生的数据结果是什么类型
 * 方法名称：方法的名字规则和变量一样，驼峰式
 * 参数类型：进入方法的数据是什么类型
 * 参数名称：进入方法的数据对应的变量名称
 * 方法体：方法需要做的事情
 * return：1停止当前的方法。2将后面的结果数据返回只还给调用出
 * 返回值：方法执行后最终产生的数据结果
 *
 * return 后面的“返回值”，必须和方法名称前面的“返回值类型”保持一致
 */
public class Demo02MethodDefine {
    public static void main(String[] args) {
//        单独调用
//        sum(10,78);
//        打印调用
//        System.out.println(sum(44,99));
//        复制调用
        int number = sum(15,39);
        System.out.println("number"+number);
    }
    public static int sum(int a,int b){
        int resule=a+b;
        return  resule;
    }
}
