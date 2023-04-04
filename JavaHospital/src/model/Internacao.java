package Model;

public class Internacao {
    private static int contador = 1;
    private int id;
    private Paciente paciente;
    private Medico medico;
    private Enfermeiro enfermeiro;
    private String motivo;
    private double valorDia;
    private int dias;

    public Internacao(Paciente paciente, Medico medico, Enfermeiro enfermeiro, String motivo, double valorDia, int dias) {
        this.id = contador++;
        this.paciente = paciente;
        this.medico = medico;
        this.enfermeiro = enfermeiro;
        this.motivo = motivo;
        this.valorDia = valorDia;
        this.dias = dias;
    }

    public int getId() {
        return id;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public Enfermeiro getEnfermeiro() {
        return enfermeiro;
    }

    public String getMotivo() {
        return motivo;
    }

    public double getValorDia() {
        return valorDia;
    }

    public int getDias() {
        return dias;
    }

    public double getValorTotal() {
        return valorDia * dias;
    }
}