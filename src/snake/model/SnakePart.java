package snake.model;

import java.awt.*;

public class SnakePart extends GameObject{

    public SnakePart(int x, int y) {
        super(x, y);
    }

    @Override
    public void update() {

    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.blue);
        g.fillOval(this.getX(), this.getY(), 25, 25);
    }
}
