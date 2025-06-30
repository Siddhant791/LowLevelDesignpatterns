package Decorator;

public class Paneer implements Dosa{
    private Dosa dosa;

    public Paneer(Dosa dosa){
        this.dosa = dosa;
    }

    @Override
    public String content() {
        return dosa.content() + "with paneer ";
    }

    @Override
    public Double price() {
        return dosa.price() + 20.0;
    }
}
