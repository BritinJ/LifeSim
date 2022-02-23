public class Teen extends Person {
    public void study(){
        SubEnergy(5);
        SubMood(5);
        time += .4;
    }

    public void work(){
        SubEnergy(5);
        SubMood(5);
        AddMoney(5);
        time += .5;
    }

    public void shop(){
        SubEnergy(5);
        AddMood(5);
        SubMoney(5);
        time += .4;

    }

}
