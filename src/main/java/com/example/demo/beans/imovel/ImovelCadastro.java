package com.example.demo.beans.imovel;

import java.util.ArrayList;

public class ImovelCadastro {

    private ArrayList<Imovel> listaImoveis;
    private static ImovelCadastro comparador = null;

    // construtor
    public ImovelCadastro(){
        listaImoveis = new ArrayList<Imovel>();
    }

    public static ImovelCadastro getInstance(){
        if (comparador == null){
            comparador = new ImovelCadastro();
            return comparador;
        }else {
            return comparador;
        }
    }

    //adiciona imovel
    public void adiciona(Imovel imv){
        if (imv.getTipo().equals("locatario")) {
            listaImoveis.add(imv);
            System.out.println("Imovel adicionado: " + imv.getNome());
        }else{
            System.out.println("Imovel não pode ser registrado por locador!");
        }
    }

    public ArrayList<Imovel> getImoveisCadastrados(){
        return listaImoveis;
    }
}
