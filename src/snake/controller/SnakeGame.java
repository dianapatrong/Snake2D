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
        GameEngine ge = new GameEngine();
        ge.start();
    }
}
