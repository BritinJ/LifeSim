public class Baby extends Person {

    public void cry(){
        SubMood(5);
        SubEnergy(5);
        time += .25;
    }

    public void poop(){
        SubMood(5);
        time += .25;
    }


}