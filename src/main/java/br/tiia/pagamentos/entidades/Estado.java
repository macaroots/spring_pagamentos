package br.tiia.pagamentos.entidades;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;

@Entity
@Table(name = "estados")
public class Estado {

    @Id
    private String sigla;
    private String nome;
    
    public String getSigla() {
        return sigla;
    }
    public String getNome() {
        return nome;
    }

}
