package main;

public class Game {
    private GameWindow gameWindow;
    private GamePanel gamePanel;
    public Game(){
        gamePanel = new GamePanel();
        gameWindow = new GameWindow(gamePanel);
        //funzione che richiede l'attenzione del programma sul pannello 
        //che è stato creato
        gamePanel.requestFocus();
    }
}
