package at.SheriffShooter.Actors;

import at.SheriffShooter.core.Actor;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class Bullet implements Actor {

    private float x,y;
    private float speedX, speedY;

    public boolean checkCollision(Enemy enemy) {
        return false;
    }

    @Override
    public void update(GameContainer container, int delta) {

    }

    @Override
    public void render(GameContainer container, Graphics graphics) {

    }
}
