package at.SheriffShooter.core;

import at.SheriffShooter.Actors.Enemy;
import at.SheriffShooter.Actors.Sheriff;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

import java.util.List;

public class GameLevel implements Actor{
    private List<Enemy> enemies;
    private Sheriff sheriff;
    private int levelNumber;

    public void startlevel(){


    }

    public boolean isLevelComplete(){
        return false;
    }

    @Override
    public void update(GameContainer container, int delta) {

    }

    @Override
    public void render(GameContainer container, Graphics graphics) {

    }
}
