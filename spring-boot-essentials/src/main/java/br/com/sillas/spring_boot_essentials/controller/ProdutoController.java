package br.com.sillas.spring_boot_essentials.controller;


import br.com.sillas.spring_boot_essentials.model.ProdutoModel;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/produtos")
@RequiredArgsConstructor ww

public class ProdutoController {

    @Autowired
    private ProdutoModel produtoModel;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public String findAll() {
        return "Lista de produtos";
    }
}
