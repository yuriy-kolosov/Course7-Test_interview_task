package main.task;

import java.util.List;

import static main.task.FirstUnique.*;

public class FirstUniqueTests {

    public static void findByMethod1Test(List<Integer> list) {
        System.out.println("Исходная коллекция = " + list);
        findByMethod1(list);
        System.out.println("Method1: результат выполнения = " + findByMethod1(list));
        System.out.println();
    }

    public static void findByMethod2Test(List<Integer> list) {
        System.out.println("Исходная коллекция = " + list);
        findByMethod1(list);
        System.out.println("Method2: результат выполнения = " + findByMethod1(list));
        System.out.println();
    }

    public static void findByMethod3Test(List<Integer> list) {
        System.out.println("Исходная коллекция = " + list);
        findByMethod1(list);
        System.out.println("Method3: результат выполнения = " + findByMethod1(list));
        System.out.println();
    }

    public static void findByAllMethodsTestsComparing(List<Integer> list, int interval) {
        long startTime;
        long endTime;

        System.out.println(list);
        startTime = System.currentTimeMillis();
        for (int i = 0; i <= interval; i++) {
            findByMethod1(list);
        }
        endTime = System.currentTimeMillis();
        System.out.println(findByMethod1(list));
        System.out.println("Method1: время выполнения = " + (endTime - startTime) + "мс");
        startTime = System.currentTimeMillis();
        for (int i = 0; i <= interval; i++) {
            findByMethod2(list);
        }
        endTime = System.currentTimeMillis();
        System.out.println(findByMethod2(list));
        System.out.println("Method2: время выполнения = " + (endTime - startTime) + "мс");
        for (int i = 0; i <= interval; i++) {
            findByMethod3(list);
        }
        endTime = System.currentTimeMillis();
        System.out.println(findByMethod2(list));
        System.out.println("Method3: время выполнения = " + (endTime - startTime) + "мс");
        System.out.println();
    }

}
