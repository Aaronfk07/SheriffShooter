package at.SheriffShooter.Actors;

import at.SheriffShooter.core.Actor;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;

public class Enemy implements Actor {

    protected float x, y;
    protected int health;
    protected float speed;
    protected Image enemySprite; // Corrected variable name

    public Enemy(float x, float y, Image enemySprite, int health, float speed) {
        this.x = x;
        this.y = y;
        this.enemySprite = enemySprite; // Corrected initialization
        this.health = health;
        this.speed = speed;
    }

    @Override
    public void update(GameContainer container, int delta) {
        x += speed * delta; // Move downwards
    }

    @Override
    public void render(GameContainer container, Graphics graphics) {
        if (!isDead()) {
            enemySprite.drawCentered(x, y); // Corrected variable name
        }
    }

    public void takeDamage(int damage) {
        health -= damage;
    }

    public boolean isDead() {
        return health <= 0;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }
}
