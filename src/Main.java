import java.util.*;
public class Main {
    public static void main(String[] args) throws CustomException{
        String s;
        int choice, x, x1;
        String name;
        Scanner n = new Scanner(System.in);
        name = n.nextLine();
        check();
        System.out.println("Enter Bank Name");
        Scanner s1 = new Scanner(System.in);
        s = s1.nextLine();
        if (s.equals("SBI") || s.equals("sbi")) {
            System.out.println("1.withdraw 2.deposit 3.RateOfInterest");
            Scanner s2 = new Scanner(System.in);
            choice = s2.nextInt();
            switch (choice){
                case (1):
                    System.out.println("enter the amount to be withdrawn");
                    Scanner s3 = new Scanner(System.in);
                    x = s3.nextInt();
                    SBI ob1 = new SBI();
                    try{
                        ob1.withdraw(x);
                    }catch(CustomException ex){
                        ex.display();
                    }
                    break;
                case (2):
                    System.out.println("enter the amount to be deposit");
                    Scanner s4 = new Scanner(System.in);
                    x1 = s4.nextInt();
                    System.out.println(x1);
                    SBI ob2 = new SBI();
                    try{
                    ob2.deposit(x1);
                    }catch(CustomException ex){
                        ex.display();
                    }
                    break;
                case (3):
                    SBI ob3 = new SBI();
                    ob3.setSbiROI(7);
                    System.out.println(ob3.getSbiROI() + "%");
                    break;
            }
        } else if (s.equals("Andhra") || s.equals("andhra")) {
            System.out.println("1.withdraw 2.deposit 3.RateOfInterest");
            Scanner s5 = new Scanner(System.in);
            choice = s5.nextInt();
            switch (choice) {
                case (1):
                    System.out.println("enter the amount to be withdrawn");
                    Scanner s6 = new Scanner(System.in);
                    x = s6.nextInt();
                    System.out.println(x);
                    Andhra ob1 = new Andhra();
                    try {
                        ob1.withdraw(x);}
                    catch(CustomException ex) {
                        ex.display();
                    }
                    break;
                case (2):
                    System.out.println("enter the amount to be deposit");
                    Scanner s7 = new Scanner(System.in);
                    x1 = s7.nextInt();
                    System.out.println(x1);
                    Andhra ob2 = new Andhra();
                    try {
                        ob2.deposit(x1);
                    }catch(CustomException ex) {
                        ex.display();
                    }
                    break;
                case (3):
                    Andhra ob3 = new Andhra();
                    ob3.setAndhraROI(6);
                    System.out.println(ob3.getAndhraROI() + "%");
                    break;
            }
        }
    }

    public static void check() {

        int[] accNo = {1, 2, 3, 4, 5, 6};
        int[] pass = {100, 101, 102, 103, 104, 105};
        int a, b, a1, b1;
        Scanner g = new Scanner(System.in);
        while(true){
        System.out.println("Enter Account Number");
        a = g.nextInt();
        for (int i = 0; i < accNo.length; i++) {
                if (accNo[i] == a) {
                    a1 = i;
                    System.out.println("Enter password");
                    b = g.nextInt();
                    if (pass[a1] == b) {
                        System.out.println("Welcome");
                    }
                    else {
                        System.out.println("Password is incorrect");
                        check();
                    }

                }
        }break;
        }
    }
}

