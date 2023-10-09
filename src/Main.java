
import java.io.File;
import java.io.IOException;
import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Baby b1 = new Baby();
        Child c1 = new Child();
        Teen t1 = new Teen();
        Adult a1 = new Adult();
        Old o1 = new Old();
        Person p1 = new Person();

        RunGame(b1, c1, t1, a1, o1, p1);

    }

    public static void RunGame(Baby b1, Child c1, Teen t1, Adult a1, Old o1, Person p1) {
        Scanner scan = new Scanner(System.in);
        boolean load = false;

        System.out.println("Would you like to Load the last save?  (y/n)");
        String ans = scan.nextLine();

        if (ans.equals("y") || ans.equals("Y")) {
            p1 = p1.loader(p1);
            load = true;

        } else {
            File Person = new File("Person.XML");
            Person.delete();

            System.out.println("Whats your name? :)");
            b1.setName(scan.nextLine());
            p1.setAge("baby");

        }

        switch (p1.getAge()) {
            case "baby":
                do {

                    b1.energyLimit();
                    b1.moneyLimit();
                    b1.moodLimit();
                    b1.setAge("baby");
                    if (load) {
                        b1.setAge(p1.getAge());
                        b1.setEnergy(p1.getEnergy());
                        b1.setMoney(p1.getMoney());
                        b1.setMood(p1.getMood());
                        b1.setName(p1.getName());
                        load = false;
                    }

                    System.out.println("Age: Baby     " + b1.display());
                    System.out.println("Energy: " + b1.getEnergy() + "       1.Eat         4.Poop");
                    System.out.println("Money:  " + b1.getMoney() + "       2.Sleep       5.Save");
                    System.out.println("Mood:   " + b1.getMood() + "       3.Cry");

                    System.out.println("How would you like to spend your time?");
                    int choice = scan.nextInt();

                    switch (choice) {
                        case 1:
                            b1.eat();
                            break;

                        case 2:
                            b1.sleep();
                            break;

                        case 3:
                            b1.cry();
                            break;

                        case 4:
                            b1.poop();
                            break;
                        case 5:
                            b1.Save(b1);
                            System.out.println("Game saved :)");
                            break;

                        case 7:
                            b1.test();
                            break;
                    }
                } while (b1.time < 7);

                p1.setAge("child");
            case "child":
                System.out.println("\n\nYou've grown!");
                c1.time = 0;
                c1.setName(b1.getName());
                if (load) {
                    c1.setAge(p1.getAge());
                    c1.setEnergy(p1.getEnergy());
                    c1.setMoney(p1.getMoney());
                    c1.setMood(p1.getMood());
                    c1.setName(p1.getName());
                    load = false;
                }

                do {
                    c1.energyLimit();
                    c1.moneyLimit();
                    c1.moodLimit();
                    c1.setAge("child");

                    System.out.println("Age: Child     " + c1.display());
                    System.out.println("Energy: " + c1.getEnergy() + "       1.Eat         4.Play");
                    System.out.println("Money:  " + c1.getMoney() + "       2.Sleep       5.Save");
                    System.out.println("Mood:   " + c1.getMood() + "       3.Cry");

                    System.out.println("How would you like to spend your time?");
                    int choice = scan.nextInt();

                    switch (choice) {
                        case 1:
                            c1.eat();
                            break;

                        case 2:
                            c1.sleep();
                            break;

                        case 3:
                            c1.cry();
                            break;

                        case 4:
                            c1.play();
                            break;

                        case 5:
                            c1.Save(c1);
                            System.out.println("Game saved :)");
                            break;

                        case 7:
                            c1.test();
                            break;
                    }
                } while (c1.time < 7);

                p1.setAge("teen");
            case "teen":
                System.out.println("\n\nYou're getting bigger already");
                t1.time = 0;
                t1.setName(c1.getName());
                if (load) {
                    t1.setAge(p1.getAge());
                    t1.setEnergy(p1.getEnergy());
                    t1.setMoney(p1.getMoney());
                    t1.setMood(p1.getMood());
                    t1.setName(p1.getName());
                    load = false;
                }

                do {
                    t1.energyLimit();
                    t1.moneyLimit();
                    t1.moodLimit();
                    t1.setAge("teen");

                    System.out.println("Age: Teen     " + t1.display());
                    System.out.println("Energy: " + t1.getEnergy() + "       1.Eat          4.Work");
                    System.out.println("Money:  " + t1.getMoney() + "       2.Sleep        5.Shop");
                    System.out.println("Mood:   " + t1.getMood() + "       3.Study        6.Save");

                    System.out.println("How would you like to spend your time?");
                    int choice = scan.nextInt();

                    switch (choice) {
                        case 1:
                            t1.eat();
                            break;

                        case 2:
                            t1.sleep();
                            break;

                        case 3:
                            t1.study();
                            break;

                        case 4:
                            t1.work();
                            break;

                        case 5:
                            t1.shop();
                            break;

                        case 6:
                            t1.Save(t1);
                            System.out.println("Game saved :)");
                            break;
                        case 7:
                            t1.test();
                            break;
                    }
                } while (t1.time < 7);
                p1.setAge("adult");
            case "adult":
                System.out.println("\n\nBoss makes a dollar I make a dime");
                a1.time = 0;
                a1.setName(c1.getName());
                if (load) {
                    a1.setAge(p1.getAge());
                    a1.setEnergy(p1.getEnergy());
                    a1.setMoney(p1.getMoney());
                    a1.setMood(p1.getMood());
                    a1.setName(p1.getName());
                    load = false;
                }

                do {
                    a1.energyLimit();
                    a1.moneyLimit();
                    a1.moodLimit();
                    a1.setAge("adult");

                    System.out.println("Age: Adult    " + a1.display());
                    System.out.println("Energy: " + a1.getEnergy() + "       1.Eat          4.Work");
                    System.out.println("Money:  " + a1.getMoney() + "       2.Sleep        5.Shop");
                    System.out.println("Mood:   " + a1.getMood() + "       3.hobby        6.Save");

                    System.out.println("How would you like to spend your time?");
                    int choice = scan.nextInt();

                    switch (choice) {
                        case 1:
                            a1.eat();
                            break;

                        case 2:
                            a1.sleep();
                            break;

                        case 3:
                            a1.hobby();
                            break;

                        case 4:
                            a1.work();
                            break;

                        case 5:
                            a1.shop();
                            break;

                        case 6:
                            a1.Save(a1);
                            System.out.println("Game saved :)");
                            break;
                        case 7:
                            a1.test();
                            break;
                    }
                } while (a1.time < 7);
                p1.setAge("old");
            case "old":
                System.out.println("\n\nOOHH, my back!");
                o1.time = 0;
                o1.setName(c1.getName());
                if (load) {
                    o1.setAge(p1.getAge());
                    o1.setEnergy(p1.getEnergy());
                    o1.setMoney(p1.getMoney());
                    o1.setMood(p1.getMood());
                    o1.setName(p1.getName());
                    load = false;
                }

                do {
                    o1.energyLimit();
                    o1.moneyLimit();
                    o1.moodLimit();
                    o1.setAge("old");

                    System.out.println("Age: Old      " + o1.display());
                    System.out.println("Energy: " + o1.getEnergy() + "       1.Eat          4.tv");
                    System.out.println("Money:  " + o1.getMoney() + "       2.Sleep        5.Shop");
                    System.out.println("Mood:   " + o1.getMood() + "       3.knit         6.Save");

                    System.out.println("How would you like to spend your time?");
                    int choice = scan.nextInt();

                    switch (choice) {
                        case 1:
                            o1.eat();
                            break;

                        case 2:
                            o1.sleep();
                            break;

                        case 3:
                            o1.knit();
                            break;

                        case 4:
                            o1.tv();
                            break;

                        case 5:
                            o1.shop();
                            break;

                        case 6:
                            o1.Save(o1);
                            System.out.println("Game saved :)");
                            break;

                        case 7:
                            o1.test();
                            break;
                    }
                } while (o1.time < 7);

        }
        for (int i = 5; i > 0; i--) {
            System.out.println("---------------");
        }
        System.out.println("Well its over now");
        scan.close();
    }
}
