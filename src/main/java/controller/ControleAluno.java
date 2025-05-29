/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author laispaivaportela
 */

//muitos imports
import dao.DAOAlunos;
import model.Aluno;


public class ControleAluno {
    public static final DAOAlunos daoAlunos = new DAOAlunos(); //define o DAO

    
    public ControleAluno() {
       // daoAlunos = new DAOAlunos(); //atribui o DAO (instancia)
    }

    public void cadastrarAluno(String nome, int idade, String curso) { //cadastra aluno a partir da entrada da classe view para cadastrar alunos
         daoAlunos.inserirAluno(nome, idade, curso);
    }
    
    public void atualizarAluno(int id, String nome, int idade, String curso) { //cadastra aluno a partir da entrada da classe view para cadastrar alunos
         daoAlunos.atualizarAluno(id, nome, idade, curso);
    }
    
    public void deletarAluno(int id) { //cadastra aluno a partir da entrada da classe view para cadastrar alunos
         daoAlunos.deletarAluno(id);
    }
    
    public Aluno buscarAlunoPorMatricula(int matricula) { //procura o aluno a partir do seu id (matricula)
        return daoAlunos.buscarPorMatricula(matricula);
    }
   
    
}
