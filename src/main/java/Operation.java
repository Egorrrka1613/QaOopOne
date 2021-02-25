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

            System.out.println(valueFirst + " " + valueSecond + " " + operation);
        }
    }

    void execute() {
        System.out.println("null");
    }
}
