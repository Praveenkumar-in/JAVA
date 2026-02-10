package Basic;

public class conditionstatement{
    static void main(String[] args) {
        int age = 20;
        boolean haslicense = false;

    if(age == 18){
        if (haslicense){
            System.out.println("u can drive");
        }

    }
    else if (age >= 18){
        System.out.println("u r eligible");
        if (haslicense){
            System.out.println("u can drive");
        }
        else{
            System.out.println(
                    "not drive"
            );
        }
    }
    else {
            System.out.println("u r not drive");
        }
        System.out.println("code end");
    }
}