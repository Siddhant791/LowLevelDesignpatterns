package Decorator;

public class Mushroom implements Dosa{

    private Dosa dosa;

    public Mushroom(Dosa dosa){
        this.dosa = dosa;
    }

    @Override
    public String content() {
        return dosa.content() + "with mushroom ";
    }

    @Override
    public Double price() {
        return dosa.price() + 10.0;
    }
}
