package at.SheriffShooter.Actors;

import at.SheriffShooter.core.Actor;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class Enemy implements Actor {

    private  float x,y;
    private int health;

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
