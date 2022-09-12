package br.tiia.pagamentos.repositorios;

import org.springframework.data.repository.CrudRepository;

import br.tiia.pagamentos.entidades.Funcionario;

public interface FuncionariosRepository extends CrudRepository<Funcionario, Integer> {

}
