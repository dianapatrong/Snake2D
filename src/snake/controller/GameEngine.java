package snake.controller;

import snake.model.Direction;
import snake.model.Snake;
import snake.view.RenderEngine;

public class GameEngine {
    private Scene mainScene;
    private RenderEngine renderer;
    private GameController gc;

    public GameEngine(){
        this.mainScene = new Scene();
        this.renderer = new RenderEngine(800,600,"Snake Game");
    }
    public void start(){
        Snake s = new Snake(0,0,3,Direction.RIGHT);
        this.gc = new GameController(s);
        this.mainScene.addObject(s);
        this.renderer.setSceneToRender(mainScene);
        this.renderer.getGameWindow().addKeyListener(gc);
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
