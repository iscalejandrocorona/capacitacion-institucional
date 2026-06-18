package capacitacion_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InicioController {

    @GetMapping("/")
    public String inicio() {
        return "Plataforma de Capacitación Institucional funcionando correctamente";
    }
}