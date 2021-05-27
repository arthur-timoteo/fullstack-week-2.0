package br.com.arthur.myinvest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.arthur.myinvest.domain.Investimento;

public interface InvestimentoRepository extends JpaRepository<Investimento, Long> {

}
