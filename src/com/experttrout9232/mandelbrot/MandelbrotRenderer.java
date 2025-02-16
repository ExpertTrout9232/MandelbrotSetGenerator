package com.experttrout9232.mandelbrot;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class MandelbrotRenderer {
    private final BufferedImage canvas;
    int frameWidth;
    int frameHeight;

    MandelbrotRenderer(int width, int height) {
        canvas = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        frameWidth = width;
        frameHeight = height;
    }

    public void drawPixel(int x, int y, int intensity) {
        Color color = new Color(intensity, intensity, intensity);

        canvas.setRGB(x, y, color.getRGB());
    }

    public void renderMandelbrotSet() {
        JFrame frame = new JFrame("Mandelbrot Set");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(frameWidth, frameHeight);
        frame.add(new JLabel(new ImageIcon(canvas)));
        frame.pack();
        frame.setVisible(true);
    }
}