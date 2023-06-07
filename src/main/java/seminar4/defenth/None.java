package seminar4.defenth;

public class None implements Armor{
    @Override
    public int defense() {
        return 0;
    }
    @Override
    public String toString() {
        return String.format("None: %d", defense());
    }
}
