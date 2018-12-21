package pers.chao.validation.api;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import pers.chao.validation.model.User;

import javax.validation.Valid;
import java.util.List;

/**
 * @author: WangYichao
 * @description:
 * @date: 2018/12/21 22:54
 */
@Controller
public class UserController {

    @PostMapping("/user/check")
    public ResponseEntity checkUser(@Valid User user, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            List<ObjectError> errors = bindingResult.getAllErrors();
            for (ObjectError error : errors) {
                System.out.println(error.getDefaultMessage());
            }
        }
        return ResponseEntity.ok(null);
    }
}
