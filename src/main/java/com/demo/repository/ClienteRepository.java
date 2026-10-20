package com.example.demo.repository;

import com.example.demo.model.Cliente;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Repository
public class ClienteRepository {

    private final Map<Long, Cliente> clientes = new LinkedHashMap<>();
    private long proximoId = 1;

    public Cliente salvar(Cliente cliente) {
        Long id = cliente.id();

        if (id == null) {
            id = proximoId++;
        }

        Cliente salvo = new Cliente(id, cliente.nome(), cliente.idade());
        clientes.put(id, salvo);

        return salvo;
    }

    public List<Cliente> listarTodos() {
        return new ArrayList<>(clientes.values());
    }

    public List<Cliente> buscarPorNome(String nome) {
        return clientes.values().stream()
                .filter(c -> c.nome() != null
                        && c.nome().equalsIgnoreCase(nome))
                .toList();
    }

    public Optional<Cliente> buscarPorId(Long id) {
        return Optional.ofNullable(clientes.get(id));
    }

    public boolean existePorId(Long id) {
        return clientes.containsKey(id);
    }

    public boolean excluir(Long id) {
        return clientes.remove(id) != null;
    }
}
