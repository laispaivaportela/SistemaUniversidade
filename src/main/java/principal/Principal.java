/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package principal;

/**
 *
 * @author laispaivaportela 
 */
import controller.ControleAluno;
import controller.SistemaUniversidade;
import view.FrmSistemaUniversidade;

//sistema para simular um sistema de uma universidade para controle de alunos

public class Principal {
    public static final ControleAluno CONTROLE_ALUNO = new ControleAluno(); //instancia a classe ControleAluno (uma unica vez)
    public static final SistemaUniversidade SISTEMA_UNIVERSIDADE = new SistemaUniversidade(); //instancia a classe SistemaUniversidade (uma unica vez)
    
    public static void main(String[] args) {
        //começa a rodar
        SISTEMA_UNIVERSIDADE.iniciarSistema(CONTROLE_ALUNO);
    } 
}