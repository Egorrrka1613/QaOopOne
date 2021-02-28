import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Для выхода из цикла подать на вход quit
 * Ввод значений и операторов реализован в формате "Х(пробел)оператор(пробел)Y"
 * Чуть попозже разберусь с регулярками и переделаю на нормальную проверку корректного ввода
 */

public class Operation {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String userWriteInConsole;

        while (true) {
            userWriteInConsole = reader.readLine();

            String[] arrayValue = userWriteInConsole.split(" ");

            System.out.println(arrayValue.length + " Длинна массива");

            if (arrayValue.length != 3) {

                if (arrayValue[0].equals("quit")) {
                    break;
                }

                System.out.println("Пожалуйста введите значения и операцию в формате:\n"
                        + "\"значаение1 пробел оператор пробел значение2\".\n" +
                        "Для выхода из цикла введите \"quit\".");
                continue;
            }


            String strFirst = arrayValue[0];
            String operation = arrayValue[1];
            String strSecond = arrayValue[2];

            if ((!operation.equals("+")) && (!operation.equals("-")) && (!operation.equals("/")) && (!operation.equals("*"))) {
                System.out.println("Доступные операторы: + - / *.");
                continue;
            }

            int valueFirst = Integer.parseInt(strFirst);
            int valueSecond = Integer.parseInt(strSecond);

            switch (operation) {
                case "+":
                    Addition add = new Addition();
                    add.execute(valueFirst, valueSecond);
                    break;
                case "-":
                    Subtraction sub = new Subtraction();
                    sub.execute(valueFirst, valueSecond);
                    break;
                case "*":
                    Multiplication mult = new Multiplication();
                    mult.execute(valueFirst, valueSecond);
                    break;
                case "/":
                    Division div = new Division();
                    div.execute(valueFirst, valueSecond);
                    break;

            }
        }
    }

    public void execute(int a, int b) {
        System.out.println("default value");
    }
}