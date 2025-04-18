public class Fitas {
    private String titulo;
    private float precoPorDia;

    public Fitas(String titulo, float precoPorDia){
        this.titulo = titulo;
        this.precoPorDia = precoPorDia;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getPrecoPorDia() {
        return precoPorDia;
    }

    public double getValorAluguel(int numeroDeDiasAlugada) {
        return precoPorDia * numeroDeDiasAlugada;
    }

    public String toString(){
        return String.format("FitaVideo [Titulo: %s, Preco/dia: R$%.2f]", titulo, precoPorDia);
    }
}
