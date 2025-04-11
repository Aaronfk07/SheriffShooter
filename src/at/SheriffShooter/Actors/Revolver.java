package at.SheriffShooter.Actors;

import at.SheriffShooter.core.Actor;
import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Revolver implements Actor {

    private List<Bullet> bullets;
    private Image bulletSprite;
    private float x, y;

    public Revolver(float startX, float startY) {
        this.x = startX;
        this.y = startY;
        bullets = new ArrayList<>();
        try {
            bulletSprite = new Image("testdata/cross.png");
        } catch (SlickException e) {
            System.err.println("Failed to load bullet image: " + e.getMessage());
        }
    }

    public void shoot(float dirX, float dirY) {
        float speed = 1; // Set a default speed for bullets
        bullets.add(new Bullet(speed, x, y, dirX, dirY, bulletSprite));
    }

    @Override
    public void update(GameContainer container, int delta) {
        Iterator<Bullet> iter = bullets.iterator();
        while (iter.hasNext()) {
            Bullet bullet = iter.next();
            bullet.update(container, delta);
            if (!bullet.isActive()) {
                iter.remove();
            }
        }
    }

    @Override
    public void render(GameContainer container, Graphics graphics) {
        for (Bullet bullet : bullets) {
            bullet.render(container, graphics);
        }
    }

    public List<Bullet> getBullets() {
        return bullets;
    }
    public void setPosition(float x, float y){
        this.x = x;
        this.y = y;
    }
}

