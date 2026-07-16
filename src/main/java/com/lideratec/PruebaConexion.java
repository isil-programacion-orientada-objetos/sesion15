package com.lideratec;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PruebaConexion {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mi_basedatos";
        String user = "root";
        String password = "12345678";

        try (Connection conn = DriverManager.getConnection(url,user,password)){
            System.out.println("Conexion establecida correctamente");
        }catch (SQLException e){
            System.out.println("Error al conectar a la BD");
            e.printStackTrace();
        }
    }
}
