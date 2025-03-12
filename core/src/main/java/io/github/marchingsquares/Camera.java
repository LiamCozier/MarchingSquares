package io.github.marchingsquares;

import com.badlogic.gdx.Gdx;

public class Camera {
    Vector2 position;

    public Camera(Vector2 position) {
        this.position = position;
    }

    public Camera() {
        this.position = Vector2.ZERO;
    }

    public Vector2 global_to_screen_space(Vector2 pos) {
        Vector2 screen_centre = new Vector2(
            (float) Gdx.graphics.getWidth() / 2,
            (float) Gdx.graphics.getHeight() /2
        );

        Vector2 relative_position = Vector2.sub(pos, this.position);

        return Vector2.add(screen_centre, relative_position);
    }
}
