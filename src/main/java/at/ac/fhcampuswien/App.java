package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        // input your solution here
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        // input your solution here
        System.out.println("0123456789012345678901");
        System.out.println("         __");
        System.out.println(" _(\\    |@@|");
        System.out.println("(__/\\__ \\--/ __");
        System.out.println("   \\___|----|  |   __");
        System.out.println("       \\ }{ /\\ )_ / _\\");
        System.out.println("       /\\__/\\ \\__O (__");
        System.out.println("      (--/\\--)    \\__/");
        System.out.println("      _)(  )(_");
        System.out.println("     `---''---`");
    }

    //todo Task 3
    public void sumOfLiterals(){
        // input your solution here
        char c = 'Z';

        int hexa = 0xface;

        int oct = 012;

        long test = 80L;
        int testInt = (int)test;

        float middle = 44e-1f;
        int middleInt = (int)middle;

        float five = 5.5f;
        int fiveInt = (int)five;

        double a =8.88e1;
        int aInt = (int)a;

        float f = 99.9f;
        int fInt = (int)f;

        int sum = (c + hexa + oct + testInt + middleInt + fiveInt + aInt + fInt);
        System.out.println(sum);

    }

    //todo Task 4
    public void addTwoNumbers(){
        // input your solution here
        int a;
        int b;
        Scanner scan = new Scanner(System.in);

        a = scan.nextInt();
        b = scan.nextInt();
        int sum = a + b;
        System.out.println(sum);
    }

    //todo Task 5
    public void swapTwoNumbers(){
        // input your solution here
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();

        System.out.println("Before Swap:");
        System.out.println("x: y: After Swap:");
        //System.out.println("x: " + x);
        //System.out.println("y: " + y);

        //System.out.println("Before Swap:");
        //System.out.println("x: " + x);
        //System.out.println("y: " + y);

        x = x + y;
        y = x - y;
        x = x - y;

        //System.out.println("After Swap:");
        System.out.println("x: " + x);
        System.out.println("y: " + y);

    }

    //todo Task 6
    public void compareTwoNumbers(){
        // input your solution here
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();

        if (n1 > n2) {
            System.out.println("n1: n2: n1 > n2");
        }

        else if (n1 < n2) {
            System.out.println("n1: n2: n2 > n1");
        }

        else if (n1 == n2) {
            System.out.println("n1: n2: n1 == n2");
        }
    }

    //todo Task 7
    public void ratingSalesPerson(){
        // input your solution here
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter annual Revenue: ");
        int revenue = scan.nextInt();

        if (revenue < 0 || revenue >= 100000) {
            System.out.println("Invalid Revenue");
        }
        else if (revenue < 20000 && revenue >= 0) {
            System.out.println("Poor Sales Revenue");
        }
        else if (revenue < 50000 && revenue >= 20000 ) {
            System.out.println("Average Sales Revenue");
        }
        else if (revenue < 80000 && revenue >= 50000) {
            System.out.println("Good Sales Revenue");
        }
        else if (revenue < 100000 && revenue >=80000) {
            System.out.println("Excellent Sales Revenue");
        }
        /*if (revenue < 0 || revenue >= 100000) {
            System.out.println("Invalid Revenue");
        }
        else if (revenue <= 0 && revenue < 20000) {
            System.out.println("Poor Sales Revenue");
        }
        else if (revenue <= 20000 && revenue < 50000) {
            System.out.println("Average Sales Revenue");
        }
        else if (revenue <= 50000 && revenue < 80000) {
            System.out.println("Good Sales Revenue");
        }
        else if (revenue <= 80000 && revenue < 100000) {
            System.out.println("Excellent Sales Revenue");
        } */
    }

    //todo Task 8
    public void getCommissionRate(){
        // input your solution here
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter CommissionClass: ");
        int commissionClass = scan.nextInt();

        switch (commissionClass) {
            case 1:
                System.out.println("Your Commission Rate was set to 0.01");
                break;
            case 2:
                System.out.println("Your Commission Rate was set to 0.02");
                break;
            case 3:
                System.out.println("Your Commission Rate was set to 0.03");
                break;
            case 4:
                System.out.println("Your Commission Rate was set to 0.04");
                break;
            default:
                System.out.println("Your Commission Rate was set to 0.0");
        }
    }

    //todo Task 9
    public void leapyear(){
        // input your solution here
        Scanner scan = new Scanner(System.in);
        System.out.print("Year: ");

        int year = scan.nextInt();

        if (year % 4 == 0 && year % 400 ==0) {
            System.out.println("Leapyear");
        }
        else if (year % 400 != 0) {
            System.out.println("Not a Leapyear");
        }
        else if (year % 100 == 0 && year % 400 != 0) {
            System.out.println("Not a Leapyear");
        }
    }

    //todo Task 10
    public void transposedNumbers(){
        // input your solution here
        Scanner scan = new Scanner(System.in);
        System.out.print("Number: ");

        int number = scan.nextInt();

        int variable = number; // In der Schleife: % 10 gibt immer die letzte Stelle wieder
        int transpose = 0; //Soll die umgedrehte Zahl speichern und am Ende ausgegeben werden
        int factor = 100; //da eine 3-stellige Zahl umgedreht werden soll

        /*
        Die While-Schleife arbeitet folgendermaßen:
        variable % 10 --> Letzte Stelle bleibt übrig.
        (* factor) --> Letzte Stelle wird an die "neue" umgedrehte Stelle gebracht.
        transpose speichert die finale umgedrehte Variable.
        Factor wird in 10er Schritten reduziert.
         */

        while (variable != 0) {
            transpose = (variable % 10) * factor + transpose;
            variable = variable / 10;
            factor = factor / 10;
        }
        System.out.println(transpose);
    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}