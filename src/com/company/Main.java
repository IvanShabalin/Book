package com.company;

import java.net.ServerSocket;

public class Main {

    public static void main(String[] args) {
        Fraction fr = new Fraction();
        //fr.init(1, 2);

        fr.print();

        Fraction fr2 = new Fraction(1,2);

        fr2.print();

        Fraction fr3 = new Fraction(1,0);

        fr3.print();
        //fr.setDenominator(21);
        //fr.setNumerator(23);


        //fr.init(2, 4);
        //fr.print();

        //System.out.println(fr.getNumerator());


        /*fr.denominator =0;

        fr1.numerator = 1;
        fr1.denominator = 2;

        fr2.numerator = 5;
        fr2.denominator = 6;

        Fraction fr3;

        fr3 = add(fr1, fr2);

        System.out.println(fr3.numerator + "/" + fr3.denominator);

    }

    public static Fraction add(Fraction f1, Fraction f2) {
        int num;
        int den;
        den = f1.denominator * f2.denominator;
        num = f1.numerator * f2.denominator + f1.denominator * f2.numerator;

        Fraction f = new Fraction();

        f.numerator = num;
        f.denominator = den;
        return f;
    }*/
    }
}
