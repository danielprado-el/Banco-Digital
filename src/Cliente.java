public class Cliente {

    private String nome;
    private String CPF;

    public Cliente(String nome, String CPF) {
        this.nome = nome;
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public String getCPF() { return CPF; }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCPF(String CPF) { this.CPF = CPF; }
}
