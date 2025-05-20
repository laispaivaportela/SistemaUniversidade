/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package controller;
//todos os imports possiveis
import javax.swing.JOptionPane;
import model.Aluno;
import view.FrmSistemaUniversidade;
import view.FrmFichaAluno;
import view.FrmGerenciaAluno;
import view.FrmCadastroAluno;
import view.FrmCadastroAluno;
import static principal.Principal.CONTROLE_ALUNO;
import static principal.Principal.SISTEMA_UNIVERSIDADE;

/**
 *
 * @author laispaivaportela
 */
public class SistemaUniversidade {
    private FrmSistemaUniversidade frmSistema;
    private ControleAluno CONTROLE_ALUNO;
    
    
    //inicia o sistema (deixa a tela inicial visivel)
    public void iniciarSistema(ControleAluno CONTROLE_ALUNO) { //liga a tela do sistema
        frmSistema = new FrmSistemaUniversidade();
        frmSistema.setVisible(true);
    }
    //escolhe qual tela abrir (baseado no menubar da classe view de sistema universidade do controller)
    public void executarAcao(int acao) {
    switch (acao) {
        case 0:
            System.exit(0);
            break;
        case 1:
            new FrmCadastroAluno().setVisible(true);
            break;
        case 2:
            new FrmGerenciaAluno().setVisible(true);
            break;
        case 3:
            new FrmFichaAluno().setVisible(true);
            break;
        default:
            JOptionPane.showMessageDialog(null, "Ação inválida.");
            break;
    }
}

    
       
    
}
