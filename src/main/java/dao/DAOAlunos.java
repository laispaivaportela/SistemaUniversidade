/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.Connection;
import java.sql.SQLException;
import model.Aluno;
import dao.AlunoDAO;
import static dao.AlunoDAO.conectar;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author laispaivaportela
 */

//classe para manipular dados no banco de dados
public class DAOAlunos {

    
    public DAOAlunos() {
       
    }
    
      public static void inserirAluno(String nome, int idade, String curso) {
        String sql = "INSERT INTO alunos (nome, idade, curso) VALUES (?, ?, ?)";
        try (
                Connection connection = AlunoDAO.conectar(); PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);) {
            stmt.setString(1, nome);
            stmt.setInt(2, idade);
            stmt.setString(3, curso);
            stmt.executeUpdate();
            //pega a matricula gerada automaticamente
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                int matriculaGerada = rs.getInt(1);
                System.out.println("Matrícula gerada: " + matriculaGerada);
                Aluno aluno = new Aluno(nome, idade, curso, matriculaGerada);
            }

        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static ResultSet listarAlunos() {
    String sql = "SELECT * FROM alunos"; 
    try {
        Connection connection = AlunoDAO.conectar();
        PreparedStatement stmt = connection.prepareStatement(sql);
        return stmt.executeQuery();
    } catch (SQLException ex) {
        Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
        return null;
    }
}


public static DefaultTableModel montarTabela(ResultSet rs) throws SQLException {
    DefaultTableModel model = new DefaultTableModel();
    ResultSetMetaData metaData = rs.getMetaData();
    int columnCount = metaData.getColumnCount();

    // Adiciona os nomes das colunas
    for (int column = 1; column <= columnCount; column++) {
        model.addColumn(metaData.getColumnName(column));
    }
     // Adiciona as linhas
    while (rs.next()) {
        Object[] row = new Object[columnCount];
        for (int i = 0; i < columnCount; i++) {
            row[i] = rs.getObject(i + 1);
        }
        model.addRow(row);
    }

    return model;
}

//Carrega um aluno pelo ID
    public Aluno buscarPorMatricula(int idPesquisado) {
        Connection connection = AlunoDAO.conectar();
        Aluno objeto = new Aluno();
        objeto.setMatricula(idPesquisado);
        try {
            Statement stmt = connection.createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM alunos WHERE matricula = " + idPesquisado);
            if (res.next()) {
                objeto.setMatricula(res.getInt("matricula"));
                objeto.setNome(res.getString("nome"));
                objeto.setIdade(res.getInt("idade"));
                objeto.setCurso(res.getString("curso"));
                return objeto;
            } else {
                return null;
            }
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
        }
        return null;
    }
    
    public static int contarTotalAlunos() {
    String sql = "SELECT COUNT(*) AS total FROM alunos";
    try (Connection connection = AlunoDAO.conectar();
         PreparedStatement stmt = connection.prepareStatement(sql);
         ResultSet rs = stmt.executeQuery()) {

        if (rs.next()) {
            return rs.getInt("total");
        }
    } catch (SQLException ex) {
        Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
    return 0; 
}
   public static void atualizarAluno(int matricula, String nome, int idade, String curso) {
    String sql = "UPDATE alunos SET nome = ?, idade = ?, curso = ? WHERE matricula = ?";
    try (Connection conn = conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {
        stmt.setString(1, nome);
        stmt.setInt(2, idade);
        stmt.setString(3, curso);
        stmt.setInt(4, matricula);
        int linhasAfetadas = stmt.executeUpdate();
        
        if (linhasAfetadas > 0) {
            System.out.println("Aluno atualizado com sucesso.");
        } else {
            System.out.println("Nenhum aluno encontrado com a matrícula: " + matricula);
        }
    } catch (SQLException e) {
        Logger.getLogger(DAOAlunos.class.getName()).log(Level.SEVERE, null, e);
    }
}


public static void deletarAluno(int matricula) {
    String sql = "DELETE FROM alunos WHERE matricula = ?";
    try (Connection conn = conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {
        stmt.setInt(1, matricula);
        int linhasAfetadas = stmt.executeUpdate();

        if (linhasAfetadas > 0) {
            System.out.println("Aluno removido com sucesso.");
        } else {
            System.out.println("Nenhum aluno encontrado com a matrícula: " + matricula);
        }
    } catch (SQLException e) {
        Logger.getLogger(DAOAlunos.class.getName()).log(Level.SEVERE, null, e);
    }
}

   
}
    

