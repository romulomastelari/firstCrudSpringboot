package noGroups.firstapi.controller;

import noGroups.firstapi.model.Usuario;
import noGroups.firstapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping()
    public List<Usuario> getUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/{username}")
    public Usuario getUserById(@PathVariable("username") String username) {
        return userRepository.findByUsername(username);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") Integer id) {
        userRepository.deleteById(id);
    }

    @PostMapping()
    public void postUser(@RequestBody Usuario usuario) {
        userRepository.save(usuario);
    }

    @PutMapping()
    public void putUser(@RequestBody Usuario usuario) {
        userRepository.save(usuario);
    }
}
