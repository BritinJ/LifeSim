public class Adult extends Person{
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

    public void hobby(){
        SubEnergy(5);
        AddMood(5);
        time += .25;
    }

}
