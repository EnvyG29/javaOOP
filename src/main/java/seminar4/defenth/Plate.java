package seminar4.defenth;

public class Plate implements Armor{
    @Override
    public int defense() {
        return 15;
    }
    @Override
    public String toString() {
        return String.format("Plate: %d", defense());
    }
}
