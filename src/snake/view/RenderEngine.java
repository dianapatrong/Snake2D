package snake.view;

import snake.model.Player;

import java.awt.*;
import java.awt.image.BufferStrategy;
import java.util.LinkedList;

public class RenderEngine {
    private GameWindow window;
    private LinkedList<Renderable> sceneToRender;
    public static int CELL_WIDTH;
    public static int CELL_HEIGHT;

    public RenderEngine(int width, int height, String windowTitle){
        RenderEngine.CELL_WIDTH = width/ Player.AREA_WIDTH;
        RenderEngine.CELL_HEIGHT = width/ Player.AREA_HEIGHT;
        this.window = new GameWindow(width, height, windowTitle);
        this.sceneToRender = new LinkedList<>();
    }

    public GameWindow getGameWindow(){
        return this.window;
    }

    public LinkedList<Renderable> getSceneToRender(){
        return this.sceneToRender;
    }

    public void setSceneToRender(LinkedList<Renderable> scene){
        this.sceneToRender = scene;
    }

    public void render(){
        this.window.clearScreen();
        BufferStrategy bs = this.window.getDrawGraphics();
        Graphics g = bs.getDrawGraphics();
        for(Renderable r: this.sceneToRender){
            r.render(g);
        }
        bs.show();
    }
}
