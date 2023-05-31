package dz.dz2Terrarium.fauna.base;

public abstract class Fauna {
    protected String name;
    protected int movementSpeed;

    public Fauna(String name, int movementSpeed) {
        this.name = name;
        this.movementSpeed = movementSpeed;
    }

    protected abstract String feed();

    @Override
    public String toString() {
        return String.format("%s, Скорость передвижения: %d", name, movementSpeed);
    }
}
