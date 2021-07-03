package snake.view;

import snake.model.GameObject;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;

public class GameWindow extends JFrame {
    private Canvas canva;

    public GameWindow(int width, int height, String title){
        this.canva = new Canvas();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(width, height);
        this.setResizable(false);
        this.canva.setBackground(Color.BLACK);
        this.canva.setSize(width, height);
        this.add(canva);
        this.canva.setVisible(true);
        this.setVisible(true);
        this.canva.createBufferStrategy(2);
    }

    public void clearScreen(){
        BufferStrategy bs = this.canva.getBufferStrategy();
        bs.dispose();
        this.canva.createBufferStrategy(2);
    }

    public BufferStrategy getDrawGraphics(){
        return this.canva.getBufferStrategy();
    }
}
