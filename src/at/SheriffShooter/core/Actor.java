package at.SheriffShooter.core;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public interface Actor {
    void update(GameContainer container, int delta);
    void render(GameContainer container, Graphics graphics);
}
