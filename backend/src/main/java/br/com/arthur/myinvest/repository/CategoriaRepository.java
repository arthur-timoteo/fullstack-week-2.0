package br.com.arthur.myinvest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.arthur.myinvest.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
