package utez.edu.mx.cv2_jcr_9a;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@CrossOrigin
public class User2Controller {
    @GetMapping()
    public String userMessage(){
        return "hola 2";
    }
}
