package com.experttrout9232.mandelbrot;

public class MandelbrotGenerator {
    public static void generateMandelbrotSet(MandelbrotConfig config) {
        double incrementReal = calculateIncrementReal(config.minReal(), config.maxReal(), config.width());
        double incrementImaginary = calculateIncrementImaginary(config.minImaginary(), config.maxImaginary(), config.height());
        double real = config.minReal();
        double imaginary = config.minImaginary();
        MandelbrotRenderer renderer = new MandelbrotRenderer(config.width(), config.height());

        for (int y = 0; y < config.height(); y++) {
            real = config.minReal();

            for (int x = 0; x < config.width(); x++) {
                double ratio = (double) MandelbrotCalculator.calculateMandelbrotSet(new ComplexNumber(real, imaginary), config) / config.maxIterations();
                int color = (int) (255 * (1.0 - ratio));

                renderer.drawPixel(x, y, color);

                real += incrementReal;
            }

            imaginary += incrementImaginary;
        }

        renderer.renderMandelbrotSet();
    }

    private static double calculateIncrementReal(double minReal, double maxReal, int width) {
        return (maxReal - minReal) / (width - 1);
    }

    private static double calculateIncrementImaginary(double minImag, double maxImag, int height) {
        return (maxImag - minImag) / (height - 1);
    }
}