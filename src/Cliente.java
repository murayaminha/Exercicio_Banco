public class Cliente {
    private int numeroDeIdentificacao;
    private String sobrenome;
    private String rg;
    private String CPF;

    public Cliente(int numeroDeIdentificacao, String sobrenome, String rg, String CPF) {
        this.numeroDeIdentificacao = numeroDeIdentificacao;
        this.sobrenome = sobrenome;
        this.rg = rg;
        this.CPF = CPF;
    }
    public Cliente(){}

    public int getNumeroDeIdentificacao() {
        return numeroDeIdentificacao;
    }

    public void setNumeroDeIdentificacao(int numeroDeIdentificacao) {
        this.numeroDeIdentificacao = numeroDeIdentificacao;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
}
