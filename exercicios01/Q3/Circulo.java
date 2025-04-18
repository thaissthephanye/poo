public class Circulo {
    private float raio;

    public Circulo(float raio){
        this.raio = raio;
    }

    public double calcularArea(){
        double pi = 3.141516;
        double area = pi * raio * raio;
        return area;
    }

    public double calcularPerimetro(){
        double pi = 3.141516;
        double perim = 2 * pi * raio;
        return perim;
    }

    public void imprimir(){
        System.out.printf("O raio do circulo vale %f%n", raio);
        double area = calcularArea();
        System.out.printf("A area do circulo vale %f%n", area);
        double perim = calcularPerimetro();
        System.out.printf("O perimetro do circulo vale %f", perim);
    }

    public static void main(String[] args) {
        Circulo c = new Circulo(7);
        c.imprimir();
    }
}
