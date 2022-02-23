import java.util.LinkedList;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Baby b1 = new Baby();
        Child c1 = new Child();
        Teen t1 = new Teen();
        Adult a1 = new Adult();
        Old o1 = new Old();

        System.out.println("Whats your name? :)");
        b1.setName(scan.next());



        do {
            b1.energyLimit();
            b1.moneyLimit();
            b1.moodLimit();

            System.out.println("\nAge: Baby     " + b1.display());
            System.out.println("Energy: "+b1.getEnergy()+"       1.Eat         4.Poop");
            System.out.println("Money:  "+b1.getMoney()+"       2.Sleep");
            System.out.println("Mood:   "+b1.getMood()+"       3.Cry");

            System.out.println("How would you like to spend your time?");
            int choice = scan.nextInt();

            switch (choice){
                case 1: b1.eat();
                break;

                case 2: b1.sleep();
                break;

                case 3: b1.cry();
                break;

                case 4: b1.poop();
                break;

                case 5: b1.test();
                break;
            }
        }
        while (b1.time < 7);

        System.out.println("You've grown!");
        c1.time = 0;
        c1.setName(b1.getName());

        do {
            c1.energyLimit();
            c1.moneyLimit();
            c1.moodLimit();

            System.out.println("\nAge: Child     " + c1.display());
            System.out.println("Energy: "+c1.getEnergy()+"       1.Eat         4.Play");
            System.out.println("Money:  "+c1.getMoney()+"       2.Sleep");
            System.out.println("Mood:   "+c1.getMood()+"       3.Cry");

            System.out.println("How would you like to spend your time?");
            int choice = scan.nextInt();

            switch (choice){
                case 1: c1.eat();
                    break;

                case 2: c1.sleep();
                    break;

                case 3: c1.cry();
                break;

                case 4: c1.play();
                break;

                case 5: c1.test();
                break;
            }
        }
        while (c1.time < 7);

        System.out.println("You're getting bigger already");
        t1.time = 0;
        t1.setName(c1.getName());



        do {
            t1.energyLimit();
            t1.moneyLimit();
            t1.moodLimit();

            System.out.println("\nAge: Teen     " + t1.display());
            System.out.println("Energy: "+t1.getEnergy()+"       1.Eat         4.Work");
            System.out.println("Money:  "+t1.getMoney()+"       2.Sleep        5.Shop");
            System.out.println("Mood:   "+t1.getMood()+"       3.Study");

            System.out.println("How would you like to spend your time?");
            int choice = scan.nextInt();

            switch (choice){
                case 1: t1.eat();
                    break;

                case 2: t1.sleep();
                    break;

                case 3: t1.study();
                    break;

                case 4: t1.work();
                    break;

                case 5: t1.shop();
                    break;
                case 6: t1.test();
                break;
            }
        }
        while (c1.time < 7);


    }


}
