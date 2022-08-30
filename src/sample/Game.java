package sample;

import java.io.*;

public class Game implements Serialize{
    private Player player;
    private long score;
    private long highScore;

    private NPC npc;
    private Game g1;

    private Item item;
    private Chest chest;


    ObjectOutputStream out;
    ObjectInputStream in;

    public Player getPlayer() {
        return player;
    }

    public Chest getChest() {
        return chest;
    }


    @Override
    public void serialize(){
        try{
            FileOutputStream file = new FileOutputStream("test.txt");
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(g1);

            out.close();
            file.close();
        }
        catch(IOException ex)
        {
            System.out.println("IOException is caught");
            System.out.println("in");
        }
    }

    @Override
    public void deserialize(){
        try{
            FileInputStream file = new FileInputStream("test.txt");
            ObjectInputStream in = new ObjectInputStream(file);
            g1 = (Game)in.readObject();

            in.close();
            file.close();
            System.out.println(g1.score);
        }
        catch(IOException ex)
        {
            System.out.println("IOException is caught");
            System.out.println("out");
        }
        catch(ClassNotFoundException ex)
        {
            System.out.println("ClassNotFoundException is caught");
            System.out.println("out1");
        }
    }

    public long getScore() {
        return score;
    }

    public void setScore(long score) {
        this.score = score;
    }

    public long getHighScore() {
        return highScore;
    }

    public void setHighScore(long highScore) {
        this.highScore = highScore;
    }
}
