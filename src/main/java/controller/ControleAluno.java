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
import view.FrmSistemaUniversidade;
import view.FrmFichaAluno;
import java.util.ArrayList;
import java.util.List;
import static principal.Principal.CONTROLE_ALUNO;
import static principal.Principal.SISTEMA_UNIVERSIDADE;

public class ControleAluno {
    private DAOAlunos daoAlunos; //define o DAO
    private FrmSistemaUniversidade frmSistema;
    
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
