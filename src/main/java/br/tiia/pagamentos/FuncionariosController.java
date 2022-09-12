package br.tiia.pagamentos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.data.repository.CrudRepository;

import br.tiia.pagamentos.repositorios.FuncionariosRepository;
import br.tiia.pagamentos.entidades.Funcionario;
import br.tiia.pagamentos.CrudController;


@RestController
@RequestMapping("/funcionarios")
public class FuncionariosController extends CrudController {

	@Autowired
	private FuncionariosRepository dao;
	public CrudRepository getDao() {
        return dao;
    }
    
	@PostMapping()
    public Object inserir(@RequestBody Funcionario bean) {
        return super.inserir(bean);
    }
	/*
	@GetMapping("/form")
    public String form(Model model) {
        model.addAttribute("estados", daoEstados.findAll());
        return "funcionarios/form";
    }*/
	
}
