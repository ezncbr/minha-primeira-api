package com.example.demo.service;
import com.example.demo.model.Cliente;
import com.example.demo.repository.ClienteRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class ClienteService {
    private final ClienteRepository repository;
    public ClienteService(ClienteRepository repository) {
        this.repository = repository;
    }
    public Cliente salvar(Cliente cliente) {
        return repository.save(cliente);
    }
    public List<Cliente> listarTodos() {
        return repository.findAll();
    }
    public List<Cliente> buscarPorNome(String nome) {
        return repository.findByNome(nome);
    }
    public Optional<Cliente> buscarPorId(Long id) {
        return repository.findById(id);
    }
    public Optional<Cliente> atualizar(Long id, Cliente cliente) {
        if (!repository.existsById(id)) {
            return Optional.empty();
        }
        Cliente atualizado = new Cliente(
                id,
                cliente.nome(),
                cliente.idade()
        );
        return Optional.of(repository.save(atualizado));
    }
    public boolean excluir(Long id) {
        if (!repository.existsById(id)) {
            return false;
        }
        repository.deleteById(id);
        return true;
    }
}
