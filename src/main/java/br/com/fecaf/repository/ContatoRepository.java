package br.com.fecaf.repository;

import br.com.fecaf.model.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

//Implementa métodos CRUD
public interface ContatoRepository extends JpaRepository<Contato, Integer> {


}
