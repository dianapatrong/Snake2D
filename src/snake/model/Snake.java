package snake.model;

import java.util.LinkedList;

public class Snake extends GameObject{
    private Direction direction;
    private boolean alive;
    private LinkedList<SnakePart> body;

    public Snake(int x, int y, int length, Direction direction) {
        super(x, y);
        this.direction = direction;
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
            this.body.addFirst(new SnakePart(this.getX(), this.getY()-1));
        }
        else if (this.direction == Direction.DOWN){
            this.body.addFirst(new SnakePart(this.getX(), this.getY()+1));
        }
        else if (this.direction == Direction.LEFT){
            this.body.addFirst(new SnakePart(this.getX()-1, this.getY()));
        }
        else {
            this.body.addFirst(new SnakePart(this.getX()+1, this.getY()));
        }

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

    }
}
