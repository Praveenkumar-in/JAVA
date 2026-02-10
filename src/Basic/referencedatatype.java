package Basic;

import java.awt.*;
public class referencedatatype {

    static void main(String[] args) {

        Point p1= new Point(6,7);
       Point p2 = p1;


       System.out.println(p2);
       p1.x=5;
        System.out.println(p1);

        System.out.println(p2);
    }
}
