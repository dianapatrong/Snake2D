package snake.model;

import java.awt.*;
import java.util.LinkedList;

public class Snake extends GameObject{
    private Direction direction;
    private boolean alive;
    private LinkedList<SnakePart> body;

    public Snake(int x, int y, int length, Direction direction) {
        super(x, y);
        this.direction = direction;
        this.alive = true;
        this.body = new LinkedList<>();
        for (int i=0; i< length; i++){
            addHead();

        }
    }

    public LinkedList<SnakePart> getBody() {
        return body;
    }

    public void setBody(LinkedList<SnakePart> body) {
        this.body = body;
    }

    @Override
    public void update() {
        addHead();
        removeLast();

        SnakePart head = this.body.getFirst();
        for (SnakePart p: this.body){
            if (p != head){
                if (head.isColliding(p)){
                    this.alive = false;
                    return;
                }
            }
        }
    }

    private void addHead(){
        if(this.direction == Direction.UP){
            int nextY = this.getY()+1 < 0 ? Player.AREA_HEIGHT-1 : this.getY() -1;
            this.body.addFirst(new SnakePart(this.getX(), nextY));
        }
        else if (this.direction == Direction.DOWN){
            int nextY = this.getY()+1 >= Player.AREA_HEIGHT ? 0 : this.getY() +1;
            this.body.addFirst(new SnakePart(this.getX(), nextY));
        }
        else if (this.direction == Direction.LEFT){
            int nextX = this.getX()-1 < 0 ? Player.AREA_WIDTH-1 : this.getX() -1;
            this.body.addFirst(new SnakePart(nextX-1, this.getY()));
        }
        else {
            int nextX = this.getX()+1 >= Player.AREA_WIDTH ? 0 : this.getX() +1;
            this.body.addFirst(new SnakePart(nextX, this.getY()));
        }

        this.setX(this.body.getFirst().getX());
        this.setY(this.body.getFirst().getY());

    }

    private void removeLast(){
        this.body.removeLast();
    }

    public Direction getDirection() {
        return this.direction;
    }

    public void setDirection(Direction d) {
        if (!Direction.isOpposite(this.direction, d)){
            this.direction = d;
        }
    }

    public boolean isAlive() {
        return this.alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public void eat(Meal target){
        Player p = Player.getInstance();
        p.setScore(p.getScore() + target.getValue());
    }

    public String toString(){
        return "Snake(x="+ this.getX()+" , y="+this.getY()+")";
    }

    @Override
    public void render(Graphics g) {
        for (SnakePart p: this.body){
            p.render(g);
        }
    }
}
