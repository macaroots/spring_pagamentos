package br.tiia.pagamentos.entidades;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Table(name = "funcionarios")
public class Funcionario {

    @Id
    private int id;
    private String nome;
    private int salario;
    @ManyToOne
    @JoinColumn(name = "estado") 
    private Estado estado;
    
    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public int getSalario() {
        return salario;
    }
    public Estado getEstado() {
        return estado;
    }
    public int getPagamento() {
        return salario * 3;
    }

}
