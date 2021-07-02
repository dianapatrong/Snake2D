package snake.model;

public class Meal extends GameObject{
    private int value;

    public Meal(int x, int y, int value) {
        super(x, y);
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public void update() {

    }
}
