public class Circulo implements AreaCalculavel {
    
    private double raio;
    private double pi = 3.14;
    
    public Circulo(double raio, double pi) {
        this.raio = raio;
        this.pi = pi;
    }

    @Override
    public double calculaArea() {
        return this.pi * (this.raio * this.raio);
    }
}
