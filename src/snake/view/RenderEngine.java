package snake.view;

import snake.controller.Scene;
import snake.model.GameObject;
import snake.model.Player;

import java.awt.*;
import java.awt.image.BufferStrategy;
import java.util.List;

public class RenderEngine {
    private GameWindow window;
    private Scene sceneToRender;
    public static int CELL_WIDTH;
    public static int CELL_HEIGHT;

    public RenderEngine(int width, int height, String windowTitle){
        RenderEngine.CELL_WIDTH = width/ Player.AREA_WIDTH;
        RenderEngine.CELL_HEIGHT = height/ Player.AREA_HEIGHT;
        this.window = new GameWindow(width, height, windowTitle);
    }

    public GameWindow getGameWindow(){
        return this.window;
    }

    public List<GameObject> getSceneToRender(){
        return this.sceneToRender.getSceneContent();
    }

    public void setSceneToRender(Scene scene){
        this.sceneToRender = scene;
    }

    public void render(){
        this.window.clearScreen();
        BufferStrategy bs = this.window.getDrawGraphics();
        Graphics g = bs.getDrawGraphics();
        for(Renderable r: this.sceneToRender.getSceneContent()){
            r.render(g);
        }
        bs.show();
    }
}
