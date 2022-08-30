package sample;

import javafx.animation.TranslateTransition;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class Player implements Serialize, Spawn, Movement {
    private ImageView imv;
    private Coin coin;
    private Helmet helm;
    private String state;
    private Coordinate location;
    private Weapon wep;
    private int health;

    public void spawn() {
        Image pc = new Image("");
        ImageView Inpc = new ImageView(pc);
        Inpc.setX(20);
        Inpc.setY(20);
        Inpc.setFitHeight(100);
        Inpc.setFitWidth(100);
        this.imv = Inpc;
        System.out.println("spawned");

    }

    public ImageView getimv() {

        return (this.imv);
    }

    public void forward(ImageView node, int n) {
        TranslateTransition jump = new TranslateTransition();
        jump.setToX(100);
        jump.setByY(100);
        jump.setDuration(Duration.millis(1000));
        jump.setCycleCount(500);
        jump.setAutoReverse(true);
        jump.setNode(node);
        jump.play();

    }


    @Override
    public void serialize() {
    }

    @Override
    public void deserialize() {
    }

    @Override
    public void despawn() {
    }

    @Override
    public void Front() {
    }

    @Override
    public void Back() {
    }

    @Override
    public void Parallax() {
    }

    @Override
    public void Jump() {
    }

    Weapon getWep() {
        return (this.wep);
    }

    void setWep(Weapon wep1) {
        this.wep = wep1;
    }

    Helmet getHelm() {
        return (this.helm);
    }

    void setHelm(Helmet helm1) {
        this.helm = helm1;
    }

    String getState() {
        return (this.state);
    }

    void setState(String state1) {
        this.state = state1;
    }

    public Coordinate getLocation() {
        return (this.location);
    }

    void setLocation(Coordinate loc1) {
        this.location = loc1;
    }

    void setCoin(Coin coin) {
        this.coin = coin;
    }

    public Coin getCoin() {
        return coin;
    }
}
