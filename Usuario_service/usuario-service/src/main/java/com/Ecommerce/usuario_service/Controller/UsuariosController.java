package com.Ecommerce.usuario_service.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Ecommerce.usuario_service.Service.UsuarioService;
import com.Ecommerce.usuario_service.model.Usuario;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;






@RestController
@RequestMapping("/usuarios")
@RequiredArgsConstructor
public class UsuariosController {
    private final UsuarioService usuarioService;

    @PostMapping
    public Usuario crearUsuario(@RequestBody Usuario usuario) {

        return usuarioService.crearUsuario(usuario);
    }

    @GetMapping()
    public List<Usuario> getMethodName() {
        return usuarioService.obtenerUsuarios();
    }
    
    @GetMapping("/{id}")
    public Usuario ObtenerUsuarioPorId(@PathVariable Long id) {
        return usuarioService.obtenerUsuarioPorId(id);
    }
    
    
}
