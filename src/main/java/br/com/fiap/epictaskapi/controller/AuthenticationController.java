package br.com.fiap.epictaskapi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.epictaskapi.model.LoginDto;

@RestController
public class AuthenticationController {

    @PostMapping("/api/auth")
    public ResponseEntity<Object> auth(@RequestBody LoginDto login){
        return ResponseEntity.ok().build();
    }

    
}
