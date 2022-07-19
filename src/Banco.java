import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;
    private List<Conta> contas;
    public String getNome() {
        return nome;
    }

    public Banco(String nome) {
        contas = new ArrayList<Conta>();
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void addConta(Conta conta) {
        contas.add(conta);
    }

    public void listarClientes(){
        System.out.println("=== Lista de Clientes ===");

        if (!getContas().isEmpty()){
            for (Conta conta : getContas()) {
                System.out.println(conta.cliente.getNome());
            }
        } else {
            System.out.println("Não existe contas cadastradas.");
        }
    }
}
