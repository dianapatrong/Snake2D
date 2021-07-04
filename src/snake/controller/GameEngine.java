package snake.controller;

import snake.model.Direction;
import snake.model.Snake;
import snake.view.RenderEngine;

public class GameEngine {
    private Scene mainScene;
    private RenderEngine renderer;

    public GameEngine(){
        this.mainScene = new Scene();
        this.renderer = new RenderEngine(800,600,"Snake Game");
    }
    public void start(){
        this.mainScene.addObject(new Snake(0,0,3, Direction.LEFT));
        this.run();
    }

    public void stop(){

    }

    public void run(){
        while(this.mainScene.isRunning()){
            this.mainScene.update();
            this.renderer.render();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
