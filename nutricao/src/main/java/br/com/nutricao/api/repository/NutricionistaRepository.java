package br.com.nutricao.api.repository;

import br.com.nutricao.api.model.Nutricionista;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NutricionistaRepository
        extends JpaRepository <Nutricionista, Long> {


}
