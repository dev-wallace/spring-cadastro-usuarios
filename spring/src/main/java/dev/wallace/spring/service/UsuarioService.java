package dev.wallace.spring.service;

import java.util.List;

import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import dev.wallace.spring.dto.UsuarioDTO;
import dev.wallace.spring.model.Usuario;
import dev.wallace.spring.repository.UsuarioRepository;
@Service
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario salvar(Usuario usuario){
        return usuarioRepository.save(usuario);
        
    }


    public List<UsuarioDTO> listar(){
        return usuarioRepository.findAll().stream()
        .map(usuario -> new UsuarioDTO(usuario.getId(), usuario.getEmail()))
        .collect(Collectors.toList());
    }

 


}
