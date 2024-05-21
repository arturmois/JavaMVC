/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora.model;

import java.util.ArrayList;

/**
 *
 * @author artur
 */
public class Ator {

    private Integer cod_ator;
    private String nome;
    private String nacionalidade;
    private ArrayList<Filme> filmes = new ArrayList<>();

    public Ator() {
    }

    public Ator(String nome, String nacionalidade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }

    public Integer getCod_ator() {
        return cod_ator;
    }

    public void setCod_ator(Integer cod_ator) {
        this.cod_ator = cod_ator;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public ArrayList<Filme> getFilmes() {
        return filmes;
    }

    public void setFilmes(ArrayList<Filme> filmes) {
        this.filmes = filmes;
    }

    public void cadastrarAtor(Ator ator) {

    }
}
