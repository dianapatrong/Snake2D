package snake.model;

import snake.view.Renderable;

import java.awt.*;

public class Player implements Renderable {

    public static final int AREA_WIDTH = 25;
    public static final int AREA_HEIGHT = 25;

    private String name;
    private int score;
    private static Player instance;

    public static Player getInstance(){
        return Player.instance;
    }

    public static Player create(String name){
        if(Player.instance == null){
            Player.instance = new Player(name);
        }
        return Player.getInstance();
    }

    private Player(String name){
        this.name = name;
        this.score = 0;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        if (score >0){
            this.score = score;
        }

    }

    @Override
    public void render(Graphics g) {

    }
}
