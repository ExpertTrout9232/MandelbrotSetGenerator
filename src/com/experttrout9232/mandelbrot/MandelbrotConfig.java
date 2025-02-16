package com.experttrout9232.mandelbrot;

public record MandelbrotConfig(
        int width,
        int height,
        double minReal,
        double maxReal,
        double minImaginary,
        double maxImaginary,
        int maxIterations
) {}