public class Main {
    public static void main(String[] args) {
        int i1 = 10;
        int i2 = 20;
        float f1 = 4.5F;
        float f2 = 3.5F;
        double d1 = 59.6;
        char c1 = 120;
        char c2 = 121;
        String s1 = "Fulano";
        String s2 = "Fulano";
        String s3 = "Ciclano";
        boolean b1 = true;
        boolean b2 = false;
        long l1 = 1597L;
        long l2 = 8997L;
        byte y1 = 1;
        short h1 = 25;
        System.out.println("i1 == i2 " + (i1 == i2));
        System.out.println("i1 != i2 " + (i1 != i2));
        System.out.println("i1 > i2 " + (i1 > i2));
        System.out.println("i1 <= i2 " + (i1 <= i2));
        System.out.println("f1 == i2 " + (f1 == f2));
        System.out.println("f1 != f2 " + (f1 != f2));
        System.out.println("f1 >= i2 " + (f1 >= f2));
        System.out.println("i1 < i2 " + (f1 < f2));
        System.out.println("c1 == c2 " + (c1 == c2));
        System.out.println("c1 != c2 " + (c1 != c2));
        System.out.println("c1 > c2 " + (c1 > c2));
        System.out.println("c1 <= c2 " + (c1 <= c2));
        System.out.println("s1 == s2 " + (s1 == s2));
        System.out.println("s1 == s3 " + (s1 == s3));
        System.out.println("s1 != s2 " + (s1 != s2));
        System.out.println("b1 == b2 " + (b1 == b2));
        System.out.println("b1 == b2 " + (b1 != b2));
        System.out.println("i2 > f1 " + ((float)i2 > f1));
        System.out.println("d1 == h1 " + (d1 == (double)h1));
        System.out.println("l1 == i2 " + (l1 == (long)i2));
        System.out.println("l2 >= i1 " + (l2 != (long)i1));
        System.out.println("y1 != h1 " + (y1 > h1));
    }
}