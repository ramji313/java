import java.util.Random;

public class math {
    public static void main(String[] args) {
        Random ra = new Random();
        int a = ra.nextInt(10);
        int b = ra.nextInt(20);
        int c = 64;
        System.out.println("A value: "+a);
        System.out.println("B value: "+b);
        System.out.println(Math.cbrt(c));
        System.out.println(Math.sqrt(a));
        System.out.println(Math.max(a, b));
        System.out.println(Math.min(a, b));
        System.out.println(Math.pow(a, b));
        double d = 6.77;
        double h = 8.77;
        System.out.println(Math.ceil(d));
        System.out.println(Math.floor(h));






    }
    
}
