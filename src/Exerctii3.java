public class Exerctii3 {

    public static void main(String[] args) {
        int a = 19;
        int b = 0;
        try {
            System.out.println(divide(a, b));
        } catch (Nusepoateimparti e) {

        }
    }

    public static int divide(int a, int b) throws Nusepoateimparti {
        if(b==0) {
            throw new Nusepoateimparti();
        } else {
            return a/b;
        }
    }
}
