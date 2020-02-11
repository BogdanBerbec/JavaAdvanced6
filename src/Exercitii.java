import java.util.ArrayList;
import java.util.Scanner;

public class Exercitii {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList values = new ArrayList(); /*accepta duplicate*/
        while (true) {
            String line = scanner.nextLine();
            if (line.equals("stop")) {
                break;
            }
            try {
                int x = Integer.parseInt(line);
                values.add(x);
            } catch (NumberFormatException e) {
                System.out.println("Introdu un numar");
                continue;
            }
        }
        int sum=0;
        for (int j=0; j<values.size(); j++) {
            sum = sum + (Integer) values.get(j);
            System.out.println(values.get(j));
        }
        System.out.println(sum);
    }
}