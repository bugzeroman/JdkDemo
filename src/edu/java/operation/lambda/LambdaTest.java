package edu.java.operation.lambda;

import java.util.Comparator;
import java.util.function.Consumer;

/**
 * Lambda表达式写法，
   *  不使用和使用Lambda写法的代码比较。
 *
 */
public class LambdaTest {
    public static void main(String[] args) {
        // test1();
        // test2();
        // test3();
        // test4();
        // test5();
        test6();
        // test20();
    }

    // 语法格式1：无入参，无返回值
    public static void test1() {
        // 不使用Lambda表达式
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello Java Interface 1.");
            }
        };
        r1.run();

        // 使用Lambda表达式
        Runnable r2 = () -> {
            System.out.println("Hello Java Lambda 1.");
        };
        r2.run();
    }

    // 语法格式2:一个入参，无返回值
    public static void test2() {
        // 不使用Lambda表达式
        Consumer<String> cs1 = new Consumer<String>() {
            @Override
            public void accept(String t) {
                System.out.println(t);
            }
        };
        cs1.accept("Hello Java Interface 2.");
        // 使用Lambda表达式
        Consumer<String> cs2 = (String t) -> {
            System.out.println(t);
        };
        cs2.accept("Hello Java Lambda 2.");
    }

    // 语法格式3:类型推断,可以不写参数类型
    public static void test3() {
        // 使用Lambda表达式
        Consumer<String> cs3 = (t) -> {
            System.out.println(t);
        };
        cs3.accept("Hello Java Lambda 2 upgrade to 3.");
    }

    // 语法格式4:只有一个入参，可以不写小括号()
    public static void test4() {
        // 使用Lambda表达式
        Consumer<String> cs4 = t -> {
            System.out.println(t);
        };
        cs4.accept("Hello Java Lambda 3 upgrade to 4.");
    }

    // 语法格式5:两个或以上入参，有返回值，有多条执行语句
    public static void test5() {
        // 不使用Lambda表达式
        Comparator<Integer> com1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                System.out.println(o1);
                System.out.println(o2);
                return o1.compareTo(o2);
            }
        };
        System.out.println(com1.compare(1, 2));
        // 使用Lambda表达式
        Comparator<Integer> com2 = (o1, o2) -> {
            System.out.println(o1);
            System.out.println(o2);
            return o1.compareTo(o2);
        };
        System.out.println(com2.compare(2, 1));
    }

    // 语法格式6:Lambda方法体只有一条语句，可以不写return和大括号{}
    public static void test6() {
        // 不使用Lambda表达式
        Comparator<Integer> com1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        System.out.println(com1.compare(1, 2));
        // 使用Lambda表达式
        Comparator<Integer> com2 = (o1, o2) -> o1.compareTo(o2);
        System.out.println(com2.compare(2, 1));
    }

    public static void test20() {
        // 不使用Lambda表达式
        Comparator<Integer> com1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                // TODO Auto-generated method stub
                return Integer.compare(o1, o2);
            }
        };
        int res1 = com1.compare(1, 2);
        System.out.println(res1);

        // 使用Lambda表达式
        Comparator<Integer> com2 = (o1, o2) -> Integer.compare(o1, o2);
        int res2 = com2.compare(4, 3);
        System.out.println(res2);

        // 方法引用
        Comparator<Integer> com3 = Integer::compare;
        int res3 = com3.compare(2, 3);
        System.out.println(res3);
    }

}
