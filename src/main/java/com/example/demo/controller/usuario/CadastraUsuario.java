package com.example.demo.controller.usuario;

import com.example.demo.beans.usuario.Usuario;
import com.example.demo.beans.usuario.UsuarioCadastro;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CadastraUsuario {

    @PostMapping("/usuario/cadastra")
    public void addUser(@RequestBody Usuario x){
        UsuarioCadastro.getInstance().adiciona(x);
    }

}
