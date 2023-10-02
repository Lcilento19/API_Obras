package br.com.cpti.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cpti.backend.entity.Cliente;
import br.com.cpti.backend.repository.ClienteRepository;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
	@Autowired
	private ClienteRepository clienteRepository;

	@PostMapping("/inserir")
	public Cliente inserirCliente(@RequestBody Cliente cliente) {
		return clienteRepository.save(cliente);
	}

	public ClienteRepository getClienteRepository() {
		return clienteRepository;
	}

	public void setClienteRepository(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}
}
