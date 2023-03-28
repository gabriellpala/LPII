package contasPagas;

public class Cliente {
    private String nomeCliente;
    private String cpf;

    public Cliente(String nomeCliente, String cpf) {
        this.nomeCliente = nomeCliente;
        this.cpf = cpf;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
