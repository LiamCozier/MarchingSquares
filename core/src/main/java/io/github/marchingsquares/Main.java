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
        Vector2[] vertices = {Vector2.ZERO,new Vector2(100, 100), new Vector2(100, 0)};
        t = new Triangle(vertices);
    }

    @Override
    public void render() {
        ScreenUtils.clear(0.1f, 0.1f, 0.15f, 1f);
        c.input();
        t.render(sr, c, Color.WHITE);
    }

    @Override
    public void dispose() {

    }
}
