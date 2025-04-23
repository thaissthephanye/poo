public class Funcionario {
    private int codigo;
    private String nome;
    private String CPF;
    private String endereco;
    private String telefone;
    private int idade;
    private float salario;

    public Funcionario(int codigo, String nome, String CPF, String endereco, String telefone, int idade, float salario){
        this.codigo = codigo;
        this.nome = nome;
        this.CPF = CPF;
        this.endereco = endereco;
        this.telefone = telefone;
        this.idade = idade;
        this.salario = salario;
    }

    public int getCodigo(){
        return codigo;
    }
    public String getNome(){
        return nome;
    }
    public String getCPF(){
        return CPF;
    }
    public String getEndereco(){
        return endereco;
    }
    public String getTelefone(){
        return telefone;
    }
    public int getIdade(){
        return idade;
    }
    public float getSalario(){
        return salario;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCPF(String CPF){
        this.CPF = CPF;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setSalario(float salario){
        this.salario = salario;
    }


    public float calculaSalarioLiquido(){
        return salario * 0.89f;
    }

    public String toString(){
        return String.format("Código: %d / Nome: %s / CPF: %s%n"+
        "Endereco: %s / Telefone: %s / Idade: %d%n"+
        "Salario bruto: R$%.2f / Salario liquido: R$%.2f", codigo, nome, CPF, endereco, telefone, idade, salario, calculaSalarioLiquido());
    }

    

}
