package br.com.cpti.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.cpti.backend.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
