public class Calendario {
    private int dia;
    private int mes;
    private int ano;

    public Calendario(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String nomeMes(int mes){
        String nome;
        switch (mes) {
            case 1:
                nome = "janeiro";
                break;
            case 2:
                nome = "fevereiro";
                break;
            case 3:
                nome = "março";
                break;
            case 4:
                nome = "abril";
                break;
            case 5: 
                nome = "maio";
                break;
            case 6:
                nome = "junho";
                break;
            case 7:
                nome = "julho";
                break;
            case 8:
                nome = "agosto";
                break;
            case 9:
                nome = "setembro";
                break;
            case 10:
                nome = "outubro";
                break;
            case 11:
                nome = "novembro";
                break;
            case 12:
                nome = "dezembro";
                break;
        
            default:
                nome = "mes invalido";
        }
        return nome;
    }

    public void mostrarData(){
        System.out.printf("%d de %s de %d%n", dia, nomeMes(mes), ano);
    }

    public void anoBissexto(){
        boolean bissexto = (ano % 400 == 0) || (ano % 4 == 0 && ano % 100 !=0);

        if(bissexto){
            System.out.printf("O ano %d é bissexto.%n", ano);
        } else{
            System.out.printf("O ano %d não é bissexto%n", ano);
        }
    }
}
