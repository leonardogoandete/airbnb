package com.example.demo.controller.imovel;

import com.example.demo.beans.imovel.Imovel;
import com.example.demo.beans.imovel.ImovelCadastro;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CadastraImovel {
        @PostMapping("/imovel/cadastra")
        public void addImovel(@RequestBody Imovel x) {
            ImovelCadastro.getInstance().adiciona(x);
        }
}
