public class Old extends Person{

    public void knit(){
        AddMood(5);
        time += .25;
    }

    public void tv(){
        AddMood(5);
        time += .25;
    }

    public void shop(){
        SubEnergy(5);
        AddMood(5);
        SubMoney(5);
        time += .4;
    }

}
