package br.com.contats.repository;

import br.com.contats.model.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

//Implementa métodos CRUD
public interface ContatoRepository extends JpaRepository<Contato, Integer> {


}
