/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import model.Aluno;

/**
 *
 * @author laispaivaportela
 */
//classe para simular um banco de dados através de listas e arraylists
public class DAOAlunos {
    private final static List<Aluno> alunos = new ArrayList<>(); //declara a lista
    
    public DAOAlunos() {
        //alunos = new ArrayList<>(); //cria a lista e atribui 
    }
    
    public boolean inserir(Aluno aluno) { //adiciona o objeto à lista
        if (buscarPorMatricula(aluno.getMatricula()) != null) {
            return false; // Aluno já existe
        }
        alunos.add(aluno);
        return true;
    }
    
    public Aluno buscarPorMatricula(String matricula) { //encontra o objeto com id (matricula) correspondente
        for (Aluno a : alunos) {
            if (a.getMatricula().equals(matricula)) {
                return a;
            }
        }
        return null;
    }
    
    public static List<Aluno> listarTodos() { //lista todos os alunos cadastrados
        return new ArrayList<>(alunos);
    }
    
    
}
