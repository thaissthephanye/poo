public class Pessoa{
    private String nome;
    private int idade;

    //construtor
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }


    public void falar(){
        System.out.println("Olá, mundo!");
    }

}
