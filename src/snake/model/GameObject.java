package snake.model;

import snake.view.Renderable;

public abstract class GameObject implements Renderable {
    private int x;
    private int y;

    public GameObject(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public abstract void update();

    public boolean isColliding(GameObject another){
        return (this.x == another.x && this.y == another.y);
    }
}
