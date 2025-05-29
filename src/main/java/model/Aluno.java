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

public class Aluno extends Pessoa {
    private  String curso;
    private  int matricula;

    public Aluno() {
    }

    public Aluno(String nome, int idade, String curso, int id) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
        this.matricula = id;
        
    }

    public
    int getMatricula () {
        return matricula;
    }

    public
    void setMatricula (int matricula) {
        this.matricula = matricula;
    }

    public
    void setCurso (String curso) {
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

  
}