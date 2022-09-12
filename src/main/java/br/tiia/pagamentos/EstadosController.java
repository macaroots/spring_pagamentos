package br.tiia.pagamentos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.data.repository.CrudRepository;

import br.tiia.pagamentos.repositorios.EstadosRepository;
import br.tiia.pagamentos.entidades.Estado;
import br.tiia.pagamentos.CrudController;


@RestController
@RequestMapping("/estados")
public class EstadosController extends CrudController {

	@Autowired
	private EstadosRepository dao;
	public CrudRepository getDao() {
        return dao;
    }
	
	@PostMapping()
    public Object inserir(@RequestBody Estado bean) {
        return super.inserir(bean);
    }
	@GetMapping("/{sigla}")
    public Object getById(@PathVariable("sigla") String sigla) {
        return getDao().findById(sigla);
    }
}
