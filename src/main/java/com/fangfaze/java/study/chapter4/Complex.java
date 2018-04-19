package com.fangfaze.java.study.chapter4;

public class Complex {
    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    private final double re;
    private final double im;

    public Complex add(Complex c) {
        return new Complex(re + c.re, im + c.im);
    }

    public Complex subtract(Complex c) {
        return new Complex(re - c.re, im - c.im);
    }

    public Complex mutiply(Complex c) {
        return new Complex(re * c.re - im * c.im,
                im * c.re + re * c.im);
    }

    public Complex divide(Complex c) {
        double tmp = c.re * c.re + c.im * c.im;
        return new Complex((re * c.re + im * c.im) / tmp,
                (im * c.re - re * c.im) / tmp);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Complex)) return false;

        return Double.compare(re, ((Complex) o).re) == 0
                && Double.compare(im, ((Complex) o).im) == 0;
    }

    @Override
    public int hashCode() {
        int result = 189;
        result += 31 * result + hashDouble(re);
        result += 31 * result + hashDouble(im);
        return result;
    }

    private int hashDouble(double d) {
        long l = Double.doubleToLongBits(d);
        return (int) (l ^ (l >>> 32));
    }

    @Override
    public String toString() {
        return "(" + re + "+" + im + "i)";
    }

}
