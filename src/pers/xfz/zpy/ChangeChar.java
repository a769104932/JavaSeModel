package pers.xfz.zpy;

/**
 * 2 * @Author: 卢广
 * 3 * @Date: 2021/1/28 15:48
 * 4 * 转义字符：转义就是让程序去识别，吧特殊字符当成特殊处理
 */

public class ChangeChar {
    public static void main(String[] args) {

        // \t 制表符:在后面留一个空格
        System.out.println("我是一个"+"\t"+"帅哥");

        // \n换行符:程序另起一行打印
        System.out.println("我是一个"+"\n"+"帅哥");

        // \\显示一个\
        System.out.println("我是一个"+"\\"+"帅哥");

        // \"显示一个"
        System.out.println("我是一个"+"\""+"帅哥");

        // \'显示一个'
        System.out.println("我是一个"+"\'"+"帅哥");

        // \r 回车符
        System.out.println("我是一个"+"\r"+"帅哥");

    }
}
