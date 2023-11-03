package med.voll.api.controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import med.voll.api.domain.usuario.Usuario;
import med.voll.api.domain.usuario.UsuarioRepository;
import med.voll.api.usuario.DadosCadstroUsuario;
import med.voll.api.usuario.DadosDetalhamentoUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriBuilder;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/usuarios")

public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;



    @PostMapping
    @Transactional
    public ResponseEntity incluirUsuario(@RequestBody @Valid DadosCadstroUsuario dados, UriComponentsBuilder uriBuilder){
        var usuario = new Usuario(dados);
        repository.save(usuario);
        var uri = uriBuilder.path("/usuario/{id}").buildAndExpand(usuario.getId()).toUri();
        return ResponseEntity.created(uri).body(new DadosDetalhamentoUsuario(usuario));
    }
}
