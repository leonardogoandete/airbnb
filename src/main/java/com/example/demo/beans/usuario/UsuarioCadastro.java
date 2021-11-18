package com.example.demo.beans.usuario;

import java.util.ArrayList;


public class UsuarioCadastro {
    private ArrayList<Usuario> listaUsuarios;
    private static UsuarioCadastro comparador = null;


    // construtor
    public UsuarioCadastro() {
        listaUsuarios = new ArrayList<Usuario>();
    }

    public static UsuarioCadastro getInstance() {
        if(comparador == null){
            comparador = new UsuarioCadastro();
            return comparador;
        }else {
            return comparador;
        }
    }


    // adiciona User
    public void adiciona(Usuario usr){
            listaUsuarios.add(usr);
            System.out.println("Usuario adicionado: " + usr.getUser());
    }

    //retorna User
    public ArrayList<Usuario> getUsuariosCadastrados(){
        return listaUsuarios;
    }
}
