public class Retangulo implements AreaCalculavel {
    private int altura;
    private int largura;

    public Retangulo (int altura, int largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public double calculaArea() {
        return this.largura * this.altura;
    }
}
