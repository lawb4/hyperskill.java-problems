class Complex {
    double real;
    double image;

    // write methods here
    public void add(Complex num) {
        this.real += num.real;
        this.image += num.image;
    }

    public void subtract(Complex num) {
        this.real -= num.real;
        this.image -= num.image;
    }

    /*public static void main(String[] args) {
        Complex number = new Complex();
        number.real = 10;
        number.image = 4;
// math expression of number = 10.0 + 4.0i

        Complex anotherNumber = new Complex();
        anotherNumber.real = 6;
        anotherNumber.image = 6;
// math expression of anotherNumber = 6.0 + 6.0i

        number.add(anotherNumber); // number = 16.0 + 10.0i
    }*/
}
