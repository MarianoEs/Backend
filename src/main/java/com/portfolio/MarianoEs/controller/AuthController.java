package com.portfolio.MarianoEs.controller;
import com.portfolio.MarianoEs.model.Usuario;
import com.portfolio.MarianoEs.model.dto.UserDto;
import com.portfolio.MarianoEs.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    @Autowired
    AuthService service;
    
    @PostMapping("/iniciarsesion")
    public boolean login(@RequestBody UserDto userDto) {
        return service.isUserEnabled(userDto);
    }
    
    @PostMapping("/register")
    public void register(@RequestBody Usuario usuario) throws Exception {
        service.crearUsuario(usuario);
    }
}
