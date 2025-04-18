public class Retangulo {
    private int comprimento;
    private int largura;

    public Retangulo(int comprimento, int largura){
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public int calcularArea(){
        int area = comprimento * largura;
        return area;
    }

    public int calcularPerimetro(){
        int perim = (2 * comprimento) + (2 * largura);
        return perim;
    }

    public void imprimir(){
        System.out.printf("O comprimento do retangulo vale %d%n", comprimento);
        System.out.printf("A largura do retangulo vale %d%n", largura);
        int area = calcularArea();
        System.out.printf("A area do retangulo vale %d%n", area);
        int perim = calcularPerimetro();
        System.out.printf("O perimetro do retangulo vale %d%n", perim);
    }

    public static void main(String[] args) {
        Retangulo r = new Retangulo(4, 10);
        r.imprimir();
    }
}
