/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author laispaivaportela
 */
import javax.swing.*;

public abstract class Pessoa {

    public String nome;
    public int idade;

    public
    Pessoa () {
        this.nome = "";
        this.idade = 0;
    }

    public
    int getIdade () {
        return idade;
    }

    public
    void setIdade (int idade) {
        this.idade = idade;
    }

    public
    String getNome () {
        return nome;
    }

    public
    void setNome (String nome) {
        this.nome = nome;
    }

}