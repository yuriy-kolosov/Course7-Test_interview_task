import static main.task.FirstUniqueTestConstants.*;
import static main.task.FirstUniqueTests.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Тестовое техническое собеседование 04-10-2024 - Задача");
        System.out.println();
//                                                              Проверка работоспособности
        findByMethod1Test(LIST11);
        findByMethod2Test(LIST11);
        findByMethod3Test(LIST11);

        findByMethod1Test(LIST12);
        findByMethod2Test(LIST12);
        findByMethod3Test(LIST12);

        findByMethod1Test(LIST13);
        findByMethod2Test(LIST13);
        findByMethod3Test(LIST13);
        //                                                      Сравнение времени выполнения 1
        findByAllMethodsTestsComparing(LIST11, 1000000);
        findByAllMethodsTestsComparing(LIST12, 1000000);
        findByAllMethodsTestsComparing(LIST13, 1000000);

    }

}
