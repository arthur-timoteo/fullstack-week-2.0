package br.com.arthur.myinvest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.arthur.myinvest.domain.Categoria;
import br.com.arthur.myinvest.repository.CategoriaRepository;

@RestController
@RequestMapping("/categorias")
public class CategoriaResource {
	
	@Autowired
	private CategoriaRepository categoriaRepository;

	@GetMapping
	public List<Categoria> listarTodas(){
		return categoriaRepository.findAll();
	}
	
	@GetMapping("/{codigo}")
	public Categoria buscarPeloCodigo(@PathVariable Long codigo){
		return categoriaRepository.findById(codigo).orElse(null);
	}
	
	@DeleteMapping
	public void remover(@PathVariable Long codigo){
		categoriaRepository.deleteById(codigo);
	}
	
	@PostMapping
	public Categoria cadastrar(@RequestBody Categoria categoria){
		return categoriaRepository.save(categoria);
	}
}
