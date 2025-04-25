package at.SheriffShooter.main;

import at.SheriffShooter.Actors.Enemy;
import at.SheriffShooter.Actors.Sheriff;
import at.SheriffShooter.core.Actor;
import org.newdawn.slick.*;
import org.newdawn.slick.tiled.TiledMap;

import java.util.ArrayList;
import java.util.List;


public class SheriffShooter extends BasicGame {

    private Sheriff sheriff;
    private Image sheriffSprite;
    private List<Actor> actors;
    private Image enemySprite;

    private TiledMap map;

    public SheriffShooter(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {

        sheriffSprite = new Image("testdata/cross.png"); // testbild
        enemySprite = new Image("testdata/cross.png");
        sheriff = new Sheriff(400, 300, 1, sheriffSprite);
        actors = new ArrayList<>();
        actors.add(sheriff);

        createEnemies();

        map = new TiledMap("maps/testmap.tmx");

    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        for (Actor actor : actors) {
            actor.update(gameContainer, delta); // Update each actor
        }
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        graphics.drawString("Use W/A/S/D to move, Left Mouse click to shoot", 10, 30);
        for (Actor actor : actors) {
            actor.render(gameContainer, graphics); // Update each actor
        }

        map.render(0,0);
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new SheriffShooter("SheriffShooter"));
            container.setDisplayMode(800, 600, false);
            container.setShowFPS(false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }


    }

    private void createEnemies() {
        for (int i = 0; i < 2; i++) {
            float speed = 0.1F;
            Enemy enemy = new Enemy(100 + i * 50, 300, enemySprite, 1 ,speed); // Position enemies with some spacing
            actors.add(enemy);
        }
    }
}
