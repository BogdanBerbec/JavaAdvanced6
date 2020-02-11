import java.util.ArrayList;

public class Exercitii2 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        list.add("Ana");
        list.add("Maria");

        String e12 = (String) list.get(1);
        System.out.println(e12.length());

    }
}
