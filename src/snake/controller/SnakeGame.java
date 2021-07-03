package snake.controller;

import snake.model.Direction;
import snake.model.Snake;
import snake.view.RenderEngine;
import snake.view.Renderable;

import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SnakeGame {

    public static void main(String[] args){
        Snake s = new Snake(0,0,3, Direction.RIGHT);
        LinkedList<Renderable> scene = new LinkedList<>();
        scene.add(s);
        RenderEngine re = new RenderEngine(800, 600, "Snake Game");
        re.setSceneToRender(scene);
        while(s.isAlive()){
            s.update();
            re.render();

            try {
                Thread.sleep(500);
            } catch (InterruptedException ex){
                Logger.getLogger(SnakeGame.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }
}
