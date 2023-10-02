package br.com.cpti.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.cpti.backend.entity.Obra;

public interface ObraRepository extends JpaRepository<Obra, Long> {
}
