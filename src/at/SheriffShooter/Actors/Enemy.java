package at.SheriffShooter.Actors;

import at.SheriffShooter.core.Actor;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;

public class Enemy implements Actor {

    protected float x,y;
    protected int health;
    protected Image EnemySprite;

    public  void takeDamage(int damage){

    }

    public boolean isDead(){
        return false;
    }
    @Override
    public void update(GameContainer container, int delta) {

    }

    @Override
    public void render(GameContainer container, Graphics graphics) {

    }
}
