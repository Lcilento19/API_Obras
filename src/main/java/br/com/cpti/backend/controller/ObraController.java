package br.com.cpti.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.com.cpti.backend.entity.Cliente;
import br.com.cpti.backend.entity.Obra;
import br.com.cpti.backend.repository.ClienteRepository;
import br.com.cpti.backend.repository.ObraRepository;

import java.util.List;

@RestController
@RequestMapping("/obras")
public class ObraController {
	@Autowired
	private ObraRepository obraRepository;

	@Autowired
	private ClienteRepository clienteRepository;

	@PostMapping("/inserir")
	public Obra inserirObra(@RequestBody Obra obra) {
		return obraRepository.save(obra);
	}

	@GetMapping("/listar")
	public ResponseEntity<List<Cliente>> listarClientes() {
		List<Cliente> clientes = clienteRepository.findAll();
		if (clientes.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok(clientes);
	}

	public ObraRepository getObraRepository() {
		return obraRepository;
	}

	public void setObraRepository(ObraRepository obraRepository) {
		this.obraRepository = obraRepository;
	}

	public ClienteRepository getClienteRepository() {
		return clienteRepository;
	}

	public void setClienteRepository(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}
}
