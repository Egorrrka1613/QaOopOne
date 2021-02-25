import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Operation {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String userWrite;
        while (true) {
            userWrite = reader.readLine();

            String[] arrayValue = userWrite.split(" ");

            String strFirst = arrayValue[0];
            String operation = arrayValue[1];
            String strSecond = arrayValue[2];

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