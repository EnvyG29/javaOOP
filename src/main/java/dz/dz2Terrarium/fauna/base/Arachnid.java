package dz.dz2Terrarium.fauna.base;

public abstract class Arachnid extends Fauna{

    public Arachnid(String name, int movementSpeed) {
        super(name, movementSpeed);
    }

    @Override
    public String feed(){
        return "всеядные";
    }


}
