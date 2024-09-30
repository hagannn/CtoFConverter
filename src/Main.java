import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static int getC(String prompt) {
        InputStreamReader sr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(sr);
        int temp = 0;
        boolean correctInput = false;
        do {
            try {
                System.out.print(prompt);
                String raw_input = br.readLine();
                temp = Integer.parseInt(raw_input);
                correctInput = true;

            } catch (Exception e) {
                System.out.println("Invalid number try again");
            }
        } while (!correctInput);

        return temp;
    }

    static int convertToF(int temp) {
        return (temp * 9/5) + 32;
    }

    public static void main(String[] args) {
        int tempC = getC("Enter Temperture in C: ");
        System.out.println("Temperture in F: " + convertToF(tempC));
    }
}
