package snake.controller;


import snake.model.GameObject;
import snake.model.Meal;
import snake.model.Snake;

import java.util.LinkedList;
import java.util.List;

public class Scene {
    private List<GameObject> content;
    private boolean running;
    private Snake mainChar;

    public Scene(){
        this.content = new LinkedList<>();
        this.running = true;
    }

    public List<GameObject> getSceneContent(){
        return this.getSceneContent();
    }

    public void addObject(GameObject o){
        if(o instanceof Snake){
            this.mainChar = (Snake) o;
        }
        this.content.add(o);
    }

    public void removeObject(GameObject o){
        this.content.remove(o);
    }

    public boolean isRunning(){
        return this.running;
    }

    public void update(){
        for(GameObject obj: this.content){
            obj.update();
            if(obj instanceof Snake){
                this.running = ((Snake) obj).isAlive();
            }
            else {
                if(this.mainChar.isColliding(obj)){
                    this.mainChar.eat((Meal) obj);
                }
            }
        }


    }
}
