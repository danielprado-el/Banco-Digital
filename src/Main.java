
public class Main {

    public static void main(String[] args) {
        // Abrindo o Banco
        Banco banco = new Banco("Banco");

        // Cadastrando clientes.
        Cliente gabriela = new Cliente("Gabriela", "111.111.111-11");
        Cliente daniel = new Cliente("Daniel", "222.222.222-22");

        // Criando conta dos clientes.
        Conta gabrielaCorrente = new ContaCorrente(gabriela);
        Conta danielPoupanca = new ContaPoupanca(daniel);

        // Adicionando as contas no sistema do banco.
        banco.addConta(gabrielaCorrente);
        banco.addConta(danielPoupanca);

        // Depositando o valor na conta.
        gabrielaCorrente.depositar(100);

        // Tranferindo o valor da conta para outra
        gabrielaCorrente.transferir(25, danielPoupanca);

        // Imprimindo extrato das contas.
        gabrielaCorrente.imprimirExtrato();
        danielPoupanca.imprimirExtrato();

        // Listando os clientes.
        banco.listarClientes();
    }
}
