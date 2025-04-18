
public class Quadrado {
    private int lado;

    public Quadrado(int lado){
        this.lado = lado;
    }

    public int calcularArea(){
        int area = lado * lado;
        return area;
    }

    public int calcularPerimetro(){
        int perim = 4 * lado;
        return perim;
    }

    public void imprimir(){
        System.out.printf("O lado do quadrado vale %d%n", lado);
        int area = calcularArea();
        System.out.printf("A area do quadrado vale %d%n", area);
        int perim = calcularPerimetro();
        System.out.printf("O perimetro do quadrado vale %d", perim);

    }

    public static void main(String[] args){
    Quadrado q = new Quadrado(10);
    q.imprimir();
}
}


