package Decorator;

public class MasalaDosa implements Dosa{

    @Override
    public String content(){
        return "Masala dosa";
    }

    @Override
    public Double price(){
        return 70.0;
    }
}
