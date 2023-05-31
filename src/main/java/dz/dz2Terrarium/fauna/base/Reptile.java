package dz.dz2Terrarium.fauna.base;

public abstract class Reptile extends Fauna {

    public Reptile(String name, int movementSpeed) {
        super(name, movementSpeed);
    }

    @Override
    public String feed(){
        return "беспозвоночные, пауки, мелкие млекопитающие";
    }

}