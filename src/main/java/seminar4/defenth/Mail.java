package seminar4.defenth;

public class Mail implements Armor{

    @Override
    public int defense() {
        return 10;
    }
    @Override
    public String toString() {
        return String.format("Mail: %d", defense());
    }
}
