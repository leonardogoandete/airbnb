package com.example.demo.controller.imovel;

import com.example.demo.beans.imovel.Imovel;
import com.example.demo.beans.imovel.ImovelCadastro;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class BuscaImovel {
    @RequestMapping(method = RequestMethod.GET, value = "/imovel/consulta")

    @ResponseBody
    public ArrayList<Imovel> getImoveisCadastrados(){
        return ImovelCadastro.getInstance().getImoveisCadastrados();
    }
}
