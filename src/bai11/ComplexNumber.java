package bai11;

import java.util.Scanner;

public class ComplexNumber {
    double real;
    double complex;

    public ComplexNumber(){

    }
    public ComplexNumber(double real, double complex){
        this.real = real;
        this.complex = complex;
    }

    public void input(ComplexNumber complexNumber){
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        complexNumber.real = a;
        complexNumber.complex = b;
    }
    public void output(ComplexNumber complexNumber){
        if(complexNumber.complex > 0){
            System.out.println("số phức cần hiển thị là: " + complexNumber.real + "+" + complexNumber.complex +"i");
        }
        else System.out.println("số phức cần hiển thị là: " + complexNumber.real +  complexNumber.complex +"i");
    }

    public ComplexNumber sum(ComplexNumber first, ComplexNumber second){
        ComplexNumber result = new ComplexNumber();
        result.real = first.real + second.real;
        result.complex = first.complex + second.complex;
        return result;
    }
    public ComplexNumber multiple(ComplexNumber first, ComplexNumber second){
        ComplexNumber result = new ComplexNumber();
        result.real = first.real * second.real - first.complex* second.complex;
        result.complex = first.real * second.complex + first.complex * second.real;
        return  result;
    }

    public static void main(String[] args) {
        ComplexNumber first = new ComplexNumber();
        ComplexNumber second = new ComplexNumber();
        System.out.println("nhap so phuc 1: ");
        first.input(first);
        System.out.println("nhap so phuc 2: ");
        second.input(second);

        ComplexNumber res = new ComplexNumber();
        System.out.println("sum =" + res.sum(first, second).real + "+" + res.sum(first, second).complex + "i");
        System.out.println("multiple =" + res.multiple(first, second).real + "+" + res.multiple(first, second).complex + "i");
    }
}