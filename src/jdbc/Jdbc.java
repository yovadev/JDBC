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
            
            // devolver informacion de la bd
            Statement estado = con.createStatement();
            ResultSet resultado = estado.executeQuery("Select * from agenda ORDER by id");
            
            System.out.println("ID \tNombre \t  \tTelefono \t");
            while (resultado.next()) { 
                System.out.println(resultado.getString("id")+"\t"+resultado.getString("nombre")+"\t\t"+resultado.getString("telefono"));
                
            }
            
            /** fin obtencion informacion de la informacion a la bd */
            
            
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
