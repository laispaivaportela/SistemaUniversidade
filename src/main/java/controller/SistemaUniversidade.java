/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package controller;
//todos os imports possiveis
import javax.swing.JOptionPane;
import view.FrmSistemaUniversidade;
import view.FrmFichaAluno;
import view.FrmGerenciaAluno;
import view.FrmCadastroAluno;
import view.FrmAlunos;
/**
 *
 * @author laispaivaportela
 */
public class SistemaUniversidade {
    private FrmSistemaUniversidade frmSistema;
    
    
    //inicia o sistema (deixa a tela inicial visivel)
    public void iniciarSistema(ControleAluno CONTROLE_ALUNO) { //liga a tela do sistema
        frmSistema = new FrmSistemaUniversidade();
        frmSistema.setVisible(true);
    }
    //escolhe qual tela abrir (baseado no menubar da classe view de sistema universidade do controller)
    public void executarAcao(int acao) {
    switch (acao) {
        case 0 -> System.exit(0);
        case 1 -> new FrmCadastroAluno().setVisible(true);
        case 2 -> new FrmGerenciaAluno().setVisible(true);
        case 3 -> new FrmFichaAluno().setVisible(true);
        case 4 -> new FrmAlunos().setVisible(true);
        default -> JOptionPane.showMessageDialog(null, "Ação inválida.");
    }
}

    
       
    
}
