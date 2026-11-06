package br.com.sillas.spring_boot_essentials.model;

import lombok.*;

import java.math.BigDecimal;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class ProdutoModel {
    private int id;
    private String name;
    private BigDecimal preco;


}
