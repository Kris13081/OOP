package WorkingWithAbstractionEX.jediGalaxy;

public class Galaxy {
    private Field field;
    private Jedi jedi;
    private Evil evil;

    public Galaxy(Field field) {
        this.field = field;
        jedi = new Jedi();
        evil = new Evil();
    }

    public int moveJedi(int rowJedi, int colJedi) {
        return jedi.move(rowJedi, colJedi, field);
    }

    public void moveEvil(int rowEvil, int colEvil) {
        evil.move(rowEvil, colEvil, field);
    }
}
