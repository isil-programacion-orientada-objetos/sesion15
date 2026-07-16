package com.lideratec;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertarAlumno {
    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/mi_basedatos";
        String user = "root";
        String password = "12345678";


        String sql = "INSERT INTO alumnos (nombre) VALUES (?)";

        try(
                Connection conn= DriverManager.getConnection(url, user, password);
                PreparedStatement ps = conn.prepareStatement(sql)
                ){

            ps.setString(1, "Brandom");
            int filas = ps.executeUpdate();

            System.out.println("Filas insertados: " +filas);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
