package com.experttrout9232.mandelbrot;

public class MandelbrotSet {
    public static void main(String[] args) {
        MandelbrotConfig config = new MandelbrotConfig(512, 512, -1.5, 0.5, -1, 1, 64);

        MandelbrotGenerator.generateMandelbrotSet(config);
    }
}