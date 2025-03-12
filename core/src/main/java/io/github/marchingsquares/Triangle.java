package io.github.marchingsquares;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class Triangle {
    Vector2[] vertices;

    public Triangle(Vector2... vertices) {
        if (vertices.length == 3) {
            this.vertices = vertices;
        } else {
            System.out.println("Error: triangles need exactly 3 vertices!");
            this.vertices = new Vector2[]{Vector2.ZERO, Vector2.ZERO, Vector2.ZERO};
        }
    }

    public void render(ShapeRenderer sr, Camera c, Color color) {
        sr.setColor(color);
        sr.begin(ShapeRenderer.ShapeType.Filled);

        // screen space vertices
        Vector2[] ss_vertices = new Vector2[3];
        for (int i=0; i<2; i++) {
            ss_vertices[i] = c.global_to_screen_space(vertices[i]);
        }

        sr.triangle(ss_vertices[0].x, ss_vertices[0].y, ss_vertices[1].x, ss_vertices[1].y, ss_vertices[2].x, ss_vertices[2].y);
        sr.end();
    }

}
