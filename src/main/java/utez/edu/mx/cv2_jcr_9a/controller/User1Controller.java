package utez.edu.mx.cv2_jcr_9a.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@CrossOrigin
public class User1Controller {
    @GetMapping()
    public String userMeesage(){
        return "Hola 1";
    }
}
