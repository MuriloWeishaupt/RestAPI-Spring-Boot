package br.com.fecaf.services;


import br.com.fecaf.model.Contato;
import br.com.fecaf.repository.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContatoService {

    @Autowired
    private ContatoRepository contatoRepository;

    //Método para retornar contatos
    public List<Contato> listarContatos() {
        return contatoRepository.findAll();
    }

    //Método para salvar contatos
    public Contato salvarContato(Contato contato) {
        return contatoRepository.save(contato);
    }

    //Método para deletar contatos
    public void deletarContato(int id) {
        contatoRepository.deleteById(id);
    }
}
