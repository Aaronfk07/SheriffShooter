package at.SheriffShooter.Actors;

import at.SheriffShooter.core.Actor;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;

public class Bullet implements Actor {

    private float x,y;
    private float speed;
    private float dx, dy;
    private boolean active = true;
    private Image I_bullet;


    public Bullet(float speed,float x, float y, float dirX, float dirY, Image I_bullet){
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.I_bullet = I_bullet;

        float length = (float) Math.sqrt(dirX * dirX+ dirY * dirY);
        this.dx = (dirX / length) * speed;
        this.dy = (dirY / length) * speed;
    }


    @Override
    public void update(GameContainer container, int delta) {

        if(!active) return;
        x += dx * delta;
        y += dy * delta;

        if ( x < 0 || x > 800 || y<0 || y > 600){
            active = false;
        }
    }

    @Override
    public void render(GameContainer container, Graphics graphics) {
    if(active) I_bullet.drawCentered(x,y);
    }

    public boolean checkCollision(Enemy enemy) {
        float dist = (float) Math.sqrt(Math.pow(enemy.getX() - x, 2) + Math.pow(enemy.getY() - y, 2));
        if (dist < 20) {
            active = false;
            enemy.takeDamage(1);
            return true;
        }
        return false;
    }

    public boolean isActive() {
        return active;
    }
}
