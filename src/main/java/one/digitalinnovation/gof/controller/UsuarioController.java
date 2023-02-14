package one.digitalinnovation.gof.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import one.digitalinnovation.gof.model.Usuario;
import one.digitalinnovation.gof.repository.UserRepository;

import java.util.List;

@RestController
public class UsuarioController {
    @Autowired
    private UserRepository repository;

    @PostMapping("/usuarios")
    public void post(@RequestBody Usuario usuario){
        repository.save(usuario);
    }
    @PutMapping("/usuarios")
    public void put(@RequestBody Usuario usuario){
        repository.update(usuario);
    }
    @GetMapping("/usuarios")
    public List<Usuario> getAll(){
        return repository.listAll();
    }
    @GetMapping("/usuario/{id}")
    public Usuario getOne(@PathVariable("id") Integer id){
        return repository.finById(id);
    }
    @DeleteMapping("/usuarios/{id}")
    public void delete(@PathVariable("id") Integer id){
        repository.remove(id);
    }
}