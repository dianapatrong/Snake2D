package snake.model;

import snake.view.RenderEngine;

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
        g.fillOval(this.getX()* RenderEngine.CELL_WIDTH, this.getY()*RenderEngine.CELL_HEIGHT, RenderEngine.CELL_WIDTH, RenderEngine.CELL_HEIGHT);
    }
}
