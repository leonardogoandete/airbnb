package com.example.demo.controller.usuario;

import com.example.demo.beans.usuario.Usuario;
import com.example.demo.beans.usuario.UsuarioCadastro;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;


@Controller
public class BuscaUsuario {
    @RequestMapping(method = RequestMethod.GET, value="/usuario/consulta")

    @ResponseBody
    public ArrayList<Usuario> getUsuariosCadastrados(){
        return UsuarioCadastro.getInstance().getUsuariosCadastrados();
    }

}
