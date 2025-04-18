public class Carro {
    private String fabricante;
    private String modelo;
    private int ano;
    private int velocidade;

    public Carro(String fabricante, String modelo, int ano){
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.ano = ano;
    }

    public int getVelocidade(){
        return velocidade;
    }

    public void acelerar(){
        velocidade += 10;
    }

    public void frear(){
        velocidade -= 10;
    }

    public void parar(){
        velocidade = 0;
    }

    public void exibirDados(){
        System.out.printf("%s %s %d %d", fabricante, modelo, ano, velocidade);
    }
}
