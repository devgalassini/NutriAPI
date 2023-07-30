package br.com.nutricao.api.service;

import br.com.nutricao.api.model.Nutricionista;
import br.com.nutricao.api.repository.NutricionistaRepository;
import org.springframework.beans.factory.annotation.Autowired;


public class CadastroNutricionista {
   @Autowired
   private NutricionistaRepository nutricionistaRepository;

   public void cadastro(Nutricionista nutricionista) {
       nutricionistaRepository.saveAndFlush(nutricionista);

   }
}

