package at.SheriffShooter.Actors;

import at.SheriffShooter.core.Actor;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;

public class Enemy implements Actor {

    protected float x,y;
    protected int health;
    protected Image EnemySprite;



    public Enemy(float x, float y, Image enemySprite, int health){
        this.x = x;
        this.y = y;
        this.EnemySprite = EnemySprite;
        this.health = health;
    }

    @Override
    public void update(GameContainer container, int delta) {
        y --;
    }

    @Override
    public void render(GameContainer container, Graphics graphics) {
        if (!isDead()) {
            EnemySprite.drawCentered(x,y);
        }
    }

    public  void takeDamage(int damage){
            health -= damage;
    }

    public boolean isDead(){
        return health <= 0;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }
}
