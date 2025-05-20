/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import controller.ControleAluno;
/**
 *
 * @author laispaivaportela
 */
import javax.swing.*;

public class Aluno extends Pessoa {
    private  String curso;
    private  String matricula;

    public Aluno() {
    }

    public Aluno(String nome, int idade, String curso, String id) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
        this.matricula = id;
        
    }

    public
    String getMatricula () {
        return matricula;
    }

    public
    void setMatricula (String matricula) {
        this.matricula = matricula;
    }

    public
    void setCurso (String curso) {
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    @Override
    public void lerDados() {
        super.lerDados();
        setCurso (JOptionPane.showInputDialog("Digite o curso: "));
        setMatricula (JOptionPane.showInputDialog ("Digite  o id")); //depois criar um metodo pra criar id aleatorio
    }

    @Override
    public String toString() {
        return String.format("Nome: %s\nIdade: %d\nCurso: %s\n", getNome (), super.getIdade(), getCurso());
    }

    @Override
    public void imprimeDados() {
        String dados = toString();
        JOptionPane.showMessageDialog(null, dados);
    }
}