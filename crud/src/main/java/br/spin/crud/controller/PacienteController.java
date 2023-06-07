package br.spin.crud.controller;

import br.spin.crud.models.Paciente;
import br.spin.crud.models.Unidade;
import br.spin.crud.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("pacientes")
public class PacienteController {

    @Autowired
    private PacienteRepository pacienteRepository;

    @GetMapping("/lista")
    private List<Paciente> listaPessoas() {
        return pacienteRepository.findAll();
    }

    @PostMapping("/cadastro")
    private Paciente salvarUnidade(@RequestBody Paciente paciente) {
        return pacienteRepository.save(paciente);
    }

    @DeleteMapping("/excluir/{id}")
    private void excluirPaciente(@PathVariable(name = "id") Integer id) {
        Paciente paci = pacienteRepository.findById(id).orElseThrow(
                () -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Paciente não encontrado: " + id)
        );
        paci.setIe_situacao("I");
        pacienteRepository.save(paci);
    }

}
