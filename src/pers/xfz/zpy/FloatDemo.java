package pers.xfz.zpy;

/**
 * 2 * @Author: 卢广
 * 3 * @Date: 2021/1/28 16:46
 * 4
 */
public class FloatDemo {
    public static void main(String[] arr){
        // 浮点数存在精度丢失.要注意
        double x = 1.0 / 10;
        double y = 1 / 10;
        System.out.println(x);
        System.out.println(y);
        // 如果浮点数参与运算会自动提升为浮点数
        int n = 5;
        double d = 1.2 + 24.0 / n;
        System.out.println(d);
        // 某种情况也不会出现自动提升例如两个整数进行运算
        int a = 5;
        double f = 1.5 + 24 / a;
        System.out.println(f);
        // 小数转为整数需要注意会丢舍弃小数部分
        double doubleDate = 23.9;
        int intDate = (int)doubleDate;
        System.out.println(intDate);
        // 小数通过四舍五入转为整数只需要再加上0.5强转即可
        double cc = 32.5;
        intDate = (int)(cc+0.5);
        System.out.println(intDate);
    }
}
