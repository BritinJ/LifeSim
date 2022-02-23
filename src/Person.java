public class Person {
    private String name;
    private int energy;
    private int mood;
    private int money;
    public static double time = 0;

    public void test(){
        time += 7;
    }

    public Person(){
       energy = 0;
       mood = 0;
       money = 0;
       this.name = "";

    }

    public void energyLimit(){
        if (energy > 20 ){energy = 20;}
        if (energy < 0){energy = 0;}
    }
    public void moodLimit(){
        if (mood > 20){mood = 20;}
        if (mood < 0){mood = 0;}
    }
    public void moneyLimit(){
        if (money< 0) money = 0;
    }

    public void AddEnergy(int AddE){
        energy += AddE;
    }
    public void SubEnergy(int SubE){
        energy -= SubE;
    }


    public void AddMood(int AddMood){
        mood += AddMood;
    }
    public void SubMood(int SubMood){
        mood -= SubMood;
    }


    public void AddMoney(int AddMoney){
        money += AddMoney;
    }
    public void SubMoney(int SubMoney){
        money += SubMoney;
    }


    public void eat(){
        AddEnergy(5);
        AddMood(5);
        time += .25;
    }

    public void sleep(){
        AddEnergy(5);
        AddMood(5);
        time += .4;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getMood() {
        return mood;
    }

    public void setMood(int mood) {
        this.mood = mood;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }



    public String display(){
        return "Day: "+time+"    Name: "+getName();

    }


    


}
