package sample;

import javafx.animation.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Objects;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.transform.Translate;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.shape.Line;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;
import javafx.util.*;

public class Controller {

    //GAME CLASS INSTANCE
    Game game = new Game();


    //SWITCH SCENES
    private Stage stage;
    private Scene scene;
    private Parent root;


    public void switchToPauseMenu(ActionEvent event) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("pauseMenu.fxml")));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void switchToMainMenu(ActionEvent event) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("mainMenu.fxml")));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToGame(ActionEvent event) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("sample.fxml")));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    //ANIMATIONS

    @FXML
    private ImageView coin = new ImageView();

    @FXML
    private ImageView coin1 = new ImageView();

    @FXML
    private ImageView coin2 = new ImageView();

    @FXML
    private ImageView coin3 = new ImageView();

    @FXML
    private ImageView coin4 = new ImageView();

    @FXML
    private ImageView chest = new ImageView();

    @FXML
    private ImageView tnt = new ImageView();

    @FXML
    private ImageView weapon = new ImageView();

    @FXML
    private ImageView mc = new ImageView();
    @FXML
    private ImageView background = new ImageView();

    //ISLANDS-ISLAND0
    @FXML
    private ImageView island01 = new ImageView();
    @FXML
    private ImageView island02 = new ImageView();
    @FXML
    private ImageView island03 = new ImageView();
    @FXML
    private ImageView island04 = new ImageView();
    @FXML
    private ImageView island05 = new ImageView();
    @FXML
    private ImageView island06 = new ImageView();
    @FXML
    private ImageView island07 = new ImageView();
    @FXML
    private ImageView island08 = new ImageView();
    @FXML
    private ImageView island09 = new ImageView();
    @FXML
    private ImageView island010 = new ImageView();
    @FXML
    private ImageView island011 = new ImageView();
    @FXML
    private ImageView island012 = new ImageView();


    //ISLANDS-ISLAND1
    @FXML
    private ImageView island11 = new ImageView();
    @FXML
    private ImageView island12 = new ImageView();
    @FXML
    private ImageView island13 = new ImageView();
    @FXML
    private ImageView island14 = new ImageView();
    @FXML
    private ImageView island15 = new ImageView();
    @FXML
    private ImageView island16 = new ImageView();
    @FXML
    private ImageView island17 = new ImageView();
    @FXML
    private ImageView island18 = new ImageView();

    //ISLANDS-ISLAND2
    @FXML
    private ImageView island31 = new ImageView();
    @FXML
    private ImageView island32 = new ImageView();
    @FXML
    private ImageView island33 = new ImageView();
    @FXML
    private ImageView island34 = new ImageView();
    @FXML
    private ImageView island35 = new ImageView();
    @FXML
    private ImageView island36 = new ImageView();

    //ORCS
    @FXML
    private ImageView orc = new ImageView();
    @FXML
    private ImageView orc1 = new ImageView();
    @FXML
    private ImageView orc2 = new ImageView();
    @FXML
    private ImageView orc3 = new ImageView();
    @FXML
    private ImageView orc4 = new ImageView();
    @FXML
    private ImageView bossOrc = new ImageView();

    @FXML
    private Label coinCount = new Label();


    public void move() {

        //COINS
        TranslateTransition shiftC0 = new TranslateTransition();
        shiftC0.setByX(-30);
        shiftC0.setDuration(Duration.millis(1000));
        shiftC0.setCycleCount(1);
        shiftC0.setAutoReverse(false);
        shiftC0.setNode(coin);
        shiftC0.play();

        TranslateTransition shiftC1 = new TranslateTransition();
        shiftC1.setByX(-30);
        shiftC1.setDuration(Duration.millis(1000));
        shiftC1.setCycleCount(1);
        shiftC1.setAutoReverse(false);
        shiftC1.setNode(coin1);
        shiftC1.play();

        TranslateTransition shiftC2 = new TranslateTransition();
        shiftC2.setByX(-30);
        shiftC2.setDuration(Duration.millis(1000));
        shiftC2.setCycleCount(1);
        shiftC2.setAutoReverse(false);
        shiftC2.setNode(coin2);
        shiftC2.play();

        TranslateTransition shiftC3 = new TranslateTransition();
        shiftC3.setByX(-30);
        shiftC3.setDuration(Duration.millis(1000));
        shiftC3.setCycleCount(1);
        shiftC3.setAutoReverse(false);
        shiftC3.setNode(coin3);
        shiftC3.play();

        TranslateTransition shiftC4 = new TranslateTransition();
        shiftC4.setByX(-30);
        shiftC4.setDuration(Duration.millis(1000));
        shiftC4.setCycleCount(1);
        shiftC4.setAutoReverse(false);
        shiftC4.setNode(coin2);
        shiftC4.play();

        //TNT AND CHEST

        TranslateTransition shiftTNT = new TranslateTransition();
        shiftTNT.setByX(-30);
        shiftTNT.setDuration(Duration.millis(1000));
        shiftTNT.setCycleCount(1);
        shiftTNT.setAutoReverse(false);
        shiftTNT.setNode(tnt);
        shiftTNT.play();

        TranslateTransition shiftX = new TranslateTransition();
        shiftX.setByX(-30);
        shiftX.setDuration(Duration.millis(1000));
        shiftX.setCycleCount(1);
        shiftX.setAutoReverse(false);
        shiftX.setNode(chest);
        shiftX.play();



        //ISLAND
        TranslateTransition shift01 = new TranslateTransition();
        shift01.setByX(-30);
        shift01.setDuration(Duration.millis(1000));
        shift01.setCycleCount(1);
        shift01.setAutoReverse(false);
        shift01.setNode(island01);
        shift01.play();

        TranslateTransition shift02 = new TranslateTransition();
        shift02.setByX(-30);
        shift02.setDuration(Duration.millis(1000));
        shift02.setCycleCount(1);
        shift02.setAutoReverse(false);
        shift02.setNode(island02);
        shift02.play();

        TranslateTransition shift03 = new TranslateTransition();
        shift03.setByX(-30);
        shift03.setDuration(Duration.millis(1000));
        shift03.setCycleCount(1);
        shift03.setAutoReverse(false);
        shift03.setNode(island03);
        shift03.play();

        TranslateTransition shift04 = new TranslateTransition();
        shift04.setByX(-30);
        shift04.setDuration(Duration.millis(1000));
        shift04.setCycleCount(1);
        shift04.setAutoReverse(false);
        shift04.setNode(island04);
        shift04.play();

        TranslateTransition shift05 = new TranslateTransition();
        shift05.setByX(-30);
        shift05.setDuration(Duration.millis(1000));
        shift05.setCycleCount(1);
        shift05.setAutoReverse(false);
        shift05.setNode(island05);
        shift05.play();

        TranslateTransition shift06 = new TranslateTransition();
        shift06.setByX(-30);
        shift06.setDuration(Duration.millis(1000));
        shift06.setCycleCount(1);
        shift06.setAutoReverse(false);
        shift06.setNode(island06);
        shift06.play();

        TranslateTransition shift07 = new TranslateTransition();
        shift07.setByX(-30);
        shift07.setDuration(Duration.millis(1000));
        shift07.setCycleCount(1);
        shift07.setAutoReverse(false);
        shift07.setNode(island07);
        shift07.play();

        TranslateTransition shift08 = new TranslateTransition();
        shift08.setByX(-30);
        shift08.setDuration(Duration.millis(1000));
        shift08.setCycleCount(1);
        shift08.setAutoReverse(false);
        shift08.setNode(island08);
        shift08.play();

        TranslateTransition shift09 = new TranslateTransition();
        shift09.setByX(-30);
        shift09.setDuration(Duration.millis(1000));
        shift09.setCycleCount(1);
        shift09.setAutoReverse(false);
        shift09.setNode(island09);
        shift09.play();

        TranslateTransition shift010 = new TranslateTransition();
        shift010.setByX(-30);
        shift010.setDuration(Duration.millis(1000));
        shift010.setCycleCount(1);
        shift010.setAutoReverse(false);
        shift010.setNode(island010);
        shift010.play();

        TranslateTransition shift011 = new TranslateTransition();
        shift011.setByX(-30);
        shift011.setDuration(Duration.millis(1000));
        shift011.setCycleCount(1);
        shift011.setAutoReverse(false);
        shift011.setNode(island011);
        shift011.play();

        TranslateTransition shift012 = new TranslateTransition();
        shift012.setByX(-30);
        shift012.setDuration(Duration.millis(1000));
        shift012.setCycleCount(1);
        shift012.setAutoReverse(false);
        shift012.setNode(island012);
        shift012.play();


        //ISLAND1
        TranslateTransition shift11 = new TranslateTransition();
        shift11.setByX(-30);
        shift11.setDuration(Duration.millis(1000));
        shift11.setCycleCount(1);
        shift11.setAutoReverse(false);
        shift11.setNode(island11);
        shift11.play();

        TranslateTransition shift12 = new TranslateTransition();
        shift12.setByX(-30);
        shift12.setDuration(Duration.millis(1000));
        shift12.setCycleCount(1);
        shift12.setAutoReverse(false);
        shift12.setNode(island12);
        shift12.play();

        TranslateTransition shift13 = new TranslateTransition();
        shift13.setByX(-30);
        shift13.setDuration(Duration.millis(1000));
        shift13.setCycleCount(1);
        shift13.setAutoReverse(false);
        shift13.setNode(island13);
        shift13.play();

        TranslateTransition shift14 = new TranslateTransition();
        shift14.setByX(-30);
        shift14.setDuration(Duration.millis(1000));
        shift14.setCycleCount(1);
        shift14.setAutoReverse(false);
        shift14.setNode(island14);
        shift14.play();

        TranslateTransition shift15 = new TranslateTransition();
        shift15.setByX(-30);
        shift15.setDuration(Duration.millis(1000));
        shift15.setCycleCount(1);
        shift15.setAutoReverse(false);
        shift15.setNode(island15);
        shift15.play();

        TranslateTransition shift16 = new TranslateTransition();
        shift16.setByX(-30);
        shift16.setDuration(Duration.millis(1000));
        shift16.setCycleCount(1);
        shift16.setAutoReverse(false);
        shift16.setNode(island16);
        shift16.play();

        TranslateTransition shift17 = new TranslateTransition();
        shift17.setByX(-30);
        shift17.setDuration(Duration.millis(1000));
        shift17.setCycleCount(1);
        shift17.setAutoReverse(false);
        shift17.setNode(island17);
        shift17.play();

        TranslateTransition shift18 = new TranslateTransition();
        shift18.setByX(-30);
        shift18.setDuration(Duration.millis(1000));
        shift18.setCycleCount(1);
        shift18.setAutoReverse(false);
        shift18.setNode(island18);
        shift18.play();

        //ISLAND3

        TranslateTransition shift31 = new TranslateTransition();
        shift31.setByX(-30);
        shift31.setDuration(Duration.millis(1000));
        shift31.setCycleCount(1);
        shift31.setAutoReverse(false);
        shift31.setNode(island31);
        shift31.play();

        TranslateTransition shift32 = new TranslateTransition();
        shift32.setByX(-30);
        shift32.setDuration(Duration.millis(1000));
        shift32.setCycleCount(1);
        shift32.setAutoReverse(false);
        shift32.setNode(island32);
        shift32.play();

        TranslateTransition shift33 = new TranslateTransition();
        shift33.setByX(-30);
        shift33.setDuration(Duration.millis(1000));
        shift33.setCycleCount(1);
        shift33.setAutoReverse(false);
        shift33.setNode(island33);
        shift33.play();

        TranslateTransition shift34 = new TranslateTransition();
        shift34.setByX(-30);
        shift34.setDuration(Duration.millis(1000));
        shift34.setCycleCount(1);
        shift34.setAutoReverse(false);
        shift34.setNode(island34);
        shift34.play();

        TranslateTransition shift35 = new TranslateTransition();
        shift35.setByX(-30);
        shift35.setDuration(Duration.millis(1000));
        shift35.setCycleCount(1);
        shift35.setAutoReverse(false);
        shift35.setNode(island35);
        shift35.play();

        TranslateTransition shift36 = new TranslateTransition();
        shift36.setByX(-30);
        shift36.setDuration(Duration.millis(1000));
        shift36.setCycleCount(1);
        shift36.setAutoReverse(false);
        shift36.setNode(island36);
        shift36.play();


        //ORCS
        TranslateTransition shiftOrc = new TranslateTransition();
        shiftOrc.setByX(-30);
        shiftOrc.setDuration(Duration.millis(1000));
        shiftOrc.setCycleCount(1);
        shiftOrc.setAutoReverse(false);
        shiftOrc.setNode(orc);
        shiftOrc.play();

        TranslateTransition shiftOrc1 = new TranslateTransition();
        shiftOrc1.setByX(-30);
        shiftOrc1.setDuration(Duration.millis(1000));
        shiftOrc1.setCycleCount(1);
        shiftOrc1.setAutoReverse(false);
        shiftOrc1.setNode(orc1);
        shiftOrc1.play();

        TranslateTransition shiftOrc2 = new TranslateTransition();
        shiftOrc2.setByX(-30);
        shiftOrc2.setDuration(Duration.millis(1000));
        shiftOrc2.setCycleCount(1);
        shiftOrc2.setAutoReverse(false);
        shiftOrc2.setNode(orc2);
        shiftOrc2.play();

        TranslateTransition shiftOrc3 = new TranslateTransition();
        shiftOrc3.setByX(-30);
        shiftOrc3.setDuration(Duration.millis(1000));
        shiftOrc3.setCycleCount(1);
        shiftOrc3.setAutoReverse(false);
        shiftOrc3.setNode(orc3);
        shiftOrc3.play();

        TranslateTransition shiftOrc4 = new TranslateTransition();
        shiftOrc4.setByX(-30);
        shiftOrc4.setDuration(Duration.millis(1000));
        shiftOrc4.setCycleCount(1);
        shiftOrc4.setAutoReverse(false);
        shiftOrc4.setNode(orc4);
        shiftOrc4.play();

        TranslateTransition shiftBoss = new TranslateTransition();
        shiftBoss.setByX(-30);
        shiftBoss.setDuration(Duration.millis(1000));
        shiftBoss.setCycleCount(1);
        shiftBoss.setAutoReverse(false);
        shiftBoss.setNode(bossOrc);
        shiftBoss.play();


    }

    @FXML
    public void jump() {

        TranslateTransition jumper = new TranslateTransition();
        jumper.setByX(0);
        jumper.setByY(-50);
        jumper.setDuration(Duration.millis(1000));
        jumper.setCycleCount(Animation.INDEFINITE);
        jumper.setAutoReverse(true);
        jumper.setNode(mc);
        jumper.play();

        TranslateTransition jumperW = new TranslateTransition();
        jumperW.setByX(0);
        jumperW.setByY(-50);
        jumperW.setDuration(Duration.millis(1000));
        jumperW.setCycleCount(Animation.INDEFINITE);
        jumperW.setAutoReverse(true);
        jumperW.setNode(weapon);
        jumperW.play();

        TranslateTransition jumpOrc = new TranslateTransition();
        jumpOrc.setByX(0);
        jumpOrc.setByY(-25);
        jumpOrc.setDuration(Duration.millis(750));
        jumpOrc.setCycleCount(Animation.INDEFINITE);
        jumpOrc.setAutoReverse(true);
        jumpOrc.setNode(orc);
        jumpOrc.play();

        TranslateTransition jumpOrc1 = new TranslateTransition();
        jumpOrc1.setByX(0);
        jumpOrc1.setByY(-25);
        jumpOrc1.setDuration(Duration.millis(750));
        jumpOrc1.setCycleCount(Animation.INDEFINITE);
        jumpOrc1.setAutoReverse(true);
        jumpOrc1.setNode(orc1);
        jumpOrc1.play();

        TranslateTransition jumpOrc2 = new TranslateTransition();
        jumpOrc2.setByX(0);
        jumpOrc2.setByY(-25);
        jumpOrc2.setDuration(Duration.millis(750));
        jumpOrc2.setCycleCount(Animation.INDEFINITE);
        jumpOrc2.setAutoReverse(true);
        jumpOrc2.setNode(orc2);
        jumpOrc2.play();

        TranslateTransition jumpOrc3 = new TranslateTransition();
        jumpOrc3.setByX(0);
        jumpOrc3.setByY(-25);
        jumpOrc3.setDuration(Duration.millis(750));
        jumpOrc3.setCycleCount(Animation.INDEFINITE);
        jumpOrc3.setAutoReverse(true);
        jumpOrc3.setNode(orc3);
        jumpOrc3.play();

        TranslateTransition jumpOrc4 = new TranslateTransition();
        jumpOrc4.setByX(0);
        jumpOrc4.setByY(-25);
        jumpOrc4.setDuration(Duration.millis(750));
        jumpOrc4.setCycleCount(Animation.INDEFINITE);
        jumpOrc4.setAutoReverse(true);
        jumpOrc4.setNode(orc4);
        jumpOrc4.play();

        TranslateTransition jumpOrcB = new TranslateTransition();
        jumpOrcB.setByX(0);
        jumpOrcB.setByY(-50);
        jumpOrcB.setDuration(Duration.millis(1250));
        jumpOrcB.setCycleCount(Animation.INDEFINITE);
        jumpOrcB.setAutoReverse(true);
        jumpOrcB.setNode(bossOrc);
        jumpOrcB.play();

        TranslateTransition shake = new TranslateTransition();
        shake.setByX(0);
        shake.setByY(10);
        shake.setDuration(Duration.millis(1000));
        shake.setCycleCount(Animation.INDEFINITE);
        shake.setAutoReverse(true);
        shake.setNode(background);
        shake.play();

        AnimationTimer col = new AnimationTimer() {
            @Override
            public void handle(long timestamp) {
                if (collision(orc, mc)) {
                    TranslateTransition shift2Orc = new TranslateTransition();
                    shift2Orc.setByX(10);
                    shift2Orc.setDuration(Duration.millis(1000));
                    shift2Orc.setCycleCount(1);
                    shift2Orc.setAutoReverse(false);
                    shift2Orc.setNode(orc);
                    shift2Orc.play();
                }
            }
        };
        col.start();

        AnimationTimer col2 = new AnimationTimer() {
            @Override
            public void handle(long timestamp) {
                if (collision(orc1, mc)) {
                    TranslateTransition shift2Orc = new TranslateTransition();
                    shift2Orc.setByX(10);
                    shift2Orc.setDuration(Duration.millis(1000));
                    shift2Orc.setCycleCount(1);
                    shift2Orc.setAutoReverse(false);
                    shift2Orc.setNode(orc1);
                    shift2Orc.play();
                }
            }
        };
        col2.start();

        AnimationTimer col4 = new AnimationTimer() {
            @Override
            public void handle(long timestamp) {
                if (collision(orc4, mc)) {
                    TranslateTransition shift2Orc = new TranslateTransition();
                    shift2Orc.setByX(10);
                    shift2Orc.setDuration(Duration.millis(1000));
                    shift2Orc.setCycleCount(1);
                    shift2Orc.setAutoReverse(false);
                    shift2Orc.setNode(orc4);
                    shift2Orc.play();
                }
            }
        };
        col4.start();

        AnimationTimer col3 = new AnimationTimer() {
            @Override
            public void handle(long timestamp) {
                if (collision(orc3, mc)) {
                    TranslateTransition shift2Orc = new TranslateTransition();
                    shift2Orc.setByX(10);
                    shift2Orc.setDuration(Duration.millis(1000));
                    shift2Orc.setCycleCount(1);
                    shift2Orc.setAutoReverse(false);
                    shift2Orc.setNode(orc3);
                    shift2Orc.play();
                }
            }
        };
        col3.start();

        AnimationTimer col7 = new AnimationTimer() {
            @Override
            public void handle(long timestamp) {
                if (collision(orc2, mc)) {
                    TranslateTransition shift2Orc = new TranslateTransition();
                    shift2Orc.setByX(10);
                    shift2Orc.setDuration(Duration.millis(1000));
                    shift2Orc.setCycleCount(1);
                    shift2Orc.setAutoReverse(false);
                    shift2Orc.setNode(orc2);
                    shift2Orc.play();
                }
            }
        };
        col7.start();

        AnimationTimer colBoss = new AnimationTimer() {
            @Override
            public void handle(long timestamp) {
                if (collision(bossOrc, mc)) {
                    TranslateTransition shift2Orc = new TranslateTransition();
                    shift2Orc.setByX(5);
                    shift2Orc.setDuration(Duration.millis(1000));
                    shift2Orc.setCycleCount(1);
                    shift2Orc.setAutoReverse(false);
                    shift2Orc.setNode(bossOrc);
                    shift2Orc.play();
                }
            }
        };
        colBoss.start();

        AnimationTimer colChest = new AnimationTimer() {
            @Override
            public void handle(long l) {
                if (collision(chest, mc)){
                    //game.getPlayer().setWep(game.getChest().getContent());
                    death(chest);
                }
            }
        };
        colChest.start();

        //ORC & WEAPON
        AnimationTimer colWpn = new AnimationTimer() {
            boolean enable = true;
            @Override
            public void handle(long l) {
                if (collision(weapon, orc)&&enable){
                    death(orc);
                    enable = false;
                }
            }
        };
        colWpn.start();

        AnimationTimer colWpn1 = new AnimationTimer() {
            boolean enable = true;
            @Override
            public void handle(long l) {
                if (collision(weapon, orc1) && enable){
                    death(orc1);
                    enable = false;
                }
            }
        };
        colWpn1.start();

        AnimationTimer colWpn2 = new AnimationTimer() {
            boolean enable = true;
            @Override
            public void handle(long l) {
                if (collision(weapon, orc2) && enable){
                    death(orc2);
                    enable = false;
                }
            }
        };
        colWpn2.start();

        AnimationTimer colWpn3 = new AnimationTimer() {
            boolean enable = true;
            @Override
            public void handle(long l) {
                if (collision(weapon, orc3) && enable){
                    death(orc3);
                    enable = false;
                }
            }
        };
        colWpn3.start();

        AnimationTimer colWpn4 = new AnimationTimer() {
            boolean enable = true;
            @Override
            public void handle(long l) {
                if (collision(weapon, orc) && enable){
                    death(orc4);
                    enable = false;
                }
            }
        };
        colWpn4.start();

        AnimationTimer colWpnB = new AnimationTimer() {
            int counter = 0;
            boolean enable = true;
            @Override
            public void handle(long l) {
                if (collision(weapon, bossOrc) && enable){
                    counter++;
                    if (counter == 5) {
                        death(bossOrc);
                        enable = false;
                    }
                }
            }
        };
        colWpnB.start();


        AnimationTimer colCoin = new AnimationTimer() {
            @Override
            public void handle(long l) {
                if (collision(coin, mc)){
                    //game.getPlayer().getCoin().addCoin();
                    coinCount.setText("1");
                    death(coin);
                }
            }
        };
        colCoin.start();

        AnimationTimer colCoin1 = new AnimationTimer() {
            @Override
            public void handle(long l) {
                if (collision(coin1, mc)){
                    //game.getPlayer().getCoin().addCoin();
                    coinCount.setText("2");
                    death(coin1);
                }
            }
        };
        colCoin1.start();

        AnimationTimer colCoin2 = new AnimationTimer() {
            @Override
            public void handle(long l) {
                if (collision(coin2, mc)){
                    //game.getPlayer().getCoin().addCoin();
                    coinCount.setText("3");
                    death(coin2);
                }
            }
        };
        colCoin2.start();

        AnimationTimer colCoin3 = new AnimationTimer() {
            boolean enable = true;
            @Override
            public void handle(long l) {
                if (collision(coin3, mc) && enable){
                    //game.getPlayer().getCoin().addCoin();
                    coinCount.setText("4");
                    death(coin3);
                }
            }
        };
        colCoin3.start();

        AnimationTimer colCoin4 = new AnimationTimer() {
            boolean enable = true;
            @Override
            public void handle(long l) {
                if (collision(coin4, mc) && enable){
                    //game.getPlayer().getCoin().addCoin();
                    coinCount.setText("5");
                    death(coin4);
                    enable = false;
                }
            }
        };
        colCoin4.start();

    }

    public void fire(){
        TranslateTransition jumper = new TranslateTransition();
        jumper.setByX(100);
        jumper.setByY(0);
        jumper.setDuration(Duration.millis(500));
        jumper.setCycleCount(2);
        jumper.setAutoReverse(true);
        jumper.setNode(weapon);
        jumper.play();
    }

    public void death(ImageView imageView){

        FadeTransition ft = new FadeTransition(Duration.millis(2000), imageView);
        ft.setFromValue(1.0);
        ft.setToValue(0);
        ft.setCycleCount(1);
        ft.setAutoReverse(false);
        ft.play();

        TranslateTransition jumper = new TranslateTransition();
        jumper.setByX(0);
        jumper.setByY(500);
        jumper.setDuration(Duration.millis(1000));
        jumper.setCycleCount(1);
        jumper.setAutoReverse(false);
        jumper.setNode(imageView);
        jumper.play();
    }

    public boolean collision(ImageView a, ImageView b) {
        if (a.getBoundsInParent().intersects(b.getBoundsInParent())) {
            return true;
        }
        return false;
    }
}

