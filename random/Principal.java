public class Principal {
    public static void main(String[] args){
        Pessoa p = new Pessoa("João", 18);
        Carro c = new Carro("Ford", "Ka", 2004);
        c.exibirDados();
        int vezes = 0;
        while(vezes < 8){
            c.acelerar();
            c.exibirDados();
            vezes++;
        }

        // while(c.getVelocidade() > 0){
        //     c.frear();
        //     c.exibirDados();
        // } 

        while(c.getVelocidade() > 70){
            c.parar();
            c.exibirDados();

        }

        System.out.printf("Olá, mundo. eu sou %d e tenho %d anos", nome, idade);
    }
}
