package com.asc.reparosmservice.data;

// Classe de dados para melhor visualização da troca de mensagens reais
public class Reparo {
    private Integer id;
    private String nome;

    public Reparo() 
    {
    }

    public Integer getId() {
        return id;
    };

    public String getNome() {
        return nome;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
