/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author laispaivaportela
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class AlunoDAO {
    public static Connection conectar() {
        Connection connection = null;
        try {
            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);

            String url = "jdbc:mysql://localhost:3306/sistema_universidade_java";
            String user = "root";
            String senha = "me877757xl25M3355348S151.05458E@"; 

            connection = DriverManager.getConnection(url, user, senha);

            if (connection != null) {
                System.out.println("Status: Conectado!");
            } else {
                System.out.println("Status: NÃO CONECTADO!");
            }
            return connection;
        } catch (ClassNotFoundException e) {
            System.out.println("O driver nao foi encontrado.");
            e.printStackTrace(); //ajuda a depurar
            return null;
        } catch (SQLException e) {
            System.out.println("Nao foi possivel conectar...");
            e.printStackTrace(); //mostra o erro exato
            return null;
        }
    }

    
}



