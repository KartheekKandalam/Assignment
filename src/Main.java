import java.util.*;
public class Main {
    public static void main(String[] args){
        String s;
        int choice,x,x1;
        String Name;
        int ID,AccountNo;
        System.out.println("enter your name,Id and AccountNo");
        Scanner s10=new Scanner (System.in);
        Name=s10.nextLine();
        ID=s10.nextInt();
        AccountNo=s10.nextInt();
        System.out.println("Enter Bank Name");
        Scanner s1=new Scanner(System.in);
        s=s1.nextLine();
        if(s.equals("SBI") || s.equals("sbi")) {

            System.out.println("1.withdraw 2.deposit 3.RateOfInterest");
            Scanner s2 = new Scanner(System.in);
            choice = s2.nextInt();
            switch (choice) {
                case (1):
                    System.out.println("enter the amount to be withdrawn");
                    Scanner s3 = new Scanner(System.in);
                    x = s3.nextInt();
                    System.out.println(x);
                    SBI ob1 = new SBI();
                    ob1.withdraw();
                    break;
                case (2):
                    System.out.println("enter the amount to be deposit");
                    Scanner s4 = new Scanner(System.in);
                    x1 = s4.nextInt();
                    System.out.println(x1);
                    SBI ob2 = new SBI();
                    ob2.deposit();
                    break;
                case (3):
                    SBI ob3 = new SBI();
                    ob3.setSbiROI(7);
                    System.out.println(ob3.getSbiROI()+"%");
                    break;
            }
        }
        else if(s.equals("Andhra") || s.equals("andhra")){
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
                    ob1.withdraw();
                    break;
                case (2):
                    System.out.println("enter the amount to be deposit");
                    Scanner s7 = new Scanner(System.in);
                    x1 = s7.nextInt();
                    System.out.println(x1);
                    Andhra ob2 = new Andhra();
                    ob2.deposit();
                    break;
                case (3):
                    Andhra ob3 = new Andhra();
                    ob3.setAndhraROI(6);
                    System.out.println(ob3.getAndhraROI()+"%");
                    break;
            }







            }

        }
    }

