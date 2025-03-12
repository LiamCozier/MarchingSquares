package io.github.marchingsquares;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.utils.ScreenUtils;

import java.util.Random;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class Main extends ApplicationAdapter {
    Camera c = new Camera();
    ShapeRenderer sr;
    Triangle t;

    @Override
    public void create() {
        sr = new ShapeRenderer();

        Vector2[] vertices = new Vector2[3];
        Random r = new Random();
        for (int i=0; i<3; i++) {
            vertices[i] = new Vector2(r.nextInt(500), r.nextInt(500));
        }
        t = new Triangle(vertices);
    }

    @Override
    public void render() {
        ScreenUtils.clear(0.1f, 0.1f, 0.15f, 1f);

        t.render(sr, c, Color.WHITE);
    }

    @Override
    public void dispose() {

    }
}
