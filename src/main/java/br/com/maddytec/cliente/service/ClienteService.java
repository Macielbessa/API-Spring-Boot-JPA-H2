package br.com.maddytec.cliente.service;


import br.com.maddytec.cliente.entity.Cliente;
import br.com.maddytec.cliente.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service //usado para decorar componentes da camada de serviço
public class ClienteService {
    @Autowired //importa automaticamente os beans dependentes
    private ClienteRepository clienteRepository;
//1 métodos
            public Cliente salvar(Cliente cliente) {
                return clienteRepository.save(cliente);
            }
//2 métodos
            public List<Cliente> listaCliente(){
                return clienteRepository.findAll(); // findAll retorna uma lista em string
            }
//3 métodos
            public Optional<Cliente> buscarPorId(Long id){
                return clienteRepository.findById(id);
            }
//4 método
            public void removerPorId(Long id){
                    clienteRepository.deleteById(id);
                }


}
