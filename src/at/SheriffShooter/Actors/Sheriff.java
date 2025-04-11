package at.SheriffShooter.Actors;

import at.SheriffShooter.core.Actor;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;

public class Sheriff implements Actor {

    private Revolver revolver;
    private Image sheriffSprite;
    private float x,y;
    private float speed;


    public Sheriff(float x, float y, float speed, Image sheriffSprite){
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.sheriffSprite = sheriffSprite;
        this.revolver = new Revolver();
    }
    @Override
    public void update(GameContainer container, int delta) {
        Input input = container.getInput();

        if(input.isKeyDown(Input.KEY_W)) y -= speed * delta;
        if(input.isKeyDown(Input.KEY_S)) y += speed * delta;
        if(input.isKeyDown(Input.KEY_A)) x -= speed * delta;
        if(input.isKeyDown(Input.KEY_D)) x += speed * delta;

        if(input.isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
            float mouseX = input.getMouseX();
            float mouseY = input.getMouseY();
            float dirX = mouseX - x;
            float dirY = mouseY - y;
            revolver.shoot(x, y, dirX, dirY);
        }
        revolver.update(container, delta);
    }


    @Override
    public void render(GameContainer container, Graphics graphics) {
        sheriffSprite.drawCentered(x,y);
        revolver.render(container, graphics);
    }

    public float getY() {
        return y;
    }

    public float getX() {
        return x;
    }

    public Revolver getRevolver() {
        return revolver;
    }
}
