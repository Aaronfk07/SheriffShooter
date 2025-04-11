package at.SheriffShooter.Actors;

import at.SheriffShooter.core.Actor;
import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Revolver implements Actor {

    private List<Bullet> bullets;
    private Image bulletSprite;
    private float x,y;
    private float dirX,dirY;


    public Revolver(){
        bullets = new ArrayList<>();
        try {
            bulletSprite = new Image("res/images/bullet.png");
        } catch (SlickException e) {
            e.printStackTrace();
        }

    }
    public void shoot(float x, float y, float dirX, float dirY ) {
    bullets.add(new Bullet(x, y, dirX, dirY, bulletSprite));
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
}
