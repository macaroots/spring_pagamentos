package br.tiia.pagamentos;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.data.repository.CrudRepository;


//import java.util.List;

public abstract class CrudController {
	
	public abstract CrudRepository getDao();
	
	@GetMapping()
    public Iterable<Object> listar() {
        return getDao().findAll();
    }
    public Object inserir(Object bean) {
        try {
            return getDao().save(bean);
        } catch (Exception e) {
            return e;
        }
    }
	@GetMapping("/{id}")
    public Object getById(@PathVariable("id") int id) {
        return getDao().findById(id);
    }
	@DeleteMapping("/{id}")
    public void apagar(int id) {
        getDao().delete(id);
    }

}
