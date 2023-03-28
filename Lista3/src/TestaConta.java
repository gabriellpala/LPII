public class TestaConta {
    public static void main(String[] args) {
        Conta c = new Conta(null, 0);
        ContaCorrente cc = new ContaCorrente(null, 0);
        ContaPoupanca cp = new ContaPoupanca(null, 0);

        c.deposita(1000);
        cc.deposita(1000);
        cp.deposita(1000);

        c.atualiza(0.10);
        cc.atualiza(0.10);
        cp.atualiza(0.10);

        System.out.println(c.getSaldo());
        System.out.println(cc.getSaldo());
        System.out.println(cp.getSaldo());
    }
}