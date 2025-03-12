package io.github.marchingsquares;

public class Triangle {
    Vector2[] vertices = new Vector2[3];

    public Triangle(Vector2... vertices) {
        if (vertices.length == 3) {
            this.vertices = vertices;
        } else {
            System.out.println("Error: triangles need exactly 3 vertices!");
            this.vertices = new Vector2[]{Vector2.ZERO, Vector2.ZERO, Vector2.ZERO};
        }
    }

}
