package main;

import inputs.KeyboardInputs;
import inputs.MouseInputs;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import javax.swing.*;

public class GamePanel extends JPanel {

    //crezione di una classe di tipo mouse inputs per poter riferire ad un 
    //unico oggetto
    private MouseInputs mouseInputs ;

    //variables that are useful
    private int xDelta = 100;//remembers the x position of the object 
    private int yDelta = 100;//remembers the y position of the object
    private int frames = 0; //useful to see the fps of the game
    
    public GamePanel(){
        mouseInputs = new MouseInputs(this);
        addKeyListener(new KeyboardInputs(this));

        //classe che consente di ricevere inputs dal mouse
        //come clicked pressed e released
        addMouseListener(mouseInputs);

        //classe che osserva i movimenti del mouse
        addMouseMotionListener(mouseInputs );
    }

    /**
     * metodo che ricevuto un input numerico cambia la posizione orizzontale
     *  del pannello prima di ripitturarlo
     * @param x delta di cui spostare orizzontalmente l'oggetto
     */
    public void changeXDelta(int x){
        this.xDelta += x;
        repaint();
    }

    /**
     * metodo che ricevuto un input numerico cambia la posizione verticale
     *  del pannello prima di ripitturarlo
     * @param x delta di cui spostare orizzontalmente l'oggetto
     */
    public void changeYDelta(int y){
        this.yDelta += y;
        repaint();
    }

    /**
     * method that sets the inital position of the rectangle thats about to be drawn
     * @param x horizondal position (pixels from the left margin)
     * @param y vertical position (pixels from the top of the window)
     */
    public void setRectPos(int x, int y){
        this.xDelta = x;
        this.yDelta = y;
        repaint();
    }

    /**
     * method that redraws a rectangle with a simple loop
     * @g 
     */
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.drawRect(xDelta, yDelta,200,50);
    }
}
