package br.spin.crud.repository;

import br.spin.crud.models.AtendimentoPersonalizado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AtendPersonalizadoRepository extends JpaRepository<AtendimentoPersonalizado, Integer> {
}
