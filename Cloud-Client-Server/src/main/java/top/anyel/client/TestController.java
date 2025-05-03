package top.anyel.client;

/*
 * Author: Anyel EC
 * Github: https://github.com/Anyel-ec
 * Creation date: 24/02/2025
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Value("${spring.datasource.username}")
    private String datasourceUsername;


    @Value("${hola}")
    private String hola;

    @GetMapping("/")
    public String index() {
        return hola;
    }

    @GetMapping("/test-connection")
    public String testConnection() {
        try {
            // Consulta simple para obtener la fecha y hora del servidor de BD
            String fechaBD = jdbcTemplate.queryForObject("SELECT NOW()", String.class);
            return "Conexión exitosa. Hora de la BD: " + fechaBD + " - Usuario: " + datasourceUsername + " - Hola: " + hola;
        } catch (Exception e) {
            return "Error al conectar a la BD: " + e.getMessage();
        }
    }
}