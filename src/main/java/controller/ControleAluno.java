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
import model.Aluno;
import dao.DAOAlunos;
import java.util.List;

public class ControleAluno {
    private final DAOAlunos daoAlunos; //define o DAO
    
    public ControleAluno() {
        daoAlunos = new DAOAlunos(); //atribui o DAO (instancia)
    }
    
    
    
    
    public boolean cadastrarAluno(Aluno aluno) { //cadastra aluno a partir da entrada da classe view para cadastrar alunos
        return daoAlunos.inserir(aluno);
    }
    
    // Métodos para consultar
    public Aluno buscarAlunoPorMatricula(String matricula) { //procura o aluno a partir do seu id (matricula)
        return daoAlunos.buscarPorMatricula(matricula);
    }
    
    public List<Aluno> listarTodosAlunos() { //lista todos os alunos literalmente
        return daoAlunos.listarTodos();
    }
}
