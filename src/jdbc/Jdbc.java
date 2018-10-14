package jdbc;
/** importar la librerias para la conexion */
import java.sql.*;
/** busca en google "mysql java connector" y descargar el conector, opcion 
 * independiente de plataforma
 * agregar el archivo .jar en bibliotea
 * 
 * PROYECTO FUNCIONAL CON mysql-connector-java-8.0.12
 * 
 */

public class Jdbc {


    public static void main(String[] args) {
        try {
            System.out.println("Intentando conectar a la BD");
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con;
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/agendatelefonica?useTimezone=true&serverTimezone=UTC", "root", "");
            System.out.println("Conexion realiza con exito!");
        } catch (SQLException ex) {
            System.out.println("error mysql");
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        catch(Exception ex){
            System.out.println("Se ha encontrado un error es: "+ex.getMessage());
        }
    }

}
