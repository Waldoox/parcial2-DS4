package parcial2.parcial2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@SpringBootApplication
public class Parcial2Application {

	public static void main(String[] args) {
		SpringApplication.run(Parcial2Application.class, args);
	}

}

@RestController
class MyController {

    @GetMapping("/test")
    public String testDatabaseConnection() {
        try {
            // Establecer conexión a MariaDB
            Connection connection = DriverManager.getConnection(
                    "jdbc:mariadb://localhost:3306/nombredebd", "usuario", "contrasena");

            // Verificar la conexión exitosa
            if (connection != null) {
                return "Conexión exitosa a la base de datos";
            } else {
                return "Error al conectar a la base de datos";
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return "Error al conectar a la base de datos: " + e.getMessage();
        }
    }

}

