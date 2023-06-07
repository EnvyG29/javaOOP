package seminar4.defenth;

public class Leather implements Armor{
    @Override
    public int defense() {
        return 5;
    }
    @Override
    public String toString() {
        return String.format("Leather: %d", defense());
    }
}
