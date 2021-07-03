package snake.controller;

import snake.model.Direction;
import snake.model.Snake;

public class SnakeGame {

    public static void main(String[] args){
        Snake s = new Snake(0,0,3, Direction.RIGHT);

        while(s.isAlive()){
            System.out.println(s);
            s.update();
        }
    }
}
