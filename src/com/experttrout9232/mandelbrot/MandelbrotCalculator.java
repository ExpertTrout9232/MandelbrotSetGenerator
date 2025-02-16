package com.experttrout9232.mandelbrot;

public class MandelbrotCalculator {
    public static int calculateMandelbrotSet(ComplexNumber c, MandelbrotConfig config) {
        ComplexNumber z = new ComplexNumber(0, 0);
        int iteration = 0;

        while (iteration < config.maxIterations()) {
            z = c.add(z.square());

            if (z.absolute() > 2) {
                break;
            }

            iteration++;
        }

        return iteration;
    }
}