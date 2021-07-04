package snake.controller;

import snake.model.Direction;
import snake.model.Snake;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameController implements KeyListener {
    private Snake target;

    public GameController(Snake target){
       this.target = target;
    }
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP -> this.target.setDirection(Direction.UP);
            case KeyEvent.VK_DOWN -> this.target.setDirection(Direction.DOWN);
            case KeyEvent.VK_LEFT -> this.target.setDirection(Direction.LEFT);
            case KeyEvent.VK_RIGHT -> this.target.setDirection(Direction.RIGHT);
        }
        System.out.println(target.getDirection());
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
