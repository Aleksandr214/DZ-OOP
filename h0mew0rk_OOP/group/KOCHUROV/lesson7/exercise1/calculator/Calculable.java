package group.KOCHUROV.lesson7.exercise1.calculator;

import group.KOCHUROV.lesson7.exercise1.complex.Complex;

public interface Calculable {
    Calculable sum(Complex arg);
    Calculable multi(Complex arg);
    Calculable div(Complex arg);
    Calculable minus(Complex arg);
    Complex getResult();
}
