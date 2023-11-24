import java.util.Scanner;

public class Rational
{
	private int numerator;
	private int denominator;
	private double numberValue;
	
	Rational(int numerator, int denominator) 
	{
		this.numerator = numerator;
		this.denominator = denominator;
		if (numerator == 0 || denominator == 0) this.numberValue = 0;
		else this.numberValue = numerator/denominator;
	}

    public Rational add(Rational rationalz)
    {
    	int topLine = (rationalz.numerator * this.denominator)+(rationalz.denominator * this.numerator);
    	int bottomLine = (rationalz.denominator * this.denominator);
    	return new Rational(topLine, bottomLine);
    }

    public int getNumerator()
    {
    	return numerator;
    }

    public int getDenominator()
    {
    	return denominator;
    }

    public Rational sub(Rational rationalz)
    {
    	int topLine = (this.numerator * rationalz.denominator)-(rationalz.numerator * this.denominator);
    	int bottomLine = (rationalz.denominator * this.denominator);
    	return new Rational(topLine, bottomLine);
    }

    public Rational mul(Rational rationalz)
    {
    	int topLine = this.numerator * rationalz.numerator;
    	int bottomLine = this.denominator * rationalz.denominator;
    	return new Rational(topLine, bottomLine);
    }

    public Rational div(Rational rationalz)
    {
    	int topLine = this.numerator * rationalz.denominator;
    	int bottomLine = this.denominator * rationalz.numerator;
    	return new Rational(topLine, bottomLine);
    }

    public boolean equals(Rational rationalz)
    {
    	if ((this.numerator * rationalz.denominator) == (rationalz.numerator * this.denominator)) return true;
    	else return false;
    }

    public boolean isLessThan(Rational rationalz)
    {
    	if ((this.numerator * rationalz.denominator) < (rationalz.numerator * this.denominator)) return true;
    	else return false;
    }
	
    public Rational simplify()
    {
    	int GCD = 1;
    	for (int i = 1; i <= this.denominator; i++) {
    		if (this.numerator % i == 0 && this.denominator % i == 0)
    			GCD = i;
    	}
    	if (this.denominator < 0)
    		return new Rational(-(this.numerator/GCD), -(this.denominator/GCD));
    	else 
    		return new Rational((this.numerator/GCD), (this.denominator/GCD));
    }

    public String toString() 
    {
    	if (this.denominator == 1) return Integer.toString(this.numerator);
    	else return this.numerator+"/"+this.denominator;
    }

    public static void main(String[] args)
    {
    	Rational[] rationals = new Rational[2];
    	
    	System.out.println("Please enter two rational numbers separated by a space e.g. \"5/7 9/6\"\r\n");
    	
    	Scanner input = new Scanner(System.in);
        String str;
        str = input.nextLine();
        String[] splitStr = str.split(" ");

        for(int i = 0; i < splitStr.length; i++) {
            String[] fract = splitStr[i].split("/");
            int value1 = Integer.valueOf(fract[0]);
            int value2= 1;
            if(fract.length == 2){
            	value2 = Integer.valueOf(fract[1]);
            }
            rationals[i] = new Rational(value1, value2);
        }
        input.close();
        
        System.out.println(rationals[0].toString() + " " + rationals[1].toString());
        System.out.println("");
        System.out.println((rationals[0].toString()) + " + " + rationals[1].toString() + " = " + (rationals[0].add(rationals[1])).simplify().toString());
        System.out.println((rationals[0].toString()) + " - " + rationals[1].toString() + " = " + (rationals[0].sub(rationals[1])).simplify().toString());
        System.out.println((rationals[0].toString()) + " * " + rationals[1].toString() + " = " + (rationals[0].mul(rationals[1])).simplify().toString());
        System.out.println((rationals[0].toString()) + " / " + rationals[1].toString() + " = " + (rationals[0].div(rationals[1])).simplify().toString());
        System.out.print("( " + rationals[0].toString() + " == " + rationals[1].toString() + " ) = ");
        if (rationals[0].equals(rationals[1])) System.out.println("true");
        else System.out.println("false");
        System.out.print("( " + rationals[0].toString() + " < " + rationals[1].toString() + " ) = ");
        if (rationals[0].isLessThan(rationals[1])) System.out.println("true");
        else System.out.println("false");
        System.out.println((rationals[0].toString()) + " simplified is " + rationals[0].simplify().toString());
        System.out.println((rationals[1].toString()) + " simplified is " + rationals[1].simplify().toString());
    	
    }
}