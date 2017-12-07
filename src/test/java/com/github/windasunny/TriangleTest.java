package com.github.windasunny;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {
    @Test
    public void getTypeNoTriangle() throws Exception {
        // Arrange
        write triangle = new write(5, 10, 5);

        // Act
        String result = triangle.getType();

        // Assert
        Assert.assertEquals("不是三角形", result);
    }

}
