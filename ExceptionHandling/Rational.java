package ExceptionHandling;

public class Rational {
    private int numerator;
    private int denominator;

    public Rational(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero");
        }
        int gcd = gcd(numerator, denominator);
        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public Rational add(Rational other) {
        int num = numerator * other.denominator + other.numerator * denominator;
        int den = denominator * other.denominator;
        return new Rational(num, den);
    }

    public Rational subtract(Rational other) {
        int num = numerator * other.denominator - other.numerator * denominator;
        int den = denominator * other.denominator;
        return new Rational(num, den);
    }

    public Rational multiply(Rational other) {
        int num = numerator * other.numerator;
        int den = denominator * other.denominator;
        return new Rational(num, den);
    }

    public Rational divide(Rational other) {
        if (other.numerator == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        int num = numerator * other.denominator;
        int den = denominator * other.numerator;
        return new Rational(num, den);
    }

    public double toDouble() {
        return (double) numerator / denominator;
    }

    public Rational abs() {
        int num = Math.abs(numerator);
        int den = Math.abs(denominator);
        return new Rational(num, den);
    }

    public int compareTo(Rational other) {
        int num1 = numerator * other.denominator;
        int num2 = other.numerator * denominator;
        return Integer.compare(num1, num2);
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        try {
            int num1 = Integer.parseInt(args[0]);
            int den1 = Integer.parseInt(args[1]);
            int num2 = Integer.parseInt(args[2]);
            int den2 = Integer.parseInt(args[3]);
            Rational r1 = new Rational(num1, den1);
            Rational r2 = new Rational(num2, den2);
            System.out.println("r1 = " + r1);
            System.out.println("r2 = " + r2);
            System.out.println("r1 + r2 = " + r1.add(r2));
            System.out.println("r1 - r2 = " + r1.subtract(r2));
            System.out.println("r1 * r2 = " + r1.multiply(r2));
            System.out.println("r1 / r2 = " + r1.divide(r2));
            System.out.println("|r1| = " + r1.abs());
            System.out.println("|r2| = " + r2.abs());
            System.out.println("r1 as double = " + r1.toDouble());
            System.out.println("r2 as double = " + r2.toDouble());
            System.out.println("r1 compared to r2 = " + r1.compareTo(r2));
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: " + e.getMessage());
        }
    }
}