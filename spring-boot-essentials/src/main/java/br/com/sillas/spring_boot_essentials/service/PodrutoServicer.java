package br.com.sillas.spring_boot_essentials.service;

import br.com.sillas.spring_boot_essentials.model.ProdutoModel;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service

public class PodrutoServicer {
    private static final List<ProdutoModel> PRODUTOS = List.of(
         ProdutoModel.builder()
              .id(1)
              .name("noteboock")
              .preco(new BigDecimal(500))
              .build()

        );

public List<ProdutoModel> findAll() {
        return new ArrayList<>(PRODUTOS);
    }
}
