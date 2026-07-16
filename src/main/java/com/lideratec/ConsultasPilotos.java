package com.lideratec;

import java.sql.*;

public class ConsultasPilotos {

    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/mi_basedatos";
        String user = "root";
        String password = "12345678";

        try (
                Connection conn = DriverManager.getConnection(url,user,password);
                Statement stmt = conn.createStatement()
        ){
            String sql = "SELECT * FROM pilotos";

            ResultSet rs = stmt.executeQuery(sql);

            while(rs.next()){
                System.out.println("ID: " + rs.getInt("id") +
                        " Nombre: " + rs.getString("nombre") + " escuderia: " + rs.getString("escuderia"));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
