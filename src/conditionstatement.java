//import java.awt.*;
//
//public class premitivedt {
//    static void main(String[] args) {
//        int a= 1;
//        int b= a;
//        System.out.println(a);
//        System.out.println(b);
//        a=4;
//        System.out.println(a);
//        System.out.println(b);
//    }
//}
//
//public class referencedt {
//    static void main(String[] args) {
//
//        Point p1= new Point(6,7);
//       Point p2 = p1;
//
//
//       System.out.println(p2);
//       p1.x=5;
//        System.out.println(p1);
//
//        System.out.println(p2);
//    }
//}
//
//public class operator{
//    static void main(String[] args) {
//        int a = 5;
//        int b= 5;
//
//        int c= a+b;
//        int d= a-b;
//        int e= a*b;
//        int f = a/b;
//        int g= a%b;
//
//
//        System.out.println(c);
//        System.out.println(d);
//        System.out.println(e);
//        System.out.println(f);
//        System.out.println(g);
//    }
//}

//public class uniaryidop{
//    static void main(String[] args) {
//        int a =1;
//        int b= 2;
//
//        //a++ increment op;
//       // b-- decrement op;
//
//        System.out.println(++a);
//        System.out.println(a);
//        System.out.println(--b);
//        System.out.println(b);
//
//    }
//}

//
//public class relationalop{
//    static void main(String[] args) {
//        int a =10;
//        int b= 20;
//
//
//        System.out.println(a==b);
//        System.out.println(a>b);
//        System.out.println(a!=b);
//        System.out.println(a>=b);
//        System.out.println(a<b);
//        System.out.println(a<=b);
//    }
//}
//



//public class logicalop{
//    static void main(String[] args) {
//        boolean a= true;
//        boolean b=true;
//        boolean c= false;
//        boolean d= false;
//        System.out.println(!a);
//        System.out.println(!c);
//        System.out.println(a||b);
//        System.out.println(c||d);
//        System.out.println(a||c);
//        System.out.println(a&&b);
//        System.out.println(c&&b);
//        System.out.println(a&&c);
//
//    }
//}

public class conditionstatement{
    static void main(String[] args) {
        int age = 18;
        boolean haslicense = true;

    if(age == 18){
        if (haslicense){
            System.out.println("u can drive");
        }

    }
    else-if (age >= 18){
        System.out.println("u r eligible");
        if (haslicense){
            System.out.println("u can drive");
        }
    }
    else {
            System.out.println("u r not drive");
        }
        System.out.println("code ent");
    }
}