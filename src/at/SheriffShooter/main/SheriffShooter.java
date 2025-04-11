package at.SheriffShooter.main;

import at.SheriffShooter.Actors.Sheriff;
import org.newdawn.slick.*;
import org.newdawn.slick.state.StateBasedGame;


public class SheriffShooter extends BasicGame {

    private Sheriff sheriff;
    private Image sheriffSprite; // bei sheriff klasse I_Sheriff

    public SheriffShooter(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
    sheriffSprite = new Image("testdata/Image/sheriff.png");
    sheriff = new Sheriff(400,300,10, sheriffSprite);
    }


    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
    sheriff.update(gameContainer, delta);
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
    graphics.drawString("Use W/A/S/D to move, Left Mouse click to shoot",10,30);
    sheriff.render(gameContainer, graphics);
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new SheriffShooter("SheriffShooter"));
            container.setDisplayMode(800, 600, false);
            container.setShowFPS(false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
