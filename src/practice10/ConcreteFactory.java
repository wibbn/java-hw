package practice10;

public class ConcreteFactory {
    public Complex createComplex() {
        return new Complex();
    }
    public Complex createComplex(int real, int image) {
        return new Complex(real, image);
    }
}
