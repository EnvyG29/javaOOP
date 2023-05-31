package dz.dz2Terrarium.fauna.base;

public abstract class Amphibian extends Fauna {

    public Amphibian(String name, int movementSpeed) {
        super(name, movementSpeed);
    }

    @Override
    public String feed(){
        return "насекомые, беспозвоночные";
    }
}
