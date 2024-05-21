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
public class Filme {

    private Integer cod_filme;
    private String titulo;
    private String genero;
    private String sinopse;
    private Integer duracao;
    private ArrayList<Item> itens = new ArrayList<>();
    private ArrayList<Ator> arotes = new ArrayList<>();

    public Filme(String titulo, String genero, String sinopse, Integer duracao) {
        this.titulo = titulo;
        this.genero = genero;
        this.sinopse = sinopse;
        this.duracao = duracao;
    }

    public Integer getCod_filme() {
        return cod_filme;
    }

    public void setCod_filme(Integer cod_filme) {
        this.cod_filme = cod_filme;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }

    public ArrayList<Item> getItens() {
        return itens;
    }

    public void setItens(ArrayList<Item> itens) {
        this.itens = itens;
    }

    public ArrayList<Ator> getArotes() {
        return arotes;
    }

    public void setArotes(ArrayList<Ator> arotes) {
        this.arotes = arotes;
    }

    public void cadastrarFilme(Filme filme) {
    }

}
