package cap12;
import java.sql.*;
import javax.swing.*;
public class Conecta {
    public static void main(String[] args) {
        final String DRIVER = "com.mysql.jdbc.Driver";
        final String URL = "jdbc:mysql://localhost:3306/mysql";
        try {
            Class.forName(DRIVER);
            Connection connection = DriverManager.gerConnection(URL, "root", "123456");
            JOptionPane.showMessageDialog(null, "Driver não encontrado!\n"
            + erro.toString());
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Problemas na conexão com a fonte de dados\n"
            + erro.toString());
        }
    }

}