/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora.controller;

import locadora.model.Ator;

/**
 *
 * @author artur
 */
public class AtorController {

    public boolean cadastroAtor(String nome, String nacionalidade) {
        if (nome != null && nome.length() > 0 && nacionalidade != null && nacionalidade.length() > 0) {
            Ator ator = new Ator(nome, nacionalidade);
            ator.cadastrarAtor(ator);
            return true;
        }
        return false;
    }
}
