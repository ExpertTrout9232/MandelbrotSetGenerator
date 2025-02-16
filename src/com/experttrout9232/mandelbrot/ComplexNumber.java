package com.experttrout9232.mandelbrot;

public class ComplexNumber {
    private final double real;
    private final double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(real + other.getReal(), imaginary + other.getImaginary());
    }

    public ComplexNumber square() {
        return new ComplexNumber(real * real - imaginary * imaginary, 2 * real * imaginary);
    }

    public double absolute() {
        return Math.sqrt(real * real + imaginary * imaginary);
    }
}
