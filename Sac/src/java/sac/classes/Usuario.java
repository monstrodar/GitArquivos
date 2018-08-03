

package sac.classes;

public class Usuario {
    
    private int codigo;
    private String cpf;
    private String nome;
    private char tipo; //c ou f

    public Usuario(int codigo, String cpf, String nome, char tipo) {
        this.codigo = codigo;
        this.cpf = cpf;
        this.nome = nome;
        this.tipo = tipo;
    }

    public Usuario() {
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

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }
    
    
    
    
}
