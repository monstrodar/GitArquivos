
package sac.classes;


import java.security.Timestamp;
import java.sql.Date;


public class Sac {
    
    
    private int codigo;
    private String cpf;
    private String nome;
    private Date datareclamacao;
    private Date dataresposta;
    private String reclamacao;
    private String resposta;

    public Sac(int codigo, String cpf, String nome, Date datareclamacao, Date dataresposta, String reclamacao, String resposta) {
        this.codigo = codigo;
        this.cpf = cpf;
        this.nome = nome;
        this.datareclamacao = datareclamacao;
        this.dataresposta = dataresposta;
        this.reclamacao = reclamacao;
        this.resposta = resposta;
    }

    public Sac() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDatareclamacao() {
        return datareclamacao;
    }

    public void setDatareclamacao(Date datareclamacao) {
        this.datareclamacao = datareclamacao;
    }

    public Date getDataresposta() {
        return dataresposta;
    }

    public void setDataresposta(Date dataresposta) {
        this.dataresposta = dataresposta;
    }

   
    

    public String getReclamacao() {
        return reclamacao;
    }

    public void setReclamacao(String reclamacao) {
        this.reclamacao = reclamacao;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }
    
    
    
    
    
    
}
