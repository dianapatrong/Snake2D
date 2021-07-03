package snake.model;

import snake.view.Renderable;

import java.awt.*;

public class Meal extends GameObject implements Renderable {
    private int value;

    public Meal(int value, int x, int y) {
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

    @Override
    public void render(Graphics g) {
        g.setColor(Color.red);
        g.fillRect(this.getX(), this.getX(), 25, 25);
    }
}
