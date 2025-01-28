package StringProblems;

public class StringImmutable {
    public static void main(String[] args) {
        String a = "abc";
        String b = "def";

        System.out.println(a.concat(b));
        System.out.println(a);
        String c = new String();
        String d = new String();
        d= "ddddd";
        c= "cccc";
        System.out.println(c.concat(d));
        System.out.println(c);
        System.out.println(d);
        String e = "this is a new code" ;
        String f[]= e.split(" ");
        for (String x:f)
        {
            System.out.println(x);
            System.out.println(f[1]);

        }


    }
}